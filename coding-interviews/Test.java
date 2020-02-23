import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int MoreThanHalfNum_Solution(int[] array) {
        if (array == null || array.length == 0)
            return 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int n : array) {
            m.put(n, m.getOrDefault(n, 0) + 1);
            if (m.get(n) > array.length / 2)
                return n;
        }
        return 0;
    }
}
