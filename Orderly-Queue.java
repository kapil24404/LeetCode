class Solution {
    public String orderlyQueue(String s, int k) {
        if(k>1){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
        }
       String ans=s;
       int n=s.length();
       for(int i=1;i<=n-1;i++){
        String temp=s.substring(i)+s.substring(0,i);
        if (temp.compareTo(ans) < 0) {
                ans = temp;
            }
       } 
       return ans;
    }
}