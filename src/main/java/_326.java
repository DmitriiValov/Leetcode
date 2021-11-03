/**
 * <a href="https://leetcode.com/problems/power-of-three/">326. Power of Three</a>
 */

public class _326 {
    public static class Solution {
        public boolean isPowerOfThree2(int n) {
            if (n < 1) {
                return false;
            }
            while (n % 3 == 0) {
                n /= 3;
            }
            return n == 1;
        }

        public boolean isPowerOfThree(int n) {
            if (n < 1) {
                return false;
            }
            String s =  Integer.toString(n, 3);
            for (int i = 1; i < s.length(); ++i) {
                if (s.charAt(i) != '0') {
                    return false;
                }
            }
            if (s.charAt(0) != '1') {
                return false;
            }
            return true;
        }
    }
}
