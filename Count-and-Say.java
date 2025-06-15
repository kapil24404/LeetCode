class Solution {
    public String countAndSay(int n) {
      if(n==1) return \1\;
      String say=countAndSay(n-1);
      StringBuilder ans=new StringBuilder();
      int i=0;
      while(i<say.length()){
        char ch=say.charAt(i);
        int count=0;
        while(i<say.length() && say.charAt(i)==ch){
            count++;
            i++;
        }
        ans.append(count).append(ch);
      }
    return ans.toString();
    }
}