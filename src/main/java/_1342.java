
/**
 * <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">1342. Number of Steps to Reduce a Number to Zero</a>
 */

public class _1342 {

    public static class Solution {
        public int numberOfSteps (int num) {
            int mask = Integer.MAX_VALUE - 1;
            int result = 0;
            while (num > 0) {
                if (num % 2 == 0) {
                    num >>= 1;
                }
                else {
                    num &= mask;
                }
                ++result;
            }
            return result;
        }
    }
}
