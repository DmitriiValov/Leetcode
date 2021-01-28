
/**
 * <a href="https://leetcode.com/problems/smallest-string-with-a-given-numeric-value/">1663. Smallest String With A Given Numeric Value</a>
 */

public class _1663 {

    public static class Solution {
        public String getSmallestString(int n, int k) {
            k -= n;
            char[] array = new char[n];
            for (int i = n - 1; i >= 0; --i) {
                int ch = Math.min(k, 25);
                array[i] = (char)('a' + ch);
                k -= ch;
            }
            return String.valueOf(array);
        }
    }

    public static class Solution2 {
        public String getSmallestString(int n, int k) {
            int alphabet = 26;
            StringBuilder sb = new StringBuilder();
            while (k >= alphabet + n - sb.length()) {
                sb.insert(0, "z");
                k -= alphabet;
            }
            if (k > n - sb.length()) {
                sb.insert(0, (char)('a' + k - n + sb.length()));
            }
            while (sb.length() < n) {
                sb.insert(0, "a");
            }
            return sb.toString();
        }
    }
}
