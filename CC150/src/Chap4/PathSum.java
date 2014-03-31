package Chap4;
import java.util.*;
public class PathSum {
    public static List<List<Integer>> pathSum(TreeNode p, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        find(p, 0, path, 0, list, sum);
        return list;
    }
    private static void find(TreeNode p, int prev, List<Integer> path,
                             int level, List<List<Integer>> list, int sum) {
        if(p == null) {
            return;
        }
        if(level == path.size()) {
            path.add(p.val);
        }else {
            path.set(level, p.val);
        }
        prev = p.val + prev;
        if(prev == sum) {
            list.add(new ArrayList<>(path));
        }
        find(p.left, prev, path, level+1, list, sum);
        find(p.right, prev, path, level+1, list, sum);
    }
}
