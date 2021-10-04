import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/climbing-stairs/">70. Climbing Stairs</a>
 */

public class _70 {

    public static class Solution {

        public int climbStairs(int n) {
            if(n < 3) {
                return n;
            }
            int val1 = 1;
            int val2 = 2;
            for (int i = 3; i <= n; ++i) {
                val2 += val1;
                val1 = val2 - val1;
            }
            return val2;
        }

        public int climbStairs1(int n) {
            int[] arr = new int[]{1, 2};
            if (n - 1 < arr.length) {
                return arr[n - 1];
            } else {
                arr = Arrays.copyOf(arr, n);
            }
            climbStairs1(2, arr);
            return arr[n-1];
        }

        public static void climbStairs1(int pos, int[] arr) {
            if (pos + 1 > arr.length)
                return;
            arr[pos] = arr[pos - 1] + arr[pos - 2];
            climbStairs1(pos + 1, arr);
        }
    }
}
