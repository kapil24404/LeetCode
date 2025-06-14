class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int n=s.length();
        int freq[]=new int[26];
        int ind1=0,ind2=0;
        while(ind1<n && ind2< n){
            char ch1=s.charAt(ind1);
            int freqA=ch1-97;
            freq[freqA]+=1;
            char ch2=t.charAt(ind2);
            int freqB=ch2-97;
            freq[freqB]-=1;
            ind1++;
            ind2++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}