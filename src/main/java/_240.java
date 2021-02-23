
/**
 * <a href="https://leetcode.com/problems/search-a-2d-matrix-ii/">240. Search a 2D Matrix II</a>
 */

public class _240 {

    public static class Solution {
        
        public boolean searchMatrix(int[][] matrix, int target) {
            int m = matrix.length;
            int n = matrix[0].length;
            int i = 0;
            int j = n - 1;
            if(target == matrix[0][0]){
                return true;
            }
            while (i < m && j >= 0) {
                if (matrix[i][j] == target) {
                    return true;
                } else if (matrix[i][j] > target) {
                    --j;
                } else {
                    ++i;
                }
            }
            return false;
        }
    }
}
