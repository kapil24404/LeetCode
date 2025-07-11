class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1||obstacleGrid[m - 1][n - 1] == 1) return 0;
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m -1,n-1,obstacleGrid,dp);
    }
     public int helper(int m,int n,int obstacleGrid[][],int dp[][]){
        if(m<0 ||n<0) return 0;
        if(m==0 && n==0) return 1;
        if (obstacleGrid[m][n] == 1) return 0;
        if(dp[m][n]!=-1) return dp[m][n];
        dp[m][n]=helper(m-1,n,obstacleGrid,dp)+helper(m,n-1,obstacleGrid,dp);
        return dp[m][n];
    }
}