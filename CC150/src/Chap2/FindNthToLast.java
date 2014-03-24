package Chap2;

public class FindNthToLast {
    public ListNode findNthToLast(ListNode head, int n) {
        ListNode nthToLast = null; 
        if(n <= 0) return nthToLast;
        ListNode node = head;
	int i;
        for(i = 0; i < n && node != null; i++) {
            node = node.next;
        }
        if(i == n) {
            nthToLast = head;
        }
        while(node != null) {
            nthToLast = nthToLast.next;
            node = node.next;
        }
        return nthToLast;
    }
}
