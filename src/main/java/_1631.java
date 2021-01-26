import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <a href="https://leetcode.com/problems/path-with-minimum-effort/">1631. Path With Minimum Effort</a>
 */

public class _1631 {

    public static class Solution {
        int n = 0;
        int m = 0;
        int[][] steps = new int[][] {{0, 1},{0,-1},{1,0},{-1,0}};

        public int minimumEffortPath(int[][] heights) {
            n = heights.length;
            m = heights[0].length;

            int[][] visited = new int[n][m];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < m; ++j) {
                    visited[i][j] = Integer.MAX_VALUE;
                }
            }

            Queue<PointW> queue = new PriorityQueue<>();
            queue.add(new PointW(0, 0, 0));
            while (!queue.isEmpty()) {
                PointW p = queue.poll();
                int x = p.getX();
                int y = p.getY();
                int height = p.getHeight();

                if (x == n-1 && y == m-1) {
                    return height;
                }

                for (int i = 0; i < steps.length; ++i) {
                    int newX = x + steps[i][0];
                    int newY = y + steps[i][1];
                    int newHeight = height;

                    if (isValidStep(newX, newY)) {
                        newHeight = Math.max(newHeight, Math.abs(heights[newX][newY] - heights[x][y]));
                        if (newHeight < visited[newX][newY]) {
                            visited[newX][newY] = newHeight;
                            queue.add(new PointW(newX, newY, newHeight));
                        }
                    }
                }
            }
            return 0;
        }

        private boolean isValidStep(int i, int j) {
            return i >= 0 && i < n && j >= 0 && j < m;
        }
    }

    static class PointW implements Comparable<PointW> {
        int x;
        int y;
        int height;

        public PointW(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int compareTo(PointW p) {
            return p.getHeight() < this.getHeight() ? 1 : -1;
        }
    }
}
