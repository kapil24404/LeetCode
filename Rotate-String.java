class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        // int n=s.length();
        // for(int i=0;i<n;i++){
        //     s+=s.charAt(i);
        // }
        // int m=0;
        // for(int i=0;i<s.length();i++){
        //     char ch1=s.charAt(i);
        //     char ch2=goal.charAt(i);
        //     while(m<s.length() && m<goal.length()){
        //         if(ch1==ch2){
        //             m=i;
        //         }
        //     }
        // }
        // System.out.println(m);
        // return false;
//************************************************************* */
        //1st approach easy

        // String doubled = s + s;
        // return doubled.contains(goal);

        //***************************** */
        //2nd approach

        
     for(int i = 0; i < s.length(); i++) {
            if(rotateString(s, goal, i)) {
                return true;
            }
        }
        return false;
    }
    public static boolean rotateString(String A, String B, int rotation) 
     {
        for(int i = 0; i < A.length(); i++)
        {
            if(A.charAt(i) != B.charAt((i+rotation)%B.length()))
            {
                return false;
            }
        }
        return true;
    }
}