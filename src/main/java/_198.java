/**
 * <a href="https://leetcode.com/problems/house-robber/">198. House Robber</a>
 */

public class _198 {
    public static class Solution {
        public int rob1(int[] nums) {
            int n = nums.length;
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = nums[0];
            for(int i = 1; i < n; ++i){
                dp[i + 1] = Math.max(dp[i], nums[i] + dp[i - 1]);
            }
            return dp[dp.length - 1];
        }

        public int rob(int[] nums) {
            int prev = 0;
            int curr = nums[0];
            for(int i = 1; i < nums.length; ++i){
                int temp = curr;
                curr = Math.max(curr, nums[i] + prev);
                prev = temp;
            }
            return curr;
        }
    }
}
