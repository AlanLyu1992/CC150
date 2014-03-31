package Chap4;
import java.util.*;
public class IsSubTree {
    public static boolean isSubTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> exp = MorrisPreOrder(q);
        int[] next =  genNext(exp);
        int i = 0;
        int len = exp.size();
        while(p != null) {
            if(p.left == null) {
                i = findNext(i, p.val, exp, next);
                if(i == len) {
                    return true;
                }
                i = findNext(i, null, exp, next);
                if(i == len) {
                    return true;
                }
                p = p.right;
            }else {
                TreeNode s = p.left;
                while(s.right != null && s.right != p) {
                    s = s.right;
                }
                if(s.right == null) {
                    s.right = p;
                    i = findNext(i, p.val, exp, next);
                    if(i == len) {
                        return true;
                    }
                    p = p.left;
                }else {
                    s.right = null;
                    p = p.right;
                }
            }
        }
        return false;
    }
    private static ArrayList<Integer> MorrisPreOrder(TreeNode p) {
        ArrayList<Integer> exp = new ArrayList<>();
        while(p != null) {
            if(p.left == null) {
                exp.add(p.val);
                exp.add(null);
                p = p.right;
            }else {
                TreeNode s = p.left;
                while(s.right != null && s.right != p) {
                    s = s.right;
                }
                if(s.right == null) {
                    s.right = p;
                    exp.add(p.val);
                    p = p.left;
                }else {
                    s.right = null;
                    p = p.right;
                }
            }
        }
        return exp;
    }
    private static int[] genNext(ArrayList<Integer> exp) {
        if(exp == null || exp.isEmpty()) {
           return new int[0];
        } 
        int len = exp.size();
        int[] next = new int[len];
        next[0] = 0;
        int j = 0;
        for(int i = 1; i < len; i++) {
            while(!exp.get(i).equals(exp.get(j))) {
                if(j == 0) {
                    j--;
                    break;
                }
                j = next[j-1];
            }
            j++;
            next[i] = j;
        }
        return next;
    }
    private static int findNext(int i, Integer val, ArrayList<Integer> exp,
                            int[] next) {
        while(!val.equals(exp.get(i))) {
            if(i == 0) {
                i--;
                break;
            }
            i = next[i-1];
        }
        i++;
        return i;
    }
}


                    

        
