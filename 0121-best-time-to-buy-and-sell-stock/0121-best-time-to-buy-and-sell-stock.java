class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;
        for (int price : prices){
            minBuy = Math.min(price, minBuy);
            maxProfit = Math.max(price-minBuy, maxProfit);
        }
        return maxProfit;
    }
}