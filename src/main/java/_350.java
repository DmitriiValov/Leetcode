import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-arrays-ii/">350. Intersection of Two Arrays II</a>
 */

public class _350 {

    public static class Solution {
        public int[] intersect(int[] nums1, int[] nums2) {
            Arrays.sort(nums1);
            Arrays.sort(nums2);
            int p1 = 0;
            int p2 = 0;

            List<Integer> result = new ArrayList<>();

            while (p1 < nums1.length && p2 < nums2.length) {
                if (nums1[p1] == nums2[p2]) {
                    result.add(nums1[p1]);
                    ++p1;
                    ++p2;
                }
                else if (nums1[p1] < nums2[p2]) {
                    ++p1;
                }
                else {
                    ++p2;
                }
            }
            return result.stream().mapToInt(i -> i).toArray();
        }
    }
}
