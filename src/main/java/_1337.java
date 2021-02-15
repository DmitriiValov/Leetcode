import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">1337. The K Weakest Rows in a Matrix</a>
 */

public class _1337 {

    public static class Solution {
        public int[] kWeakestRows(int[][] mat, int k) {
            int[][] strengths = new int[mat.length][2];
            for (int i = 0; i < mat.length; ++i) {
                int strength = 0;

                for (int j = 0; j < mat[0].length; ++j) {
                    if (mat[i][j] == 1) {
                       ++strength;
                    }
                    else {
                        break;
                    }
                }
                strengths[i][0] = i;
                strengths[i][1] = strength;
            }
            Arrays.sort (strengths, (a, b) -> {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                else {
                    return a[1] - b[1];
                }
            });

            int[] result = new int[k];
            for (int i = 0; i < k; ++i) {
                result[i] = strengths[i][0];
            }
            return result;
        }
    }
}
