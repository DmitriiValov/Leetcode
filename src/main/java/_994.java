import utils.Point;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/rotting-oranges/">994. Rotting Oranges</a>
 */

public class _994 {

    public static class Solution {
        int[][] directions= {{-1,0}, {1,0}, {0,-1}, {0,1}};

        public int orangesRotting(int[][] grid) {
            Queue<Point> queue = new LinkedList<>();
            int stepsCount = 0;
            int freshOrangesCount = 0;
            for (int row = 0; row < grid.length; ++row) {
                for (int col = 0; col < grid[0].length; ++col) {
                    if (grid[row][col] == 1) { //Fresh orange
                        ++freshOrangesCount;
                    }
                    else if (grid[row][col] == 2) { //Rotten orange
                        queue.add(new Point(row, col, 0));
                    }
                }
            }
            if (freshOrangesCount == 0) { //Started without fresh oranges
                return 0;
            }
            while (queue.size() > 0) {
                Point curPoint = queue.remove();
                int curRow = curPoint.getX();
                int curCol = curPoint.getY();
                int curStep = curPoint.getStep();
                for (int[] direction : directions) {
                    int newRow = curRow + direction[0];
                    int newCol = curCol + direction[1];
                    if (!isOutOfBounds(grid, newRow, newCol)) {
                        if (grid[newRow][newCol] == 1) {
                            grid[newRow][newCol] = 2;
                            --freshOrangesCount;
                            queue.add(new Point(newRow, newCol, curStep + 1));
                            stepsCount = Math.max(stepsCount, curStep + 1);
                        }
                    }
                }
            }
            if (freshOrangesCount == 0) {
                return stepsCount;
            }
            return -1;
        }

        private boolean isOutOfBounds(int[][] mat, int row, int col) {
            return (row < 0 || row >= mat.length || col < 0 || col >= mat[0].length);
        }
    }
}
