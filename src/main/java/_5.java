
/**
 * <a href="https://leetcode.com/problems/longest-palindromic-substring/">5. Longest Palindromic Substring</a>
 */

public class _5 {

    public static class Solution1 {

        public String longestPalindrome(String s) {
            if (s.length() <= 1) {
                return s;
            }
            String result = String.valueOf(s.charAt(0));
            for (int i = 0; i < s.length(); ++i) {
                char ch = s.charAt(i);
                int idx = s.length();
                while (true) {
                    int pos = s.lastIndexOf(ch, idx);
                    if (pos > i) {
                        String str = s.substring(i, pos + 1);
                        if (isPalindrome(str)) {
                            if (str.length() > result.length()) {
                                result = str;
                            }
                            break;
                        }
                        idx = pos - 1;
                    }
                    else {
                        break;
                    }
                }
                if (result.length() >= s.length() - i) {
                    break;
                }
            }
            return result;
        }

        boolean isPalindrome(String s) {
            for (int i = 0; i < s.length() / 2; ++i) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
