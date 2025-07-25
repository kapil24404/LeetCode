class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }
    public static int helper(int i,int dp[]){
        if(i==0 ||i==1) return 1;
        if (i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        dp[i]=helper(i-1,dp)+helper(i-2,dp);
        return dp[i];
    }
}