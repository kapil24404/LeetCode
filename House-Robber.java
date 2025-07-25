class Solution {
    // public int rob(int[] nums) {
    //     int n=nums.length;
    //     int dp[]=new int[n+1];
    //     Arrays.fill(dp,-1);
    //     return helper(n-1,nums,dp);
    // }
    // public static int helper(int i,int nums[],int dp[]){
    //     if(i==0) return nums[0];
    //     if(i==1) return Math.max(nums[0],nums[1]);
    //     if(dp[i]!=-1) return dp[i];
    //     dp[i]=Math.max(nums[i]+helper(i-2,nums,dp),helper(i-1,nums,dp));
    //     return dp[i];
    // }
     public int rob(int[] nums) {
        int n=nums.length;
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}