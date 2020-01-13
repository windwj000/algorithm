public class Test {
    public boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        boolean[][] dp = new boolean[str.length + 1][pattern.length + 1];
        dp[0][0] = true;
        for (int i = 1; i < pattern.length; i++) {
            if (pattern[i] == '*' && dp[0][i - 1])
                dp[0][i + 1] = true;
        }
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                if (pattern[j] == '*') {
                    if (pattern[j - 1] == '.' || str[i] == pattern[j - 1])
                        dp[i + 1][j + 1] = dp[i][j + 1] || dp[i + 1][j - 1];
                    else
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                } else if (pattern[j] == '.' || str[i] == pattern[j])
                    dp[i + 1][j + 1] = dp[i][j];
            }
        }
        return dp[str.length][pattern.length];
    }
}
