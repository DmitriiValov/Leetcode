
/**
 * <a href="https://leetcode.com/problems/shortest-unsorted-continuous-subarray/">581. Shortest Unsorted Continuous Subarray</a>
 */

public class _581 {

    public static class Solution {
        public int findUnsortedSubarray(int[] nums) {
            int leftLimit = 0;
            int rightLimit = nums.length - 1;
            int leftValue = nums[leftLimit];
            int rightValue = nums[rightLimit];
            for (int i = 1; i < nums.length; ++i) {
                if (nums[i] < nums[i - 1]) {
                    leftLimit = i - 1;
                    leftValue = nums[i - 1];
                    break;
                }
                leftLimit = i;
            }
            for (int i = nums.length - 1; i > leftLimit; --i) {
                if (nums[i] < nums[i - 1] || nums[i] < leftValue) {
                    rightLimit = i + 1;
                    rightValue = Math.min(nums[i - 1], nums[i]);
                    break;
                }
            }
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = leftLimit + 1; i < rightLimit; ++i) {
                if (nums[i] < min)
                    min = nums[i];
                if (nums[i] > max)
                    max = nums[i];
            }
            if (leftValue > min) {
                for (int i = leftLimit; i >= 0; --i) {
                    if (nums[i] <= min) {
                        leftLimit = i + 1;
                        break;
                    }
                    leftLimit = i;
                }
            }
            if (rightValue < max) {
                for (int i = rightLimit; i < nums.length; ++i) {
                    if (nums[i] >= max) {
                        rightLimit = i;
                        break;
                    }
                    rightLimit = i + 1;
                }
            }
            return rightLimit - leftLimit;
        }
    }
}
