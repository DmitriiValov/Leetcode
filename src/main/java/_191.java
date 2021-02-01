
/**
 * <a href="https://leetcode.com/problems/number-of-1-bits/">191. Number of 1 Bits</a>
 */

public class _191 {

    public static class Solution {

        public int hammingWeight(int n) {
            int result = 0;
            int mask = 1;
            for (int i = 0; i < 32; i++) {
                if ((n & mask) != 0) {
                    result++;
                }
                mask *= 2;
            }
            return result;
        }
    }
}
