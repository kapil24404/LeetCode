class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zeroes=i;
                break;
            }
        }
        if(zeroes==-1) return;
        for(int j=zeroes+1;j<n;j++){
            if(nums[j]!=0){
                swap(zeroes,j,nums);
                zeroes++;
            }
            // else if(nums[zeroes]==nums[j]){
            //     zeroes++;
            // }
        }
    }
    public static void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}