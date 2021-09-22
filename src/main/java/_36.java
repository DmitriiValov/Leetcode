import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/valid-sudoku/">36. Valid Sudoku</a>
 */

public class _36 {

    public static class Solution {

        public boolean isValidSudoku(char[][] board) {
            List<Set<Integer>> rows = new ArrayList<>();
            List<Set<Integer>> cols = new ArrayList<>();
            List<Set<Integer>> cells = new ArrayList<>();
            for (int i = 0; i < 9; ++i) {
                rows.add(new HashSet<Integer>());
                cols.add(new HashSet<Integer>());
                cells.add(new HashSet<Integer>());
            }

            for (int i = 0; i < board.length; ++i) {
                for (int j = 0; j < board[0].length; ++j) {
                    char ch = board[i][j];
                    if (ch != '.') {
                        int num = (int)ch;
                        // rows
                        if (rows.get(i).contains(num)) {
                            return false;
                        }
                        else {
                            rows.get(i).add(num);
                        }
                        // cols
                        if (cols.get(j).contains(num)) {
                            return false;
                        }
                        else {
                            cols.get(j).add(num);
                        }
                        // cells
                        int idx = (i / 3 ) * 3 + j / 3;
                        if (cells.get(idx).contains(num)) {
                            return false;
                        }
                        else {
                            cells.get(idx).add(num);
                        }
                    }
                }
            }
            return true;
        }
    }
}
