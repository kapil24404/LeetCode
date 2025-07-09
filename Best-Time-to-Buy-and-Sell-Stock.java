class Solution {
    public int maxProfit(int[] prices) {
        int buykiya=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(buykiya<prices[i]){
                maxprofit=Math.max(maxprofit,prices[i]-buykiya);
            }
            else buykiya=prices[i];
        }
        return maxprofit;
    }
}