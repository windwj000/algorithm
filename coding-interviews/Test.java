import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = num.length;
        if (num == null || len == 0 || size <= 0 || size > len)
            return res;
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 0; i < num.length; i++) {
            int begin = i - size + 1;
            if (!deque.isEmpty() && begin > deque.peekFirst())
                deque.pollFirst();
            while (!deque.isEmpty() && num[i] >= num[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offer(i);
            if (begin >= 0)
                res.add(num[deque.peekFirst()]);
        }
        return res;
    }
}
