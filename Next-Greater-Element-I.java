class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        Map<Integer,Integer> hm=new HashMap<>();
        int n=nums2.length;
        st.push(nums2[n-1]);
        int res[]=new int[n];
        res[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() &&nums2[i]>=st.peek()){
                st.pop();
            }
            res[i]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i]);
        }
        for(int i=0;i<n;i++){
            hm.put(nums2[i],res[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=hm.get(nums1[i]);
        }
        return nums1;
    }
}