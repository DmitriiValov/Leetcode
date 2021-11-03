/**
 * <a href="https://leetcode.com/problems/power-of-three/">326. Power of Three</a>
 */

public class _326 {
    public static class Solution {
        public boolean isPowerOfThree(int n) {
            if (n < 1) {
                return false;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }
    }
}
