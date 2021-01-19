import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */


public class _15 {

    public static class Solution1 {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> results = new ArrayList<>();
            if(nums.length < 3) {
                return results;
            }
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; ++i) {
                int value = nums[i];
                Set<Integer> set = new HashSet<>();
                for (int j = nums.length - 1; j >= i+1; --j) {
                    if(-value > nums[j] + nums[nums.length - 1]) {
                        break;
                    }
                    if (set.contains(-value - nums[j])) {
                        List<Integer> lst = new ArrayList<>();
                        lst.add(value);
                        lst.add(-value - nums[j]);
                        lst.add(nums[j]);
                        Collections.sort(lst);
                        if (!results.contains(lst)) {
                            results.add(lst);
                        }
                    }
                    set.add(nums[j]);
                }
            }
            return results;
        }
    }
}
