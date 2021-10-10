/**
 * <a href="https://leetcode.com/problems/max-area-of-island/">695. Max Area of Island</a>
 */

public class _695 {
    public static class Solution {
        int currIsland = 1;
        int maxIslandSize = 0;

        public int maxAreaOfIsland(int[][] grid) {
            for (int i = 0; i < grid.length; ++i) {
                for (int j = 0; j < grid[i].length; ++j) {
                    if (grid[i][j] == 1) {
                        ++currIsland;
                        int currIslandSize = checkIsland(grid, i, j, currIsland, 0);
                        maxIslandSize = Math.max(maxIslandSize, currIslandSize);
                    }
                }
            }
            return maxIslandSize;
        }

        private int checkIsland(int[][] grid, int x, int y, int island, int size) {
            grid[x][y] = island;
            ++size;
            if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                size = checkIsland(grid, x - 1, y, island, size);
            }
            if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                size = checkIsland(grid, x, y - 1, island, size);
            }
            if (x + 1 < grid.length && grid[x + 1][y] == 1) {
                size = checkIsland(grid, x + 1, y, island, size);
            }
            if (y + 1 < grid[x].length && grid[x][y + 1] == 1) {
                size = checkIsland(grid, x, y + 1, island, size);
            }
            return size;
        }
    }
}
