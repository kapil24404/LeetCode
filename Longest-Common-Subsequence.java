class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return LCS(text1,text2,m,n,dp);
    }
    public static int LCS(String t1,String t2,int m,int n,int dp[][]){
         if(m==0|| n==0){
                return 0;
            }
            if(dp[m][n]!=-1){
                return dp[m][n];
            }
         if(t1.charAt(m-1)==t2.charAt(n-1)){
            dp[m][n]= 1+LCS(t1,t2,m-1,n-1,dp);
         }
         else{
            dp[m][n]= Math.max((LCS(t1,t2,m-1,n,dp)),(LCS(t1,t2,m,n-1,dp)));
         }
        return  dp[m][n];
    }

}