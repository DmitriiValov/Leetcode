
/**
 * <a href="https://leetcode.com/problems/divide-two-integers/">29. Divide Two Integers</a>
 */

public class _29 {

    public static class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE;
            }
            int up = dividend, down = divisor, res = 0;
            if (dividend > 0) {
                up = -dividend;
            }
            if (divisor > 0) {
                down = -divisor;
            }
            while (up <= down) {
                int counter = 1;
                int base = down;
                while (up < (base << 1) && (base >= -(1 << 30))) {
                    counter = counter << 1;
                    base = base << 1;
                }
                res += counter;
                up -= base;
            }
            return (dividend > 0) == (divisor > 0) ? res : -res;
        }
    }
}
