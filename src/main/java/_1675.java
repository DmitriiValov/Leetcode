import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/minimize-deviation-in-array/">1675. Minimize Deviation in Array</a>
 */

public class _1675 {

    public static class Solution {
        public int minimumDeviation(int[] nums) {
            Queue<Integer> pq = new PriorityQueue<>((a, b) -> a < b ? 1 : -1);
            int minValue = Integer.MAX_VALUE;
            int deviation = Integer.MAX_VALUE;

            for (int num: nums) {
                if ((num % 2) != 0) {
                    num *= 2;
                }
                pq.add(num);
                minValue = Math.min(minValue, num);
            }

            while (true) {
                int maxValue = pq.poll();
                deviation = Math.min(deviation, maxValue - minValue);
                if ((maxValue % 2) != 0) {
                    break;
                }
                minValue = Math.min(minValue, maxValue / 2);
                pq.add(maxValue / 2);
            }
            return deviation;
        }
    }
}
