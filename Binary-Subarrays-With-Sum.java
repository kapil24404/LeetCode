class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums, goal) - atMost(nums, goal - 1);
    }
    static int atMost(int[] nums, int S) {
        if (S < 0) return 0; 
        int left = 0, sum = 0, count = 0;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum > S) {
                sum -= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}
