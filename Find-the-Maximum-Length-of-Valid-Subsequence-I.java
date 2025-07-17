class Solution {
    public int maximumLength(int[] nums) {
        int evencount=0;
        int oddcount=0;
        int alternate=1;
        for(int num:nums){
            if(num%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }

        int parity=nums[0]%2;
        for(int i=1;i<nums.length;i++){
            int currparity=nums[i]%2;
            if(currparity!=parity){
                alternate++;
                parity=currparity;
            }
        }
        return Math.max(alternate,Math.max(oddcount,evencount));
    }
}