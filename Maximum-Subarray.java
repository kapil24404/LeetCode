class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            if(sum<0) sum=0;
            sum+=num;
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
}