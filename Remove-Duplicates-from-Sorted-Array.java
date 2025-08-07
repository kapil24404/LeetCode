class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if (n == 0) return 0;
        int count=1;
        int i=0,j=1;
        while(j<n){
            if(nums[i]!=nums[j]){
                count++;
                i++;
                nums[i]=nums[j];
                j++;
            }
            else j++;
        }
        return count;
    }
}