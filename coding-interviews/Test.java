import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int NumberOf1Between1AndN_Solution(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i *= 10) {
            int a = n / i;
            int b = n % i;
            if (a % 10 == 0)
                cnt += a / 10 * i;
            else if (a % 10 == 1)
                cnt += a / 10 * i + b + 1;
            else
                cnt += (a / 10 + 1) * i;
        }
        return cnt;
    }
}
