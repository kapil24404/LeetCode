class FindSumPairs {
    int []nums1;
    int []nums2;
    Map<Integer,Integer> hm;
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1;
        this.nums2=nums2;
        hm=new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            hm.put(nums2[i],hm.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
       int oldVal = nums2[index];
        hm.put(oldVal, hm.get(oldVal) - 1);
        if (hm.get(oldVal) == 0) {
            hm.remove(oldVal);
        }
        nums2[index] += val;
        int newVal = nums2[index];
        hm.put(newVal, hm.getOrDefault(newVal, 0) + 1);    
    }
    
    public int count(int tot) {
        int counttot=0;
        for(int i=0;i<nums1.length;i++){
            int target=tot-nums1[i];
            if(hm.containsKey(target)){
                counttot+=hm.get(target);
            }
        }
        return counttot;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */