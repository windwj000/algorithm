import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int getMost(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0)
            return 0;
        int len = board[0].length;
        int[] dp = new int[len];
        for (int[] b : board) {
            dp[0] += b[0];
            for (int i = 1; i < len; i++) {
                dp[i] = Math.max(dp[i], dp[i - 1]) + b[i];
            }
        }
        return dp[len - 1];
    }
}
