class Solution {
    public String reverseWords(String s) {
        String t=s.trim();
        String ans[]=t.split("\\s+");
        String res="";
        for(int i=ans.length-1;i>=0;i--){
            res+=ans[i];
            if(i!=0){
                res+=" ";
            }
        }


        return res;
    }
}