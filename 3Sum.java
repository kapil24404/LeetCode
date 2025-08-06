// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
// //*************************************** BRUTE FORCE*****************************************/


//         // Set<List<Integer>> res=new HashSet<>();
//         //  int n=nums.length;
//         //  for(int i=0;i<n;i++){
//         //     for(int j=i+1;j<n;j++){
//         //         for(int k=j+1;k<n;k++){
//         //             if(nums[i]+nums[j]+nums[k]==0){
//         //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
//         //                 Collections.sort(triplet); 
//         //                 res.add(triplet);
//         //             }
//         //         }
//         //     }
//         //  }
//         //  return new ArrayList<>(res);


//         //*********Optimal  ************* */
//         Arrays.sort(nums);
//         List<List<Integer>> res=new ArrayList<>();
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             if(i>0 && nums[i]==nums[i-1]) continue;
//             int j=i+1;
//             int k=n-1;
//         while(j<k){
//             int sum=nums[i]+nums[j]+nums[k];
//             if(sum==0){
//                 res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                 j++;
//                 k--;
//                 while (j < k && nums[j] == nums[j - 1]) j++;
//                 while (j < k && nums[k] == nums[k + 1]) k--;
//             }
//             else if(sum<0){
//                 j++;
//             }
//             else{
//                 k--;
//             }
//         }
//     }
//         return res;
//     }
// }

//now

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//*************************************** BRUTE FORCE*****************************************/


        // Set<List<Integer>> res=new HashSet<>();
        //  int n=nums.length;
        //  for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(triplet); 
        //                 res.add(triplet);
        //             }
        //         }
        //     }
        //  }
        //  return new ArrayList<>(res);


        //*********Optimal  ************* */
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
        while(j<k){
            int sum=nums[i]+nums[j]+nums[k];
            if(sum==0){
                res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) j++;
                while (j < k && nums[k] == nums[k + 1]) k--;
            }
            else if(sum<0){
                j++;
            }
            else{
                k--;
            }
        }
    }
        return res;
    }
}