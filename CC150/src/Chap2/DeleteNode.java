package Chap2;

public class DeleteNode {
    public void deleteNode (ListNode node) {
        while(node.next != null) {
            node.val = node.next.val;
            if(node.next.next !=null) {
                node = node.next;
            }else {
                node.next = null;
            }
        }
    }
}
