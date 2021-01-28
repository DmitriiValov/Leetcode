
/**
 * <a href="https://leetcode.com/problems/merge-sorted-array/">88. Merge Sorted Array</a>
 */

public class _88 {

    public static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = m - 1;
            int j = n - 1;
            for (int k = n + m - 1; k >= 0; --k) {
                if(j >= 0 && (i < 0 || nums2[j] >= nums1[i])) {
                    nums1[k] = nums2[j];
                    --j;
                }
                else {
                    nums1[k] = nums1[i];
                    --i;
                }
            }
        }
    }
}
