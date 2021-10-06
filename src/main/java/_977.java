import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/squares-of-a-sorted-array/">977. Squares of a Sorted Array</a>
 */

public class _977 {

    public static class Solution {
        public int[] sortedSquares(int[] nums) {
            for(int i = 0; i < nums.length; ++i) {
                nums[i] = nums[i] * nums[i];
            }
            Arrays.sort(nums);
            return nums;
        }
    }
}
