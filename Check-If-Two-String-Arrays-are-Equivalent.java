class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        // StringBuilder str1=new StringBuilder();
        // StringBuilder str2=new StringBuilder();
        // for(int i=0;i<word1.length;i++){
        //     str1.append(word1[i]);
        // }
        // for(int i=0;i<word2.length;i++){
        //     str2.append(word2[i]);
        // }
        // return str1.toString().equals(str2.toString());

        int i=0,j=0,w1=0,w2=0;
        int m=word1.length,n=word2.length;
        while(w1<m&& w2<n){
            if(word1[w1].charAt(i)!=word2[w2].charAt(j)){
                return false;
            }
            i++; j++;
            if(i==word1[w1].length()){
                i=0;
                w1++;
            }
            if(j==word2[w2].length()){
                j=0;
                w2++;
            }
        }
        return w1 == word1.length && w2 == word2.length;
    }
}