import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Queue<Character> q = new LinkedList<>();
        for (char c : s.toCharArray()) {
            while (q.contains(c)) {
                q.poll();
            }
            q.offer(c);
            res = Math.max(res, q.size());
        }
        return res;
    }
}
