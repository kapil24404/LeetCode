class Solution {
    public String longestCommonPrefix(String[] str) {
         if (str == null || str.length == 0) return "";
         //int m=0;
         for(int i=0;i<str.length-1;i++){
            int m=0;//it is declare inside because reset of variable is required
            while(m < str[i].length() && m < str[i + 1].length() && str[i].charAt(m)==str[i+1].charAt(m)){
                m++;
            }
           
                str[i+1]=str[i+1].substring(0,m);
            
         }
        // for (int i = 0; i < str.length - 1; i++) {
        //     int j = 0;
        //     while (j < str[i].length() && j < str[i + 1].length() &&
        //            str[i].charAt(j) == str[i + 1].charAt(j)) {
        //         j++;
        //     }
        //     str[i + 1] = str[i + 1].substring(0, j);
        // }

         return str[str.length-1];
    }
}