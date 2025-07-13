// 

class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        int INF = (int) 1e9;

        // base cases
        for (int i = 0; i <= n; i++) dp[i][0] = 0;
        for (int j = 1; j <= amount; j++) dp[0][j] = INF;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j) {
                    // include current coin (same i because unbounded)
                    dp[i][j] = Math.min(dp[i][j - coins[i - 1]] + 1, dp[i - 1][j]);
                } else {
                    // exclude current coin
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][amount] >= INF ? -1 : dp[n][amount];
    }
}
