import java.util.*;

public class Test {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> hs = new HashSet<>();
        while (pHead1 != null) {
            hs.add(pHead1);
            pHead1 = pHead1.next;
        }
        while (pHead2 != null) {
            if (hs.contains(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }
}
