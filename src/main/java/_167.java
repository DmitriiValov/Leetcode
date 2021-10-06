import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/">167. Two Sum II - Input array is sorted</a>
 */

public class _167 {
    public static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 0; i < numbers.length; ++i) {
                if(map.containsKey(target - numbers[i])) {
                    int[] result = new int[2];
                    result[0] = map.get(target - numbers[i]);
                    result[1] = ++i;
                    return result;
                }
                else {
                    map.put(numbers[i], i + 1);
                }
            }
            return new int[0];
        }
    }
}
