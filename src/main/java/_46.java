import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/permutations/">46. Permutations</a>
 */

public class _46 {

    public static class Solution {
        List<List<Integer>> result = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            boolean[] visited = new boolean[nums.length];
            if(nums.length == 0) {
                result.add(new ArrayList<>());
            }
            permute(nums, new ArrayList<>(), visited);
            return result;
        }

        public void permute(int[] nums, List<Integer> curr, boolean[] visited) {
            if (curr.size() == nums.length) {
                result.add(new ArrayList<>(curr));
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (visited[i]) {
                    continue;
                }
                curr.add(nums[i]);
                visited[i] = true;
                permute(nums, curr, visited);
                curr.remove(curr.size() - 1);
                visited[i] = false;
            }
        }
    }
}
