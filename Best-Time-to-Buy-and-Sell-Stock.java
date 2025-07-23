class Solution {
    public int maxProfit(int[] prices) {
        int buykro=prices[0];
        int maxprice=0;
        for(int i=1;i<prices.length;i++){
            if(buykro<prices[i]){
                maxprice=Math.max(maxprice,prices[i]-buykro);
            }
           else buykro=prices[i]; 
            
        }
        return maxprice;
    }
}