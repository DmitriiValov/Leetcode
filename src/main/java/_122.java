/**
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/">122. Best Time to Buy and Sell Stock II</a>
 */

public class _122 {

    public static class Solution {
        public int maxProfit(int[] prices) {
            if (prices.length <= 1) {
                return 0;
            }
            int max = 0;
            int prevValue = prices[0];
            boolean bought = false;
            int price = 0;
            for (int i = 1; i < prices.length; ++i) {
                if (prevValue < prices[i] && !bought) {
                    bought = true;
                    price = prevValue;
                }
                else if (prevValue > prices[i] && bought) {
                    bought = false;
                    max += prevValue - price;
                }
                prevValue = prices[i];
            }
            if (bought) {
                max += prices[prices.length - 1] - price;
            }
            return max;
        }
    }
}
