package Chap18;
import java.util.*;
public class Last {
    public static List<String> find(List<String> words) {
        Map<Integer, Set<String>> wordsByLen = groupByLen(words);
        int maxLen = wordsByLen.size() + 1;
        //int maxLen = wordsByLen.keySet().stream().mapToInt(x->x).max();
        Trie[] tries = new Trie[maxLen];
        for(int area = maxLen*maxLen, area > 0; area--) {
            int threshold = (int)Math.floor(Math.sqrt(area));
            for(int len = maxlen; len >= threshold; len--) {
                if(area % len == 0 &&
                    (mat=checkMatrix(wordsByLen, len, area/len, tries))!=null) {
                    return mat;
                }
            }
        }
    }
    private static List<String> checkMatrix(Map<Integer, Set<String>> wordsByLen,
                                            int len, int ht, Trie[] tries) {
        if(tries[ht] == null) {
            tries[ht] = new Trie(wordsByLen.get(ht));
        }
        List<String> cur = new ArrayList<>();
        Set<String> remain = wordsBylen.get(len);
        return recurSol(cur, remain, tries[ht], len, ht);
    }
    private static List<String> recurSol(List<String> cur, Set<String> remain, 
                                         Trie trie, int len, int ht) {
        if(isValid(cur, trie)) {
            if(cur.size() = ht) {
                return cur;
            }else {
                for(String word: remain) {
                    List<String> newCur = new ArrayList<>(cur);
                    Set<String> newRemain = new HashSet<>(remain);
                    List<String> sol = recurSol(newCur, newRemain, trie, len, ht);
                    if(sol != null) {
                        return sol;
                    }
                }
                return null;
            }
        }
    }
    private static boolean isValid(List<String> words Trie trie) {
        int len = words.size();
        if(len == 0) return true;
        int lenW = words.get(0).size();
        for(int i = 0; i < lenW; i++) {
            StringBuilder s = new StringBuilder();
            for(int j =0; j < len; j++) {
                s.append(words.get(j).charAt(i));
            }
            if(!trie.match(s.toString())) {
                return false;
            }
        }
        return true;
    }
    private static Map<Integer, Set<String>> groupByLen(List<String> words) {
        Map<Integer, Set<String>> map = new HashMap<>();
        for(String word : words) {
            int len = word.length();
            map.putIfAbsent(len, new HashSet<>());
            map.get(len).add(word);
        }
        return map;
    }
}
                

