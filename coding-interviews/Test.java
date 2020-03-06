import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        int[] dp = new int[index];
        dp[0] = 1;
        for (int i = 1, two = 0, three = 0, five = 0; i < index; i++) {
            dp[i] = Math.min(dp[two] * 2, Math.min(dp[three] * 3, dp[five] * 5));
            if (dp[i] == dp[two] * 2)
                two++;
            if (dp[i] == dp[three] * 3)
                three++;
            if (dp[i] == dp[five] * 5)
                five++;
        }
        return dp[index - 1];
    }
}
