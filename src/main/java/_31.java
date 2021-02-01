
/**
 * <a href="https://leetcode.com/problems/next-permutation/">31. Next Permutation</a>
 */

public class _31 {

    public static class Solution {
        public void nextPermutation(int[] nums) {
            if(nums.length <= 1)
                return;
            int swapPoint = nums.length - 2;
            while(swapPoint >= 0 && nums[swapPoint] >= nums[swapPoint + 1]){
                swapPoint --;
            }
            if(swapPoint >= 0){
                int j = nums.length - 1;
                while(j > swapPoint && nums[j] <= nums[swapPoint]){
                    j --;
                }
                swap(nums, swapPoint, j);
            }
            reverse(nums, swapPoint + 1);
        }

        private void reverse(int[] nums, int start){
            int i = start;
            int j = nums.length - 1;
            while(i < j){
                swap(nums, i, j);
                i ++;
                j --;
            }
        }

        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
