import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/longest-harmonious-subsequence/">594. Longest Harmonious Subsequence</a>
 */

public class _594 {

    public static class Solution {
        public int findLHS(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int n : nums) {
                map.put(n, map.getOrDefault(n, 0) + 1);
            }
            int max = 0;
            for (Integer key : map.keySet()) {
                if (map.containsKey(key + 1)) {
                    max = Math.max(max, map.get(key) + map.get(key + 1));
                }
            }
            return max;
        }
    }
}
