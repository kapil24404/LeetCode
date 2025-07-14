class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int rows[]:dp){
            Arrays.fill(rows,-1);
        }
        return helper(m-1,n-1,obstacleGrid,dp);
    }
     public static int helper(int m,int n,int nums[][],int dp[][]){
        if(m<0 || n<0) return 0;
        if(nums[m][n]==1) return 0;
        if(m == 0 && n == 0) return nums[0][0] == 1 ? 0 : 1;
        if(dp[m][n]!=-1) return dp[m][n];
        int left=helper(m,n-1,nums,dp);
        int up=helper(m-1,n,nums,dp);
        dp[m][n]=up+left;
        return dp[m][n];
    }
}