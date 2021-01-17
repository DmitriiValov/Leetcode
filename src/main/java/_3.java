
/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">3. Longest Substring Without Repeating Characters</a>
 */

public class _3 {

    public static class Solution1 {
        public int lengthOfLongestSubstring(String s) {
            int result = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ++i) {
                int idx = sb.indexOf(String.valueOf(s.charAt(i)));
                if(idx == -1) {
                    sb.append(s.charAt(i));
                }
                else {
                    if (sb.length() > result) {
                        result = sb.length();
                    }
                    sb = new StringBuilder(sb.substring(idx + 1));
                    sb.append(s.charAt(i));
                }
            }
            if (sb.length() > result) {
                result = sb.length();
            }
            return result;
        }
    }
}
