class Solution {
    public int maxAscendingSum(int[] nums) {
         int currsum=nums[0];
        int maxsum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]>nums[i-1]){
                currsum+=nums[i];
            }
            else {
                currsum=nums[i];
            }
            maxsum=Math.max(maxsum,currsum);
        }
        return maxsum;
    }
}