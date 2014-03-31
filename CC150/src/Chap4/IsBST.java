package Chap4;
import java.util.*;
public class IsBST {
    public static boolean isBST(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        Integer prev = Integer.MIN_VALUE;
        Integer curr;
        while(true) {
            if(root != null) {
                stack.push(root);
                root = root.left;
            }else if(!stack.isEmpty()) {
                root = stack.pop();
                curr = root.val;
                if(curr <= prev) {
                    return false;
                }
                prev = curr;
                root = root.right;
            }else {
                return true;
            }
        }
    }
}
