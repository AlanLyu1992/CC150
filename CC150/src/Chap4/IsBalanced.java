package Chap4;
import java.util.Optional;
public class IsBalanced {
    public static boolean isBalanced(Optional<TreeNode> opt) {
        return !(height(opt) == -1);
    }
    private static int height(Optional<TreeNode> opt) {
        if(!opt.isPresent()) {
            return 0;
        }
        int left = height(opt.get().left());
        int right = height(opt.get().right());
        if(left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return 1 + Math.max(left, right);
    }
}

