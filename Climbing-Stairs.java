class Solution {
    // public int climbStairs(int n) {
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return helper(n,dp);
    // }
    // public static int helper(int i,int dp[]){
    //     if(i==0 ||i==1) return 1;
    //     if (i<0) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     dp[i]=helper(i-1,dp)+helper(i-2,dp);
    //     return dp[i];
    // }


    //tabulation

    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
   
}