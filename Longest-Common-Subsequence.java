class Solution {
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m=text1.length();
    //     int n=text2.length();
    //     int dp[][]=new int[m][n];
    //     for(int row[]:dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return helper(text1,text2,m-1,n-1,dp);
    // }
    // public static int helper(String text1, String text2,int m,int n,int dp[][]){
    //     if(m<0 ||n<0) return 0;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     else{
    //         if(text1.charAt(m)==text2.charAt(n)){
    //             dp[m][n]=1+helper(text1,text2,m-1,n-1,dp);
    //         }
    //         else{
    //             dp[m][n]=Math.max(helper(text1,text2,m-1,n,dp),helper(text1,text2,m,n-1,dp));
    //         }
    //     }
    //     return dp[m][n];
    // }

    //Tabulation

     public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}