class Solution {
    public int[] rearrangeArray(int[] nums) {


        //This is my approach but all the testcasses are not passed so i optimized this code


    //     int p=0,q=1;
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         if(nums[i]>0){
    //             if(nums[p]>0 && p<n){
    //                 p=p+2;
    //             }
    //             else{
    //                 swap(p,i,nums);
    //             }
    //         }
    //         else{
    //             if(nums[q]<0 && q<n){
    //                 q=q+2;
    //             }
    //             else{
    //                 swap(q,i,nums);
    //             }
    //         }
    //     }
    //     return nums;
    // }
    // public void swap(int p,int q,int nums[]){
    //     int temp=nums[p];
    //     nums[p]=nums[q];
    //     nums[q]=temp;
    // }



    /******************OPTIMIZED */


    int n=nums.length;
    int pos=0;int neg=1;
    int res[]=new int[n];
    for(int num:nums){
        if(num>0){
            res[pos]=num;
            pos+=2;
        }
        else{
            res[neg]=num;
            neg+=2;
        }
    }
    return res;
    }
}