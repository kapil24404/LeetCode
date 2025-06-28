class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        //****************WITH EXTRA SPACE */
        // int i=0;
        // int j=0,k=0;
        // int temp[]=new int[m+n];
        // while(i<m && j<n){
        //     if(nums1[i]<=nums2[j]){
        //         temp[k]=nums1[i];
        //         k++;
        //         i++;
        //     }
        //     else{
        //         temp[k]=nums2[j];
        //         j++;
        //         k++;
        //     }
        // }
        // while(i<m){
        //     temp[k++]=nums1[i++];
        // }
        // while(j<n){
        //     temp[k++]=nums2[j++];
        // }
        // for(int t=0;t<k;t++){
        //     nums1[t]=temp[t];
        // }

        //****************WITHOUT EXTRA SPACE */
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]<=nums2[j]){
                nums1[k--]=nums2[j--];
            }
            else{
                nums1[k--]=nums1[i--];
            }
        }
        while(i>=0){
            nums1[k--]=nums1[i--];
        }
         while(j>=0){
            nums1[k--]=nums2[j--];
        }

    }
}