package Chap4;
import java.util.Optional;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int x) {
        val = x;
    }
    public Optional<TreeNode> left() {
        return Optional.ofNullable(left);
    }
    public Optional<TreeNode> right() {
        return Optional.ofNullable(right);
    }
}
