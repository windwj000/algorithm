import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null) {
            return false;
        }
        int len1 = str.length;
        int len2 = pattern.length;
        boolean[][] dp = new boolean[len1 + 1][len2 + 1];
        dp[0][0] = true;
        for (int i = 1; i < len2; i++) {
            if (pattern[i] == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true;
            }
        }
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (pattern[j] == '*') {
                    if (pattern[j - 1] == '.' || str[i] == pattern[j - 1]) {
                        dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    }
                } else if (pattern[j] == '.' || str[i] == pattern[j]) {
                    dp[i + 1][j + 1] = dp[i][j];
                }
            }
        }
        return dp[len1][len2];
    }
}
