class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;

        ListNode head = new ListNode();
        ListNode ans = head;
        while (l1 != null && l2 != null) {
            ListNode temp = new ListNode();
            int sum = l1.val + l2.val + carry;
            carry = sum / 10;
            temp.val = sum % 10;
            ans.next = temp;
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            ListNode temp = new ListNode();
            int sum = l1.val + carry;
            carry = sum / 10;
            temp.val = sum % 10;
            ans.next = temp;
            ans = ans.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode temp = new ListNode();
            int sum = l2.val + carry;
            carry = sum / 10;
            temp.val = sum % 10;
            ans.next = temp;
            ans = ans.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            ListNode temp = new ListNode();
            temp.val = carry;
            ans.next = temp;
        }

        return head.next;
    }
}