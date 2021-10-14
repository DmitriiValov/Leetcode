import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combinations/">77. Combinations</a>
 */

public class _77 {

    public static class Solution {
        List<List<Integer>> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            combine(n-k+1, 1, k, new ArrayList<>());
            return list;
        }

        public boolean combine(int max, int start, int times, List<Integer> curr){
            List<Integer> prev = new ArrayList<>(curr);
            for (int i = start; i <= max; ++i) {
                if (i > start) {
                    curr = new ArrayList<>(prev);
                }
                curr.add(i);
                boolean flag = false;
                if (times > 1) {
                    flag = combine(max + 1, i + 1, times - 1, curr);
                }
                if (!flag) {
                    list.add(curr);
                }
            }
            return true;
        }
    }
}
