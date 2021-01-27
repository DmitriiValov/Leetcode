
/**
 * <a href="https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers/">1680. Concatenation of Consecutive Binary Numbers</a>
 */

public class _1680 {

    public static class Solution {
        public int concatenatedBinary(int n) {
            int mod = 1000000007;
            int result = 0;

            for (int i = 1; i <= n; ++i) {
                String s = Integer.toBinaryString(i);
                for (Character ch : s.toCharArray()) {
                    if (ch.equals('0')) {
                        result = (result * 2) % mod;
                    }
                    else {
                        result = ((result * 2) + 1) % mod;
                    }
                }
            }
            return result;
        }
    }
}
