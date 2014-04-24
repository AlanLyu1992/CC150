package Chap18;
public class Distance {
    static Map<String, List<Integer>> map = null;
    public static void init() {
        if(map != null) {
            File f = new File("book.txt");
            Scanner reader = new Scanner(f);
            map = new HashMap<>();
            int i = 0;
            while(reader.hasNext()) {
                String word = reader.next();
                if(!map.containsKey(word)) {
                    map.put(word, new ArrayList<>());
                }
                map.get(word).add(i);
                i++;
            }
        }
    }
    public static int distance(String word1, String word2) {
        if(word1.equals(word2)) {
            //if they are same word, return the shortest distance of two occurrence
            int min = (1<<31)-1;
            List<Integer> list = map.get(word1);
            int len = list.size();
            for(int i = 0; i+1 < len; i++){
                int dist = list.get(i+1)-list.get(i);
                if(dist < min) {
                    min = dist;
                }
            }
            return min;
        }else {
            List<Integer> list1 = map.get(word1);
            List<Integer> list2 = map.get(word2);
            if(list1 == null || list2 == null) {
                return (1<<31)-1;
            }
            if(list1.size() > list2.size()) {
                List<Integer> temp = list1;
                list1 = list2;
                list2 = temp;
            }
            int len = list1.size();
            int min = (1<<31)-1;
            for(int i = 0; i < len; i++) {
                Integer pos = list1.get(i);
                Integer idx = Collections.binarySearch(list2, pos);
                idx = -idx-1;
                int dist1 = (1<<31)-1;
                int dist2 = dist1;
                if(idx > 0) {
                    dist1 = num - list2.get(idx-1);
                }
                if(idx < list2.size()) {
                    dist2 = list2.get(idx)-num;
                }
                int minDist = Math.min(dist1, dist2);
                if(minDist < min) {
                    min = minDist;
                }
            }
            return min;
        }
    }
}

