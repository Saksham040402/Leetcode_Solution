class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode c1 = head;
        ListNode c2 = head.next;
        ListNode c3 = c2.next;
        c1.next = c3;
        c2.next = c1;
        if(c3 != null)
        c1.next = swapPairs(c3);
        return c2;
    }
}
