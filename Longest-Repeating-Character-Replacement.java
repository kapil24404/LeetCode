class Solution {
    public int characterReplacement(String s, int k) {
     int maxlen=0;
     int n=s.length();
     int left=0;
     int maxfreq=0;
     HashMap<Character,Integer> hm=new HashMap<>();
     for(int right=0;right<n;right++){
        char ch=s.charAt(right);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,hm.get(ch));
        int len=right-left+1;
        if(len-maxfreq>k){
            char leftChar = s.charAt(left);
            hm.put(leftChar, hm.get(leftChar) - 1);
            left++;
        } 
        maxlen=Math.max(maxlen,right-left+1);
    }
     return maxlen;
    }
}