
/**
 * <a href="https://leetcode.com/problems/missing-number/">268. Missing Number</a>
 */

public class _268 {

    public static class Solution {
        public int missingNumber(int[] nums) {
            long result = 0;
            for (int i = 0; i < nums.length; ++i) {
                result -= nums[i];
                result += i;
            }
            return (int)(result + nums.length);
        }
    }
}
