/**
 * <a href="https://leetcode.com/problems/island-perimeter/">463. Island Perimeter</a>
 */

public class _463 {
    public static class Solution {
        int[][] directions= {{-1,0}, {1,0}, {0,-1}, {0,1}};
        int counter = 0;

        public int islandPerimeter(int[][] grid) {
            counter = 0;
            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[i].length; ++j) {
                    if (grid[i][j] == 1) {
                        checkCell(grid, i, j);
                        return counter;
                    }
                }
            }
            return counter;
        }

        private void checkCell(int[][]grid, int row, int col) {
            grid[row][col] = 2;
            for (int[] direction : directions) {
                int rowAdj = row + direction[0];
                int colAdj = col + direction[1];
                if (!isOutOfBounds(grid, rowAdj, colAdj)) {
                    if (grid[rowAdj][colAdj] == 0) {
                        ++counter;
                    }
                    else if (grid[rowAdj][colAdj] == 1) {
                        checkCell(grid, rowAdj, colAdj);
                    }
                }
                else {
                    ++counter;
                }
            }
        }

        private int islandPerimeter1(int[][] grid) {
            counter = 0;
            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[i].length; ++j) {
                    if (grid[i][j] == 1) {
                        for (int[] direction : directions) {
                            int rowAdj = i + direction[0];
                            int colAdj = j + direction[1];
                            if (!isOutOfBounds(grid, rowAdj, colAdj)) {
                                if (grid[rowAdj][colAdj] == 0) {
                                    ++counter;
                                }
                            }
                            else {
                                ++counter;
                            }
                        }
                    }
                }
            }
            return counter;
        }

        private boolean isOutOfBounds(int[][] grid, int row, int col) {
            return (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length);
        }
    }
}
