
/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a>
 */

public class _48 {

    public static class Solution {

        public void rotate(int[][] matrix) {
            if (matrix.length <= 1) {
                return;
            }
            int n = matrix.length;
            // Transpose matrix.
            for(int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tmp;
                }
            }
            // And reverse each row.
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n/2; j++) {
                    int tmp = matrix[i][j];
                    matrix[i][j] = matrix[i][n-j-1];
                    matrix[i][n-j-1] = tmp;
                }
            }
        }
    }
}
