import java.util.Map;
import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
 */

public class _1 {

    public static class Solution1 {
        // O(N^2)
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length - 1; ++i) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
            return null;
        }
    }

    public static class Solution2 {
        // O(N)
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length - 1; ++i) {
                int difference = target - nums[i];
                if (map.containsKey(difference)) {
                    return new int[] { map.get(difference), i };
                }
                map.put(nums[i], i);
            }
            return null;
        }
    }
}
