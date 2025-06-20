class Solution {
    public String reverseWords(String s) {
        String []ch=s.split(" +");
        StringBuilder ans=new StringBuilder();
        for(int i=ch.length-1;i>=0;i--){
            ans.append(ch[i]);
            if(i!=0){
                ans.append(" ");
            }
        }
        return ans.toString().trim();
    }
}