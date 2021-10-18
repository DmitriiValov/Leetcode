/**
 * <a href="https://leetcode.com/problems/power-of-two/">231. Power of Two</a>
 */

public class _231 {
    public static class Solution {
        public boolean isPowerOfTwo2(int n) {
            if (n <= 0) return false;
            while (n > 1) {
                if(n % 2 == 0) {
                    n /= 2;
                }
                else {
                    return false;
                }
            }
            return true;
        }

        public boolean isPowerOfTwo3(int n) {
            if (n <= 0) return false;
            String s = Integer.toBinaryString(n);
            for (int i = 1; i < s.length(); ++i) {
                if (s.charAt(i) == '1') {
                    return false;
                }
            }
            return true;
        }

        public boolean isPowerOfTwo(int n) {
            if (n <= 0) return false;
            String s = Integer.toBinaryString(n);
            int result = 0;
            int mask = 1;
            for (int i = 0; i < s.length(); i++) {
                if ((n & mask) != 0) {
                    result++;
                }
                mask *= 2;
            }
            return result == 1;
        }
    }
}
