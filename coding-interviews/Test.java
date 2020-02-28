import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if (array == null || len == 0)
            return 0;
        int[] dp = new int[len];
        dp[0] = array[0];
        int max = array[0];
        for (int i = 1; i < len; i++) {
            dp[i] = array[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
