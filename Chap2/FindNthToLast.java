public class FindNthToLast {
    public ListNode findNthToLast(ListNode head, int n) {
        ListNode nthToLast = null; 
        if(n <= 0) return nthToLast;
        ListNode node = head;
        for(int i = 0; i < n && node != null; i++) {
            node = node.next;
        }
        if(i == n) {
            nthToLast = head;
        }
        while(node != null) {
            nthtoLast = nthToLast.next;
            node = node.next;
        }
        return nthToLast;
    }
}
