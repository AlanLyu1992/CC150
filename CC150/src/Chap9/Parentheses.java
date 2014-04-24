package Chap9;
import java.util.*;
public class Parenthesis {
    public static List<List<String>> Parentheses(int n) {
        //nullcheck;
        List<List<String>> cols = new ArrayList<>();
        List<String> zero = new ArrayList<>();
        zero.add("");
        cols.add(zero);
        for(int i = 1; i < n; i++) {
            List<String> row = new ArrayList<>();
            for(int j = 0; j < i; j++) {
                for(int k = 0; k < cols.get(j).size(); k++) {
                    for(int l = 0; l < cols.get(n-1-j).size(); l++){
                        StringBuilder pars = new StringBuilder();
                        row.add(pars.append("(")
                                    .append(cols.get(n-1-j).get(l))
                                    .append(")")
                                    .append(cols.get(j).get(k));
                                    .toString());
                    }
                }
            }
            cols.add(row);
        }
        return cols;
    }
}

