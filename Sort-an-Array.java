// // class Solution {

// //     //Bubble sort**********************************************

// //     // public int[] sortArray(int[] nums) {
// //     //     int n=nums.length;
// //     //     for(int i=0;i<n-1;i++){
// //     //         for(int j=0;j<n-i-1;j++){
// //     //             if(nums[j]>nums[j+1]){
// //     //                 swap(j,j+1,nums);
// //     //             }
// //     //         }
// //     //     }
// //     //     return nums;
// //     // }
  


// // //selection sort******************************************
// // //     public int[] sortArray(int[] nums) {
// // //         int n=nums.length;
// // //         for(int i=0;i<n-1;i++){
// // //             int smallest=i;
// // //             for(int j=i+1;j<n;j++){
// // //                 if(nums[j]<nums[smallest]){
// // //                     smallest=j;
// // //                 }
// // //             }
// // //             swap(i,smallest,nums);
// // //         }
// // //         return nums;
// // // }

// // //Insertion Sort /*************************** */
// //     // public int[] sortArray(int[] nums) {
// //     //         int n=nums.length;
// //     //         for(int i=1;i<n;i++){
// //     //             int j=i;
// //     //             while(j>0 && nums[j]<nums[j-1]){
// //     //                 swap(j,j-1,nums);
// //     //                 j--;
// //     //             }
// //     //         }
// //     //         return nums;
// //     // }


// //     //quick sort
// //       public static void swap(int i,int j,int nums[]){
// //         int temp=nums[i];
// //         nums[i]=nums[j];
// //         nums[j]=temp;
// //     }
// //     public static int partition(int arr[],int start,int end){
// //         int pivot=arr[end];
// //         int i=start-1;
// //         for(int j=start;j<end;j++){
// //             if(arr[j]<pivot){
// //                 i++;
// //                 swap(i,j,arr);
// //             }
// //         }
// //         i++;
// //         swap(i,end,arr);
// //         return i;
// //     }
// //     public static void quicksort(int arr[],int start,int end){
// //         if(start<end){
// //             int pindx=partition(arr,start,end);
// //             quicksort(arr,start,pindx-1);
// //             quicksort(arr,pindx+1,end);
// //         }
// //     }

// //     public int[] sortArray(int[] nums) {
// //             int n=nums.length;
// //             quicksort(nums,0,n-1);
// //             return nums;
// //     }
// // }

// import java.util.Random;

// class Solution {
//     Random rand = new Random();

//     public int[] sortArray(int[] nums) {
//         quicksort(nums, 0, nums.length - 1);
//         return nums;
//     }

//     private void quicksort(int[] arr, int start, int end) {
//         if (start < end) {
//             int pivotIndex = randomizedPartition(arr, start, end);
//             quicksort(arr, start, pivotIndex - 1);
//             quicksort(arr, pivotIndex + 1, end);
//         }
//     }

//     private int randomizedPartition(int[] arr, int start, int end) {
//         int randIndex = start + rand.nextInt(end - start + 1);
//         swap(arr, randIndex, end); // random pivot
//         return partition(arr, start, end);
//     }

//     private int partition(int[] arr, int start, int end) {
//         int pivot = arr[end];
//         int i = start - 1;

//         for (int j = start; j < end; j++) {
//             if (arr[j] <= pivot) {
//                 i++;
//                 swap(arr, i, j);
//             }
//         }

//         swap(arr, i + 1, end);
//         return i + 1;
//     }

//     private void swap(int[] arr, int i, int j) {
//         if (i != j) {
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }
// }



class Solution {

    //Bubble sort
    // public int[] sortArray(int[] nums){
    //     int n=nums.length;
    //     for(int i=0;i<n-1;i++){
    //         boolean swapped=false;
    //         for(int j=0;j<n-i-1;j++){
    //             if(nums[j]>nums[j+1]){
    //                 swap(j,j+1,nums);
    //                 swapped=true;
    //             }
    //         }
    //          if(!swapped) break;
    //     }
    //     return nums;
    // } 


    //selection 

    // public int[] sortArray(int[] nums){
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         int minidx=i;
    //         for(int j=i;j<n;j++){
    //             if(nums[j] < nums[minidx]){
    //                 minidx=j;
    //             }
    //         }
    //         swap(minidx,i,nums);
    //     }
    //     return nums;
    // }

    //Insertion sort
    // public int[] sortArray(int[] nums){
    //     int n=nums.length;
    //     for(int i=1;i<n;i++){
    //         int j=i;
    //         while(j>0 && nums[j]<nums[j-1]){
    //             swap(j,j-1,nums);
    //             j--;
    //         }
    //     }
    //     return nums;
    // }

    //mergesort
public int[] sortArray(int[] nums){
    int n=nums.length;
    mergesort(0,n-1,nums);
    return nums;
}
public static void mergesort(int left,int right,int nums[]){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(left,mid,nums);
            mergesort(mid+1,right,nums);
            merge(left,mid,right,nums);
        }
    }
public static void merge(int left,int mid,int right,int nums[]){
        int temp[]=new int[right-left+1];
        int i=left;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=right)
        {
            if(nums[i]<=nums[j]){
                temp[k++]=nums[i++];
            }
            else{
                temp[k++]=nums[j++];
            }
        }
        while(i<=mid){
            temp[k++]=nums[i++];
        }
        while(j<=right){
            temp[k++]=nums[j++];
        }
        for (int x = 0; x < temp.length; x++) {
        nums[left + x] = temp[x];
    }
    }


    public static void swap(int left,int right,int nums[]){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}









