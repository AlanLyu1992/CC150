package Chap4;
public class CommonAncestor {
    /*
    public static TreeNode commonAncestor(TreeNode node1,
                                          TreeNode node2) {
        if(node1 == null || node2 == null) {
            return null;
        }
        if(hasNode2(node1.left, node2) || hasNode2(node1.right, node2)) {
            return node1;
        }
        while(node1.father != null) {
            if(node1.father == node2 ||
               node1.father.left == node1 && hasNode2(node1.father.right, node2) ||
               node1.father.right== node1 && hasNode2(node1.father.left, node2)) {
                return node1.father;
            }else {
                node1 = node1.father;
            }
        }
        return null;
    }
    */
    public static TreeNode commonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) {
            return null;
        }
        if(root == p) {
            if(hasNode2(root.left, q) || hasNode2(root.right, q)) {
                return root;
            }else {
                return null;
            }
        }
        if(root == q) {
            if(hasNode2(root.left, p) || hasNode2(root.right, p)) {
                return root;
            }else {
                return null;
            }
        }
        TreeNode left = commonAncestor(root.left, p, q);
        if(left != null) {
            return left;
        }
        TreeNode right = commonAncestor(root.right, p, q);
        if(right != null) {
            return right;
        }
        return null;
    }
    public static boolean hasNode2(TreeNode node, TreeNode node2) {
        if(node == null) {
            return false;
        }
        if(node == node2) {
            return true;
        }
        return hasNode2(node.left, node2)||hasNode2(node.right, node2);
    }
}
