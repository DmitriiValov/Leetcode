
/**
 * <a href="https://leetcode.com/problems/zigzag-conversion/">6. ZigZag Conversion</a>
 */

public class _6 {

    public static class Solution1 {

        public String convert(String s, int numRows) {
            StringBuilder sb = new StringBuilder();
            if (numRows == 1) {
                return s;
            }
            for (int i = 0; i < numRows; ++i) {
                int step = (numRows - 2) * 2 + 2;
                for (int j = i; j < s.length(); j+= step) {
                    sb.append(s.charAt(j));
                    if (i != 0 && i != numRows - 1) {
                        int idx = (numRows - i - 2) * 2 + 2;
                        if (j + idx < s.length()) {
                            sb.append(s.charAt(j + idx));
                        }
                    }
                }
            }
            return sb.toString();
        }
    }
}
