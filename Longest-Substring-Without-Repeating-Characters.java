class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int left=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            if(hm.containsKey(ch)){
               left=Math.max(left,hm.get(ch)+1);
            }
                hm.put(ch,right);
                int len=right-left+1;
                maxlen=Math.max(maxlen,len);

            // hm.put(ch,hm.getOrDefault(ch,0)+1);
            // if(hm.get(ch)==1){
            //     int len=right-left+1;
            //     maxlen=Math.max(maxlen,len);
            // }
            // else{
            //     // int leftmost=hm.get(left);
            //     hm.put(ch,hm.get(ch)-1);
            //     left++;
            // }
        }
        return maxlen;
    }
}