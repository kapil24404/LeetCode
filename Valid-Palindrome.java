class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'|| ch>='0' && ch<='9'){
                ans.append(ch);
            }
        }
        String res=ans.toString().toLowerCase();
        int n=res.length();
        System.out.println(res);
        int i=0,j=n-1;
        while(i<j){
            if(res.charAt(i)!=res.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}