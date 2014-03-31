package Chap4;
import java.util.Optional;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode father;
    public TreeNode(int x) {
        val = x;
    }
    public Optional<TreeNode> left() {
        return Optional.ofNullable(left);
    }
    public Optional<TreeNode> right() {
        return Optional.ofNullable(right);
    }
    public Optional<TreeNode> father() {
        return Optional.ofNullable(father);
    }
}
