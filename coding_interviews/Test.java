import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public boolean isMatch(String s, String p) {
        int len1 = s.length();
        int len2 = p.length();
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[len1][len2] = true;
        for (int i = len2 - 1; i >= 0; i--) {
            if (p.charAt(i) != '*') {
                break;
            } else {
                dp[s.length()][i] = true;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')
                    dp[i][j] = dp[i + 1][j + 1];
                else if (p.charAt(j) == '*')
                    dp[i][j] = dp[i + 1][j] || dp[i][j + 1];
                else
                    dp[i][j] = false;
            }
        }
        return dp[0][0];
    }
}
