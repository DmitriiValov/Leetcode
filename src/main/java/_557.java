/**
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string-iii/">557. Reverse Words in a String III</a>
 */

public class _557 {
    public static class Solution {
        public String reverseWords(String s) {
            String[] parts = s.split(" ");
            StringBuilder sb = new StringBuilder("");
            for (String part : parts ) {
                char[] chs = part.toCharArray();
                for (int i = 0; i < chs.length / 2; ++i) {
                    char temp = chs[i];
                    chs[i] = chs[chs.length - 1 - i];
                    chs[chs.length - 1 - i] = temp;
                }
                sb.append(chs);
                sb.append(" ");
            }
            return sb.toString().trim();
        }
    }
}
