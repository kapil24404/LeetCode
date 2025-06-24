class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                k=i;
                break;
            }
        }
        int ans1=binarysearch(nums,0,k,target);
        if(ans1!=-1) return ans1;
        int ans2=binarysearch(nums,k+1,n-1,target);
        return ans2;

    }
    public int binarysearch(int []nums,int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}