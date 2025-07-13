class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        Boolean dp[][]=new Boolean[n][sum+1];
        if(sum%2!=0) return false;
        else
        return helper(n-1,nums,sum/2,dp);
    }
    public static boolean helper(int i,int arr[],int sum,Boolean dp[][]){
        if(sum==0) return true;
        if(i==0) return (arr[0]==sum);
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean nottake=helper(i-1,arr,sum,dp);
        boolean take=false;
        if(sum>=arr[i]){
             take=helper(i-1,arr,sum-arr[i],dp);
        }
        dp[i][sum]=take||nottake;
        return dp[i][sum];
    }
}