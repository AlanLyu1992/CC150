package Chap9;
import java.util.*;
public class Permutation {
    public static List<List<String>> Permutation (String s) {
        List<List<String>> cols = new ArrayList<>();
        if(s = null || s.length() == 0) {
            return cols;
        }
        SB rem = new SB(s);
        SB perms = new SB();
        find(cols, perms, rem, 0, 0);
        return cols;
    }
    private static void find(List<String> cols, SB perms, SB rem, int i, int j) {
        SB newPerms = new SB(perms);
        SB newRem = new SB(rem);
        newPerms.add(rem.charAt(j));
        newRem.remove(newRem.size()-1);
        if(i == s.length()) {
            cols.add(newPerms);
        }else {
            find(cols, newPerms, newRem, i+1,0);
        }
        if(j+1 < rem.length) {
            find(cols, perms, rem, i, j+1);
        }
    }
}
