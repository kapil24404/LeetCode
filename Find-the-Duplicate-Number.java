class Solution {
    public int findDuplicate(int[] nums) {
    //    HashMap<Integer,Integer> hm=new HashMap<>();
    //    for(int i=0;i<nums.length;i++){
    //     if(!hm.containsKey(nums[i])){
    //         hm.put(nums[i],1);
    //     }
    //     else{
    //         return nums[i];
    //     }
    //    } 
    //    return 0;
    int slow = nums[0];
    int fast = nums[0];
        do {
            slow = nums[slow];       
            fast = nums[nums[fast]];  
        } while (slow != fast);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}