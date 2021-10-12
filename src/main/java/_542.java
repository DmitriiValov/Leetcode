import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/01-matrix/">542. 01 Matrix</a>
 */

public class _542 {
    public static class Solution {

        int[][] directions= {{-1,0}, {1,0}, {0,-1}, {0,1}};

        public int[][] updateMatrix(int[][] mat) {
            int[][] result = new int[mat.length][mat[0].length];
            Queue<int[]> queue = new LinkedList<>();

            for (int row = 0; row < mat.length; ++row) {
                for (int col = 0; col < mat[0].length; ++col) {
                    if (mat[row][col] == 0) {
                        result[row][col] = 0;
                        queue.add(new int[] {row, col});
                    }
                    else {
                        result[row][col]= Integer.MAX_VALUE;
                    }
                }
            }

            while (queue.size() > 0) {
                int[] cur= queue.remove();
                int rowCur= cur[0];
                int colCur= cur[1];

                for (int[] direction : directions) {
                    int rowAdj = rowCur + direction[0];
                    int colAdj = colCur + direction[1];
                    if (!isOutOfBounds(mat, rowAdj, colAdj)) {
                        if (result[rowAdj][colAdj] > result[rowCur][colCur] + 1) {
                            result[rowAdj][colAdj] = result[rowCur][colCur] + 1;
                            queue.add(new int[] {rowAdj, colAdj});
                        }
                    }
                }
            }
            return result;
        }

        private boolean isOutOfBounds(int[][] mat, int row, int col) {
            return (row < 0 || row >= mat.length || col < 0 || col >= mat[0].length);
        }
    }
}
