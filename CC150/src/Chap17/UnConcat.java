package Chap17;
import java.util.*;
public class UnConcat {
    public static List<List<String>> list(String s, Set<S> dict) {
        List<List<Boolean>> dp1 = new AL<>();
        int len = s.length;
        for(int i= 0; i < len; i++) {
            dp1.add(new List<>());
            for(int j = 0; i+j <len; j++) {
                dp1.get(i).add(dict.contains(s.subString(i, j+1)));
            }
        }
        List<Integer> dp2 = new AL<>();
        for(int i = 0; i < len; i++) {
            if(dp1[0][i]) {
                dp2[i] = 0;
                continue;
            }
            int min = i++;
            for(int j = 0; j < i; j++) {
                if(dp1[j+1][i-j-1] && dp2[j] < min) {
                    min = dp2[j];
                }
            }
            dp2[i] = min;
        }
        List<List<String>> sols = new AL<>();
        Deque<String> row = new ArrayDeque<>();
        recurSol(sols, row, len-1);
        return sols;
    }
    private void recurSol(List<List<String>> sols, Deque<S> row, int i) {
        List<String> newRow = new List<>(row);
        boolean found = false;
        for(int j = 0; j < i; j++) {
            if(dp1.get(j+1).get(i-j-1) && dp2[j] == dp2[i]) {
                newRow.push(s.subString(j+1, i+1));
                found = true;
                recurSol(sols, newRow, j);
            }
        }
        if(dp2[i] == 0 || found == false) {
            sols.add(new AL<>(row));
        }
    }
}

