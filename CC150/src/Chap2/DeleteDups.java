package Chap2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class DeleteDups {
    void deleteDup(ListNode head) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        int len = getLength(head);
        if(len == 0) return;
        int m = (int)(Math.log(len)/Math.log(2));
        for(int i = 0; i <= m; i++) {
            int step = 1 << i;
            int n = len >> (1 << (i+1));
            int r = len-(n << (i+1));
            head = preHead;
            for(int j = 0; j < n; j++) {
                head = mergeSort(head, step, step);
            }
            if(r > step) {
                mergeSort(head, step, r-step);
            }
        }
        head = preHead.next;
        while(head.next != null) {
            if(head.val != head.next.val) {
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
    }
    int getLength(ListNode head) {
        int len = 0;
        while(head != null) {
            head = head.next;
            len++;
        }
        return len;
    }
    ListNode mergeSort(ListNode head, int step1, int step2) {
        ListNode head1 = head;
        ListNode head2 = head;
        for(int k = 0; k < step1; k++) {
            head2 = head2.next;
        }
        int i = 0;
        int j = 0;
        while(i < step1 && j < step2) {
            if(head1.next.val > head2.next.val) {
                ListNode temp = head2.next;
                head2.next = temp.next;
                temp.next = head1.next;
                head1.next = temp;
                j++;
            }else {
                i++;
            }
            head1 = head1.next;
        }
        for(int k = 0; k < step2-j; k++) {
            head2 = head2.next;
        }
        return head2;
    }
}
