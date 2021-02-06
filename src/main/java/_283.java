
/**
 * <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 */

public class _283 {

    public static class Solution {

        public void moveZeroes(int[] nums) {
            int zeroCount = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] == 0) {
                    ++zeroCount;
                }
                else if (zeroCount > 0) {
                    nums[i - zeroCount] = nums[i];
                    nums[i] = 0;
                }
            }
        }
    }
}
