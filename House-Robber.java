class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n-1,nums,dp);
    }
    public static int helper(int i,int nums[],int dp[]){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0],nums[1]);
        if(dp[i]!=-1) return dp[i];
        dp[i]=Math.max(nums[i]+helper(i-2,nums,dp),helper(i-1,nums,dp));
        return dp[i];
    }
}