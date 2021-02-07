
/**
 * <a href="https://leetcode.com/problems/implement-strstr/">28. Implement strStr()</a>
 */

public class _28 {

    public static class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() == 0) {
                return 0;
            }
            char[] h = haystack.toCharArray();
            char[] n = needle.toCharArray();

            for (int i = 0; i < h.length - n.length + 1; ++i) {
                for (int j = 0; j < n.length; ++j) {
                    if (h[i + j] != n[j]) {
                        break;
                    }
                    if (j == n.length - 1) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
