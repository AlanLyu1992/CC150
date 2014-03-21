import java.util.HashMap;
import java.util.Map;
public class IsAnagram {
    static boolean isAnagram(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if(len1 !=len2) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < len1; i++) {
            char c = s1.charAt(i);
            if(map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        for(int i = 0; i < len2; i++) {
            char c = s2.charAt(i);
            if(map.containsKey(c)) {
                if(map.get(c) >1 ) {
                    map.put(c, map.get(c)-1);
                }else {
                    map.remove(c);
                }
            }else {
                return false;
            }
        }
        return map.size() == 0;
    }
    public static void main(String[] args) {
        String[] A = {"", "a","aa","abc", "aabbbc", "aabbbc"};
        String[] B = {"", "a","aa","cba", "aabbcc", "bcabab"};
        for(int i = 0; i < A.length; i++) {
            System.out.println(isAnagram(A[i], B[i]));
        }
    }
}
