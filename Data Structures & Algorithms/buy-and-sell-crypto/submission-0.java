class Solution {
    public int maxProfit(int[] prices) {
        int price = 0 ;
        int maxPrice = Integer.MIN_VALUE, minPrice = Integer.MAX_VALUE;

        for (int i = 0 ;i < prices.length ;i++){
            minPrice = Math.min(minPrice, prices[i]);
            price = prices[i] - minPrice ;
            maxPrice = Math.max(price, maxPrice);
        }
        return maxPrice;
    }
}
