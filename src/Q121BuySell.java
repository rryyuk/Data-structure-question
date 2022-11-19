public class Q121BuySell {
    public int maxProfit(int[] prices) {
        int buyingPrice = prices[0];
        int profit = 0;
        int currentConditionProfit = 0;

        for(int i = 0; i< prices.length; i++) {
            if(prices[i] < buyingPrice) {
                buyingPrice = prices[i];
            }

            currentConditionProfit = prices[i] - buyingPrice;

            if(currentConditionProfit > profit) {
                profit = currentConditionProfit;
            }
        }
        return profit;
    }
}
