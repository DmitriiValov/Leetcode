import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/shortest-path-in-binary-matrix/">1091. Shortest Path in Binary Matrix</a>
 */

public class _1091 {

    public static class Solution {

        int n = 0;
        int m = 0;
        int[][] steps = new int[][] {{0, 1},{0,-1},{1,0},{-1,0},{1,1}, {1, -1}, {-1,1}, {-1, -1}};

        public int shortestPathBinaryMatrix(int[][] grid) {
            n = grid.length;
            m = grid[0].length;
            if(grid[0][0] == 1 || grid[n - 1][m -1] == 1){
                return -1;
            }
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{0,0,1});

            while(!queue.isEmpty()){
                int[] current = queue.remove();
                if(current[0] == n - 1 && current[1] == m - 1){
                    return current[2];
                }
                for(int[] step: steps){
                    int x = current[0] + step[0];
                    int y = current[1] + step[1];
                    int cost = current[2];

                    if(isValidStep(x, y, grid)){
                        queue.add(new int[]{x, y, cost+1});
                        grid[x][y] = 1;
                    }
                }
            }
           return -1;
        }

        private boolean isValidStep(int i, int j, int[][] grid) {
            return i >= 0 && i < n && j >= 0 && j < m && grid[i][j] == 0;
        }
    }
}
