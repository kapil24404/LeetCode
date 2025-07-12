class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            List<Integer> row = triangle.get(i);
            for(int j=0;j<=i;j++){
                arr[i][j]=row.get(j);
            }
        }
        int dp[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
               dp[i][j]=-1;
            }
        }
        return helper(0,0,arr,dp);
    }
    public int helper(int i,int j,int arr[][],int dp[][]){
        int n=arr.length;
        if(i==n-1) return arr[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int down=helper(i+1,j,arr,dp);
        int diagonal=helper(i+1,j+1,arr,dp);
        dp[i][j]=arr[i][j]+Math.min(down,diagonal);
        return dp[i][j];
    }
}