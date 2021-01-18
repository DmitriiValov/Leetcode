
/**
 * <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>
 */

public class _14 {

    public static class Solution1 {

        public String longestCommonPrefix(String[] strs) {
            String result = "";
            if (strs.length > 0) {
                result = strs[0];
            }
            for (String str : strs) {
                if (str.length() == 0) {
                    return "";
                }
                for (int i = 0; i < Math.min(result.length(), str.length()); ++i) {
                    if (result.charAt(i) != str.charAt(i)) {
                        result = result.substring(0, i);
                    }
                    if (i == Math.min(result.length(), str.length()) - 1) {
                        result = result.substring(0, i + 1);
                    }
                }
                if (result.length() == 0) {
                    break;
                }
            }
            return result;
        }
    }
}

