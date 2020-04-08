import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public boolean isContinuous(int[] numbers) {
        int len = numbers.length;
        if (numbers == null || len == 0 || len != 5)
            return false;
        int max = -1;
        int min = 14;
        int flag = 0;
        for (int n : numbers) {
            if (n == 0)
                continue;
            if (((flag >> n) & 1) == 1)
                return false;
            flag |= (1 << n);
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        return max - min < 5;
    }
}
