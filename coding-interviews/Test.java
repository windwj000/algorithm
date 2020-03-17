import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null)
            return null;
        ListNode last = pHead1;
        while (last.next != null) {
            last = last.next;
        }
        last.next = pHead2;
        ListNode slow = pHead1;
        ListNode fast = pHead1;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                fast = pHead1;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                last.next = null;
                return slow;
            }
        }
        last.next = null;
        return null;
    }
}
