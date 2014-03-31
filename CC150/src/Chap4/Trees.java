package Chap4;
import java.util.Optional;
import java.util.Queue;
import java.util.ArrayDeque;
import java.lang.reflect.Field;
public class Trees {
    /* paranoid version of growTree using reflection, abandoned because it 
     * require to throw exceptions in test case
     */
    /*
    public static Optional<TreeNode> growTree(int[] A, int nullFlag) 
        throws Exception{
        if(A == null|| A.length == 0 || A[0] == nullFlag) {
            return Optional.empty();
        }
        TreeNode head = new TreeNode(A[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(head);
        int len = A.length;
        outerloop:
        for(int i = 1; i < len;) {
            TreeNode node = queue.poll();
            Field[] fields = node.getClass().getDeclaredFields();
            int lenF = fields.length;
            for(int j = 1; j < lenF; j++) {
                if(A[i] != nullFlag) {
                    fields[j].set(node, new TreeNode(A[i]));
                    queue.offer((TreeNode)fields[j].get(node));
                }
                i++;
                if(i == len) {
                    break outerloop;
                }
            }
        }
        return Optional.ofNullable(head);
    }
    */
    public static Optional<TreeNode> growTree(int[] A, int nullFlag) {
        if(A == null|| A.length == 0 || A[0] == nullFlag) {
            return Optional.empty();
        }
        TreeNode head = new TreeNode(A[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(head);
        int len = A.length;
        for(int i = 1; i < len; i++) {
            TreeNode node = queue.poll();
            if(A[i] != nullFlag) {
                node.left = new TreeNode(A[i]);
                queue.offer(node.left);
            }
            i++;
            if(i == len) {
                break;
            }
            if(A[i] != nullFlag) {
                node.right = new TreeNode(A[i]);
                queue.offer(node.right);
            }
        }
        return Optional.ofNullable(head);
    }


    public static void printTree(Optional<TreeNode> head, String nullSign) {
        Queue<Optional<TreeNode>> queue = new ArrayDeque<>();
        queue.offer(head);
        while(!queue.isEmpty()) {
            Optional<TreeNode> node = queue.poll();
            if(node.isPresent()) {
                System.out.print(node.get().val+" ");
                queue.offer(node.get().left());
                queue.offer(node.get().right());
            }else {
                System.out.print(nullSign+" ");
            }
        }
        System.out.println();
    }
}


        

