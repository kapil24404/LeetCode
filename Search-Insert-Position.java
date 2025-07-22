class Solution {
    public int searchInsert(int[] nums, int target) {
        return lowerboundbinary(0,nums.length,target,nums);
    } public static int lowerboundbinary(int start,int end,int target,int nums[]){
        int ans=end;
        while(start<end){
            int mid=start+(end-start)/2;
            if(target<=nums[mid]){
                ans=mid;
                end=mid;
            }
            else{
                
                start=mid+1;
            }
        }
        return ans;
    }
}