package Chap4;
import java.util.*;
public class GrowBST {
    public static TreeNode growTree(int[] A) {
        /*
        TreeNode tree = growRawTree(A.length);
        inOrderAdd(tree, A);
        */
        if(A == null || A.length == 0) {
            return null;
        }
        TreeNode root = recurAdd(A, 0, A.length-1);
        return root;
    }
    private static TreeNode recurAdd(int[] A, int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = recurAdd(A, start, mid-1);
        root.right = recurAdd(A, mid+1, end);
        return root;
    }
    private static TreeNode growRawTree(int len) {
        if(len == 0) {
            return null;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode head = new TreeNode(0);
        queue.offer(head);
        for(int i = 1; i < len; i++) {
            TreeNode node = queue.poll();
            node.left = new TreeNode(0);
            queue.offer(node.left);
            i++;
            if(i == len) {
                return head;
            }
            node.right = new TreeNode(0);
            queue.offer(node.right);
        }
        return head;
    }
    private static void inOrderAdd(TreeNode head, int[] A) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        int i = 0;
        while(true) {
            if(head != null) {
                stack.push(head);
                head = head.left;
            }else if(!stack.isEmpty()) {
                head = stack.pop();
                head.val = A[i];
                i++;
                head = head.right;
            }else {
                break;
            }
        }
    }
}


