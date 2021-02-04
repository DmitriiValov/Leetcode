
/**
 * <a href="https://leetcode.com/problems/remove-element/">27. Remove Element</a>
 */

public class _27 {

    public static class Solution {
        public int removeElement(int[] nums, int val) {
            int pointer = 0;
            for (int i = 0; i < nums.length; ++i) {
                if (nums[i] != val) {
                    if (pointer != i) {
                        nums[pointer] = nums[i];
                    }
                    ++pointer;
                }
            }
            return pointer;
        }
    }
}
