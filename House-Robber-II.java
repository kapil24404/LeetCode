class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp1[]=new int[n+1];
        Arrays.fill(dp1,-1);
        int ans1=helper(0,n-2,nums,dp1);

         int dp2[]=new int[n+1];
        Arrays.fill(dp2,-1);
        int ans2=helper(1,n-1,nums,dp2);
        int res=Math.max(ans1,ans2);
        return res;
    }
    public int helper(int start,int end,int nums[],int dp[]) {
        if(start>end) return 0;
        if(dp[start]!=-1) return dp[start];
        dp[start]=Math.max(nums[start]+helper(start+2,end,nums,dp),helper(start+1,end,nums,dp));
        return dp[start];
    }  
}