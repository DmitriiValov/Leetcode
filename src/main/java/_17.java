import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations of a Phone Number</a>
 */

public class _17 {

    public static class Solution1 {

        List<String> results = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            results.clear();
            if (digits.length() == 0) {
                return results;
            }
            calculate("", digits);
            return results;
        }

        public void calculate(String prefix, String postfix) {
            if (postfix.length() == 0) {
                results.add(prefix);
            }
            else {
                char[] letters = getLetters(postfix.charAt(0));
                for (int i = 0; i < letters.length; ++i) {
                    calculate(prefix + letters[i], postfix.substring(1));
                }
            }
        }

        public char[] getLetters(char ch) {
            switch (ch) {
                case '2' : return "abc".toCharArray();
                case '3' : return "def".toCharArray();
                case '4' : return "ghi".toCharArray();
                case '5' : return "jkl".toCharArray();
                case '6' : return "mno".toCharArray();
                case '7' : return "pqrs".toCharArray();
                case '8' : return "tuv".toCharArray();
                case '9' : return "wxyz".toCharArray();
            }
            return "".toCharArray();
        }
    }
}
