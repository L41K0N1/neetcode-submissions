class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];

        int maxProfit = 0;

        for(int i = 1; i < prices.length; i++) {
            int todayProfit = prices[i] - minPrice;

            if (todayProfit > maxProfit) {
                maxProfit = todayProfit;
            }
            
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }

        }
        return maxProfit;
    }
}
