/**
 * Created by alex on 19/7/2017.
 */
public class LeetCode121_BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int[] minPrice = new int[prices.length];
        int[] dp = new int[prices.length];
        minPrice[0] = prices[0];
        for(int i = 1 ; i < prices.length; i ++) {
            System.out.print(prices[i]);
            if( minPrice[i - 1] > prices[i] ) {
                minPrice[i] = prices[i];
            } else {
                minPrice[i] = minPrice[i - 1];
            }
        }

        for (int a: minPrice
             ) {
            System.out.print(" ");
            System.out.print(a);
            System.out.print(" ");
        }

        dp[0] = 0;
        for (int i = 1; i < prices.length; i ++) {
            dp[i] = Math.max(prices[i] - minPrice[i], dp[i - 1]);
        }
        return dp[prices.length -1];

    }


    public static void main(String[] args) {
        int [] price = {7,1,5,3,6,4};
        LeetCode121_BestTimeToBuyAndSellStock.maxProfit(price);
    }
}
