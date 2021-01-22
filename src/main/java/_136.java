
/**
 * <a href="https://leetcode.com/problems/single-number/">136. Single Number</a>
 */

public class _136 {

    public static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }
}
