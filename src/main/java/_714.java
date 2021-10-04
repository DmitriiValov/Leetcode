
/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/">714. Best Time to Buy and Sell Stock with Transaction Fee</a>
 */

public class _714 {

    public static class Solution {
        public int maxProfit(int[] prices, int fee) {
            int n = prices.length;
            if(n == 1) return 0;
            int[] dp = new int[n];
            int maxProfitAfterBuyingInPast = -prices[0];
            for(int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], maxProfitAfterBuyingInPast + prices[i] - fee);
                maxProfitAfterBuyingInPast = Math.max(maxProfitAfterBuyingInPast, dp[i - 1] - prices[i]);
            }
            return dp[n - 1];
        }
    }
}
