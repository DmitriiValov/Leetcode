
/**
 * <a href="https://leetcode.com/problems/jump-game-ii/">45. Jump Game II</a>
 */

public class _45 {

    public static class Solution {

        public int jump(int[] nums) {
            int count = 1;
            if (nums.length <= 1) {
                return 0;
            }
            for (int i = 0; i < nums.length;) {
                if (nums[i] >= nums.length - i - 1) {
                    return count;
                }
                int maxJump = 0;
                int maxJumpIdx = i;
                for (int j = 1; j <= nums[i]; ++j) {
                    if (nums[i + j] + j > maxJump) {
                        maxJump = nums[i + j] + j - 1;
                        maxJumpIdx = i + j;
                    }
                }
                i = maxJumpIdx;
                ++count;
            }
            return count;
        }
    }
}
