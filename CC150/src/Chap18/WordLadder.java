package Chap18;
import java.util.*;
public class WordLadder {
    public static List<List<String>> build(String start, String end, Set<S> dict) {
        List<List<String>> list = new ArrayList<>();
        //argcheck;
        int len = start.length();
        if(start.equals(end)) {
            List<String> sol = new ArrayList<>();
            sol.add(start);
            list.add(sol);
            return list;
        }
        Map<String, List<String>> parent = new HashMap<>();
        Set<String> cur = new HashSet<>();
        cur.add(start);
        Set<String> next = new HashSet<>();
        Set<String> prev = new HashSet<>();
        boolean found = false;
        while(!found) {//set max search depth a good idea?
            for(String str : cur) {
                for(int i = 0; i < len; i++) {
                    for(int j =0; j < 26; j++) {
                        StringBuilder s = new StringBuilder(str);
                        s.setCharAt(i, (char)('a'+j));
                        String word = s.toString();
                        if(dict.contains(word) && !prev.contains(word)) {
                            next.add(word);
                            if(!parent.containsKey(word)) {
                                parent.put(word, new ArrayList<>());
                            }
                            parent.get(word).add(str);
                        }
                        if(word.equals(end)) {
                            found = true;
                        }
                    }
                }
            }
            cur = next;
            prev.addAll(cur);
            next.clear();
        }
        recurSol(list, sol, parent, end, start);
        return list;
    }
    private static
    void recurSol(List<List<String>> list, List<String> sol,
              Map<String, List<String>> parent, String word, String start) {
        Deque<String> newSol = new ArrayDeque<>(sol);
        newSol.push(word);
        if(word.equals(start)) {
            list.add(new ArrayList<>(newSol));
        }else {
            List<String> parents = parent.get(word);
            for(String p : parents) {
                recurSol(list, sol, parent, p, start);
            }
        }
    }
}



