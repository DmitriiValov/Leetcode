import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/find-the-most-competitive-subsequence/">1673. Find the Most Competitive Subsequence</a>
 */

public class _1637 {

    public static class Solution {
        public int[] mostCompetitive(int[] nums, int k) {
            int toRemove = nums.length - k;
            Stack<Integer> stack = new Stack<>();
            for (int num : nums) {
                while (!stack.empty() && toRemove > 0 && stack.peek() > num) {
                    stack.pop();
                    --toRemove;
                }
                stack.push(num);
            }
            while (stack.size() > k) {
                stack.pop();
            }
            int[] result = new int[k];
            int n = k-1;
            while (!stack.isEmpty() && n > -1) {
                result[n--] = stack.pop();
            }
            return result;
        }
    }
}