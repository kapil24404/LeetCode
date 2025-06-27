class Solution {
    public void sortColors(int[] nums) {
       int low=0;
       int mid=0;
       int n=nums.length;
       int high=n-1;
       while(mid<=high){
        if(nums[mid]==0){
            swap(mid,low,nums);
           low++;
           mid++;
        }
        else if(nums[mid]==2){
            swap(mid,high,nums);
            high--;
        }
        else{
            mid++;
        }
       }
    }
      public void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
       }
}