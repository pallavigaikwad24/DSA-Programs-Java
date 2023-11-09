public class BuySellStocks {

    public static int buySellStock(int prices[]) {
        int buyPrice = 0;
        // int sellPrice = 0;
        int currentProfit = 0;
        int maxProfit = 0;

        buyPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                currentProfit = prices[i] - buyPrice;
            }

            maxProfit = Math.max(currentProfit, maxProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };

        System.out.println(buySellStock(prices));
    }

}
