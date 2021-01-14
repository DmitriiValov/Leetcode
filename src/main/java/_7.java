
/**
 * <a href="https://leetcode.com/problems/reverse-integer/">7. Reverse Integer</a>
 */

public class _7 {

    public static class Solution1 {

        public int reverse(int x) {
            long result = 0;
            while (x != 0) {
                int digit = x % 10;
                x = x / 10;
                result = result * 10 + digit;
                if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                    return 0;
                }
            }
            return (int) result;
        }
    }
}
