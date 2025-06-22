class Solution {
    public int majorityElement(int[] nums) {
       int count=0;
       int ele=nums[0];
       for(int i=0;i<nums.length;i++){
        if(ele==nums[i]){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            ele=nums[i+1];
        }
       } 
       return ele;
    }
}