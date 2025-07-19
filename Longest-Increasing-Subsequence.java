class Solution {
    // public int lengthOfLIS(int[] nums) {
    //     int n=nums.length;
    //     int dp[][]=new int[n][n+1];
    //     for(int rows[]:dp){
    //         Arrays.fill(rows,-1);
    //     }
    //     return helper(0,-1,nums,dp);
    // }
    // public static int helper(int i,int prev,int nums[],int dp[][]){
    //     int n=nums.length;
    //     if(i==n) return 0;
    //     int take=0,skip=0;
    //     if(dp[i][prev+1]!=-1) return dp[i][prev+1];
    //     if(prev==-1 ||nums[prev]<nums[i]){
    //         take=1+helper(i+1,i,nums,dp);
    //     }
    //     skip=helper(i+1,prev,nums,dp);
    //     dp[i][prev+1]=Math.max(take,skip);
    //     return dp[i][prev+1];
    // }
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[][]=new int[n+1][n+1];
        int skip=0;
        for(int i=n-1;i>=0;i--){
            for(int prev=n-1;prev>=-1;prev--){
                int take = 0;
                if(prev==-1 ||nums[prev]<nums[i]){
                    take=1+dp[i+1][i+1];
                }
                skip=dp[i+1][prev+1];
                dp[i][prev+1]=Math.max(take,skip);
            }
        }
        return dp[0][0];
    }
}