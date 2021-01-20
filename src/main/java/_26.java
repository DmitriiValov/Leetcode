/**
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">26. Remove Duplicates from Sorted Array</a>
 */

public class _26 {

    public static class Solution1 {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 1) {
                return nums.length;
            }
            int counter = 1;
            int prevValue = nums[0];
            for (int i = 1; i < nums.length; ++i) {
                if (prevValue != nums[i]) {
                    prevValue = nums[i];
                    if (i != counter) {
                        nums[counter] = nums[i];
                    }
                    ++counter;
                }
            }
            return counter;
        }
    }
}
