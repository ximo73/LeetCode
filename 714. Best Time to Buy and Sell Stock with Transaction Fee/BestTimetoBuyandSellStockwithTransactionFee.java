public class BestTimetoBuyandSellStockwithTransactionFee{
    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        int[] buy = new int[n]; //maximo beneficio al comprar
        int[] sell = new int[n];//maximo beneficio al vender
        
        buy[0] = -prices[0];
        sell[0] = 0;
        
        for(int i = 1; i < n; i++){
            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]); //maximo entre comprar y no comprar
            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee); //maximmo entre vender y no vender
        }
        
        return sell[n - 1];
    }

    public static void main(String[] args) {
        BestTimetoBuyandSellStockwithTransactionFee sol = new BestTimetoBuyandSellStockwithTransactionFee();
        int[] prices = {2,6,5};
        int fee = 1;
        System.out.println(sol.maxProfit(prices, fee));
    }
}
