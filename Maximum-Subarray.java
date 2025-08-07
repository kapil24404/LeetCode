class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(sum<0) sum=0;
            sum+=nums[i];
             maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}