import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/distribute-candies/">575. Distribute Candies</a>
 */

public class _575 {

    public static class Solution {
        public int distributeCandies(int[] candyType) {
            Set<Integer> set = new HashSet<>();
            for (int candy : candyType) {
                set.add(candy);
            }
            return Math.min(candyType.length / 2, set.size());
        }
    }
}
