/**
 * <a href="https://leetcode.com/problems/rotate-array/">189. Rotate Array</a>
 */

public class _189 {

    public static class Solution {

        public void reverse(int[] nums, int start, int end) {
            int counter = 0;
            for (int i = start; i <= (end + start) / 2; ++i) {
                int temp = nums[i];
                nums[i] = nums[end - counter];
                nums[end - counter] = temp;
                ++counter;
            }
        }

        public void rotate(int[] nums, int k) {
            k %= nums.length;
            if (k == 0 || nums.length < 2) {
                return;
            }
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }
    }
}
