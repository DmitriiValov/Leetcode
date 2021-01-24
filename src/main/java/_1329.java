import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/sort-the-matrix-diagonally/">1329. Sort the Matrix Diagonally</a>
 */

public class _1329 {

    public static class Solution {
        public int[][] diagonalSort(int[][] mat) {
            int width = mat[0].length;
            int height = mat.length;
            int[][] results = new int[height][width];
            for (int i = 0; i < width; ++i) {
                List<Integer> diagonal = new ArrayList<>();
                for (int j = 0; j < Math.min(height, width - i); ++j) {
                    diagonal.add(mat[j][j+i]);
                }
                Collections.sort(diagonal);
                int counter = 0;
                for (int j = 0; j < Math.min(height, width - i); ++j) {
                    results[j][j+i] = diagonal.get(counter);
                    ++counter;
                }
            }
            for (int j = 1; j < height; ++j) {
                List<Integer> diagonal = new ArrayList<>();
                for (int i = 0; i < Math.min(width, height - j); ++i) {
                    diagonal.add(mat[i + j][i]);
                }
                Collections.sort(diagonal);
                int counter = 0;
                for (int i = 0; i < Math.min(width, height - j); ++i) {
                    results[i + j][i] = diagonal.get(counter);
                    ++counter;
                }
            }
            return results;
        }
    }
}
