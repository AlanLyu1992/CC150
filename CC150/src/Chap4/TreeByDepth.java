package Chap4;
import java.util.*;
public class TreeByDepth {
    /*
    public static LinkedList<LinkedList<TreeNode>> 
                  treeByDepth(TreeNode head) {
        LinkedList<LinkedList<TreeNode>> list = new LinkedList<>();
        if(head == null) return list;
        LinkedList<TreeNode> row = new LinkedList<>();
        int nextNum = 0;
        int curNum = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(head);
        int i = 0;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            row.add(node);
            i++;
            if(node.left != null) {
                queue.offer(node.left);
                nextNum++;
            }
            if(node.right != null) {
                queue.offer(node.right);
                nextNum++;
            }
            if(i == curNum) {
                i = 0;
                curNum = nextNum;
                nextNum = 0;
                list.add(row);
                row = new LinkedList<>();
            }
        }
        return list;
    }
    */
    public static LinkedList<LinkedList<TreeNode>>
                  treeByDepth(TreeNode root){
        LinkedList<LinkedList<TreeNode>> list = new LinkedList<>();
        if(root == null) {
            return list;
        }
        LinkedList<TreeNode> curr = new LinkedList<>();
        curr.add(root);
        while(curr.size() > 0) {
            list.add(curr);
            LinkedList<TreeNode> prev = curr;
            curr = new LinkedList<>();
            for(TreeNode node : prev) {
                if(node.left != null) {
                    curr.add(node.left);
                }
                if(node.right != null) {
                    curr.add(node.right);
                }
            }
        }
        return list;
    }
}
