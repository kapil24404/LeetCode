class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder qs=new StringBuilder();
        for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch>='A' && ch<='Z' ||ch>='a' && ch<='z'|| ch>='0' &&ch<='9' ){
            qs.append(ch);
           }
        }
        if(qs.length()==1) return true;
        int n=qs.length();
        // for(int i=0;i<n/2;i++){
        //     if(qs.charAt(i)!=qs.charAt(n-1-i)) return false;
        // }
        String ans=qs.toString().toLowerCase();
        System.out.print(ans);
        int i=0,j=n-1;
        while(i<=j){
            if(ans.charAt(i)!=ans.charAt(n-1-i)) return false;
            else i++; j--;
        }
        return true;
    }
}