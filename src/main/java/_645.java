
/**
 * <a href="https://leetcode.com/problems/set-mismatch/">645. Set Mismatch</a>
 */

public class _645 {

    public static class Solution {
        public int[] findErrorNums(int[] nums) {
            int[] result = {0, 1};
            for (int n: nums) {
                if (nums[Math.abs(n) - 1] < 0) {
                    result[0] = Math.abs(n);
                }
                else {
                    nums[Math.abs(n) - 1] *= -1;
                }
            }
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] > 0) {
                    result[1] = i + 1;
                    break;
                }
            }
            return result;
        }
    }
}
