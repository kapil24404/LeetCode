class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if (n == 0) return 0;
        if (n == 1) return nums[0];
        
        // Two cases: 
        // 1. Exclude the last house (rob houses from 0 to n-2)
        // 2. Exclude the first house (rob houses from 1 to n-1)
        
        // Case 1: Rob from 0 to n-2
        int[] dp1 = new int[n];
        for (int i = 0; i < n; i++) {  // Initialize dp1 with -1
            dp1[i] = -1;
        }
        int ans1 = maxprofit(nums, n-2, dp1, 0);
        
        // Case 2: Rob from 1 to n-1
        int[] dp2 = new int[n];
        for (int i = 0; i < n; i++) {  // Initialize dp2 with -1
            dp2[i] = -1;
        }
        int ans2 = maxprofit(nums, n-1, dp2, 1);
        
        // Return the maximum of both cases
        return Math.max(ans1, ans2);
    }

    public int maxprofit(int nums[], int n, int dp[], int start) {
        if (n < start) return 0;
        
        if (dp[n] != -1) return dp[n];  // Check if already computed
        
        if (n == start) {
            dp[n] = nums[start];
        } else {
            dp[n] = Math.max(nums[n] + maxprofit(nums, n-2, dp, start), 
                             maxprofit(nums, n-1, dp, start));
        }
        
        return dp[n];
    }
}