
/**
 * <a href="https://leetcode.com/problems/string-to-integer-atoi/">8. String to Integer (atoi)</a>
 */

public class _8 {

    public static class Solution1 {

        public int myAtoi(String s) {
            double result = 0;
            s = s.trim();
            boolean isNegative = false;
            int startIndex = 0;
            if (s.length() > 0) {
                if (s.charAt(0) == '+') {
                    startIndex = 1;
                }
                if (s.charAt(0) == '-') {
                    isNegative = true;
                    startIndex = 1;
                }
            }
            else {
                return 0;
            }
            for (int i = startIndex; i < s.length(); ++i) {
                char ch = s.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    result = result * 10 + ch - '0';
                }
                else if (ch < '0' || ch > '9') {
                    break;
                }
            }
            if (isNegative) {
                result *= -1;
            }
            if (result > Integer.MAX_VALUE) {
                result = Integer.MAX_VALUE;
            }
            else if (result < Integer.MIN_VALUE) {
                result = Integer.MIN_VALUE;
            }
            return (int) result;
        }
    }
}
