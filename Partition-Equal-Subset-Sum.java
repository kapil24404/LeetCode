class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        else 
        return isSubsetSum(nums,sum/2);
    }
    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int n=arr.length;
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<dp.length;i++){
            dp[i][0]=true;
        }
         for(int i=1;i<dp[0].length;i++){
            dp[0][i]=false;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    dp[i][j]=dp[i-1][j-arr[i-1]]||dp[i-1][j];
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}