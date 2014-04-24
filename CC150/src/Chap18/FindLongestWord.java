package Chap18;
import java.util.*;
public class FindLongestWord {
    public static String find(Set<String> words) {
        TreeMap<Integer, List<String>> wordsByLen = groupByLen(words);
        for(Integer len : wordsByLen.decendingKeySet()) {
            List<String> list = wordsByLen.get(len);
            for(String word : list) {
                if(isComposite(word, words)) {
                    return word;
                }
            }
        }
        return "";
    }
    private static TreeMap<Integer, List<String>> groupByLen(Set<String> words) {
        TreeMap<Integer, List<String>> map = new TreeMap<>();
        for(String word : words) {
            int lenW = word.length();
            List<String> list;
            if(!map.containsKey(lenW)) {
                list = new ArrayList<>();
            }else {
                list = map.get(word);
            }
            list.add(word);
            map.put(word,list);
        }
        return map;
    }
    private static boolean isComposite(String word, Set<String> words) {
        List<List<Boolean> dp1 = new ArrayList<>();
        int lenW = word.length();
        for(int i = 0; i < lenW; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j = 0; i+j < lenW; j++) {
                row.add(words.contains(word.substring(i, j+1));
            }
            dp1.add(row);
        }
        dp1.get(0).get(lenW-1) = false;//????
        Boolean[] = new Boolean[lenW];
        for(int i = lenW-1; i>=0; i--) {
            if(dp1.get(i).get(lenW-1-i)) {
                dp2[i] = true;
                continue;
            }
            for(int j = 0; i+j < lenW-1; j++) {
                if(dp1.get(i).get(j)&& dp2[i+j+1]) {
                    dp2[i] = true;
                }
            }
            dp2[i] = false;
        }
        return dp2[0];
    }
}

