
/**
 * <a href="https://leetcode.com/problems/container-with-most-water/">11. Container With Most Water</a>
 */

public class _11 {

    public static class Solution1 {

        public int maxArea(int[] height) {
            int firstIdx = 0;
            int lastIdx = height.length - 1;
            int firstValue = height[firstIdx];
            int lastValue = height[lastIdx];
            int maxArea = Math.min(firstValue, lastValue) * lastIdx;
            while (true) {
                if (firstValue >= lastValue) {
                    lastValue = height[--lastIdx];
                }
                else {
                    firstValue = height[++firstIdx];
                }
                if(firstIdx >= lastIdx) {
                    break;
                }
                int area = Math.min(firstValue, lastValue) * (lastIdx - firstIdx);
                if (area > maxArea) {
                    maxArea = area;
                }
            }
            return maxArea;
        }
    }
}