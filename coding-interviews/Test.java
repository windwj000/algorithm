public class Test {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode tmp = ReverseList(head.next);
        head.next.next = head;
        head.next = null;
        return tmp;
    }
}
