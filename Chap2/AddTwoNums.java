public class AddTwoNums {
    public ListNode AddTwoNums(ListNode num1, ListNode num2) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        int carry = 0;
        while(true) {
            int sum;
            if(num1 != null &&  num2 != null) {
                sum = num1.val + num2.val +carry;
                num1 = num1.next;
                num2 = num2.next;
            }else if(num1 != null) {
                sum = num1.val +carry;
                num1 = num1.next;
            }else if(num2 != null) {
                sum = num2.val + carry;
                num2 = num2.next;
            }else {
                if(carry == 1) {
                    node.next = new ListNode(carry);
                }
                break;
            }
            carry = sum /10 ;
            int digit = sum % 10;
            node.next = new ListNode(digit);
            node = node.next;
        }
        return head.next;
    }
}
