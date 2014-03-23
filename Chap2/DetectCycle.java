public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if(head == null|| head.next == null || head.next.next == null) {
            return null;
        }
        ListNode node1 = head;
        ListNode node2 = head;
        do {
            node1 = node1.next;
            node2 = node2.next.next;
            if(node1 == null || node2 == null) {
                return null;
            }
        }while(node1 != node2);
        node1 = head;
        while(node1 != node2) {
            node1 = node1.next;
            node2 = node2.next;
        }
        return node1;
    }
}


