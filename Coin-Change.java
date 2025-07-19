class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int dp[][]=new int[n][amount+1];
         for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int result= helper(n-1,coins,amount,dp);
        return result >= (int)1e9 ? -1 : result;
    }
    public int helper(int i,int coins[],int amount,int dp[][]){
        if(i==0){
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            } else {
                return (int)1e9 ;
            }
        }
        if (dp[i][amount] != -1) return dp[i][amount];
        int n=coins.length;
        int nottake=helper(i-1,coins,amount,dp);
        int take=Integer.MAX_VALUE;
        if(coins[i]<=amount){
            take=1+helper(i,coins,amount-coins[i],dp);
        }
        dp[i][amount]=Math.min(nottake,take);
        return dp[i][amount];
    }
}