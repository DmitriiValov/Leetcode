/**
 * <a href="https://leetcode.com/problems/valid-palindrome/">125. Valid Palindrome</a>
 */

public class _125 {

    public static class Solution {
        public boolean isPalindrome(String s) {
            char[] chars = s.toLowerCase().toCharArray();
            for (int i = 0, j = chars.length - 1; i < j; ++i, --j) {
                while (!Character.isLetterOrDigit(chars[i]) && i < j) {
                    ++i;
                }
                while (!Character.isLetterOrDigit(chars[j]) && j > i) {
                    --j;
                }
                if (chars[i] != chars[j]) {
                    return false;
                }
            }
            return true;
        }
    }
}
