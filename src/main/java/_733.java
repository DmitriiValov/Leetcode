/**
 * <a href="https://leetcode.com/problems/flood-fill/">733. Flood Fill</a>
 */

public class _733 {
    public static class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            int startColor = image[sr][sc];
            if (startColor == newColor) {
                return image;
            }
            image[sr][sc] = newColor;
            if (sr - 1 >= 0 && image[sr - 1][sc] == startColor) {
                floodFill(image, sr - 1, sc, newColor);
            }
            if (sc - 1 >= 0 && image[sr][sc - 1] == startColor) {
                floodFill(image, sr, sc - 1, newColor);
            }
            if (sr + 1 < image.length && image[sr + 1][sc] == startColor) {
                floodFill(image, sr + 1, sc, newColor);
            }
            if (sc + 1 < image[sr].length && image[sr][sc + 1] == startColor) {
                floodFill(image, sr, sc + 1, newColor);
            }
            return image;
        }
    }
}
