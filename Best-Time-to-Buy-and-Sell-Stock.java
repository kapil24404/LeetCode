class Solution {
    public int maxProfit(int[] prices) {
        int maxprice=0;
        int bestbuy=prices[0];
        int n=prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]>bestbuy){
                maxprice=Math.max(maxprice,prices[i]-bestbuy);
            }
            else{
                bestbuy=Math.min(bestbuy,prices[i]);
            }
        }
        return maxprice;

    }
}