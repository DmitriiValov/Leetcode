
/**
 * <a href="https://leetcode.com/problems/palindrome-number/">9. Palindrome Number</a>
 */

public class _9 {

    public static class Solution1 {
        public boolean isPalindrome(int x) {
            String s = String.valueOf(x);
            for (int i = 0; i < s.length() / 2; ++i) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
