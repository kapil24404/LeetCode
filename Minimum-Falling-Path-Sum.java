//thisis the memoization approach but this question is solved only with tabulation due to the stack overflow

//❗ Problem: Stack Overflow or TLE
// When using recursive memoization, Java can only handle about ~1000 to 2000 recursive calls before hitting a stack overflow, depending on the platform. If your matrix is very large (e.g., 2000 rows), then:

// The recursion depth becomes too large (O(n)), causing a StackOverflowError.

// Even with memoization, the overhead from recursive calls is too high for large matrices.

// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//         int m=matrix.length;
//         int n=matrix[0].length;
//         int dp[][]=new int[m][n];
//         for(int row[]:dp){
//             Arrays.fill(row,-1);
//         }
//         int min = Integer.MAX_VALUE;
//         for (int j = 0; j < n; j++) {
//             min = Math.min(min, helper(n - 1, j, matrix, dp));
//         }
//         return min;
//     }
//     public int helper(int m,int n,int matrix[][],int dp[][]){
//          int n1 = matrix.length;
//         if (n < 0 || n >= n1) return Integer.MAX_VALUE;
//          if (m == 0) return matrix[0][n];
//         if(dp[m][n]!=-1) return dp[m][n];
//         int up = helper(m- 1, n, matrix, dp);
//         int leftDiagonal = helper(m - 1, n- 1, matrix, dp);
//         int rightDiagonal = helper(m- 1, n+ 1, matrix, dp);
//         dp[m][n] = matrix[m][n] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
//         return dp[m][n];

//     }
// }

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] dp = new int[n][n];

        // Initialize first row
        for (int j = 0; j < n; j++) {
            dp[0][j] = matrix[0][j];
        }

        // Fill DP table
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int up = dp[i - 1][j];
                int leftDiagonal = (j > 0) ? dp[i - 1][j - 1] : Integer.MAX_VALUE;
                int rightDiagonal = (j < n - 1) ? dp[i - 1][j + 1] : Integer.MAX_VALUE;

                dp[i][j] = matrix[i][j] + Math.min(up, Math.min(leftDiagonal, rightDiagonal));
            }
        }

        // Find min in last row
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            min = Math.min(min, dp[n - 1][j]);
        }

        return min;
    }
}


