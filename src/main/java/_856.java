import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/score-of-parentheses/">856. Score of Parentheses</a>
 */

public class _856 {

    public static class Solution {
        public int scoreOfParentheses(String S) {
            Stack<Integer> stack = new Stack<>();
            for (Character ch : S.toCharArray()) {
                if (ch.equals('(')) {
                    stack.push(0);
                }
                else {
                    int value =  stack.pop();
                    if (value == 0) {
                        value = 1;
                        if (!stack.isEmpty() && stack.peek() > 0) {
                            value += stack.pop();
                        }
                        stack.push(value);
                    }
                    else {
                        stack.pop();
                        value = value * 2;
                        if (!stack.isEmpty() && stack.peek() > 0) {
                            value += stack.pop();
                        }
                        stack.push(value);
                    }
                }
            }
            return stack.pop();
        }
    }
}
