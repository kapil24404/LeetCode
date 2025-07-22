class Solution {
    public int search(int[] nums, int target) {
        return binary(0,nums.length,target,nums);
    }
    public static int binary(int start,int end,int target,int nums[]){
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) return mid;
            if(target<nums[mid]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
}