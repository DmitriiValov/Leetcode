/**
 * <a href="https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/">1249. Minimum Remove to Make Valid Parentheses</a>
 */

public class _1249 {

    public static class Solution {
        public String minRemoveToMakeValid(String s) {
            StringBuilder sb = new StringBuilder();
            int balance = 0;
            boolean skip = false;
            for (Character ch: s.toCharArray()) {
                if (ch.equals('(')) {
                    ++balance;
                }
                else if (ch.equals(')')) {
                    if (balance == 0) {
                        skip = true;
                    }
                    else {
                        --balance;
                    }
                }
                if (!skip) {
                    sb.append(ch);
                }
                skip = false;
            }
            s = sb.reverse().toString();
            sb.setLength(0);
            balance = 0;
            for (Character ch: s.toCharArray()) {
                if (ch.equals(')')) {
                    ++balance;
                }
                else if (ch.equals('(')) {
                    if (balance == 0) {
                        skip = true;
                    }
                    else {
                        --balance;
                    }
                }
                if (!skip) {
                    sb.append(ch);
                }
                skip = false;
            }
            return sb.reverse().toString();
        }
    }
}
