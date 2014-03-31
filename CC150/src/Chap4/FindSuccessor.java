package Chap4;
public class FindSuccessor {
    public static TreeNode findSuccessor(TreeNode start) {
        if(start == null) return null;
        if(start.right != null) {
            TreeNode node = start.right;
            while(node.left != null) {
                node = node.left;
            }
            return node;
        }
        while(true) {
            if(start.father == null) return null;
            if(start.father.left == start) return start.father;
            start = start.father;
        }
    }
}
