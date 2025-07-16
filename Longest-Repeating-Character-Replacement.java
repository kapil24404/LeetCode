class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxlen=0;
        int n=s.length();
        int[] freq = new int[26];
        int maxCount=0;
        for(int right=0;right<n;right++){
            char ch=s.charAt(right);
            freq[ch - 'A']++;
            maxCount = Math.max(maxCount, freq[ch - 'A']);
            while ((right - left + 1) - maxCount > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}