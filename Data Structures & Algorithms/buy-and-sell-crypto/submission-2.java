class Solution {
    public int maxProfit(int[] price) {
        int lp = 0 ;
        int rp = 1;
        int maxProfit = 0;
        while(rp < price.length){
            if(price[lp] < price[rp]){
                int profit = price[rp] - price[lp];
                maxProfit = Math.max(maxProfit,profit);
            }            
            else{
                lp = rp;
            }
            rp++;
        }
        return maxProfit;
    }
}
