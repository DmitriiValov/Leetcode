
/**
 * <a href="https://leetcode.com/problems/search-insert-position/">35. Search Insert Position</a>
 */

public class _35 {
    public static class Solution {
        public int searchInsert(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (right >= left) {
                int mid = left + (right - left) / 2;
                if(nums[mid] >= target) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}
