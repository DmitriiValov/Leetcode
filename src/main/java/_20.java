import java.util.HashMap;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
 */

public class _20 {

    public static class Solution {
        // 2ms
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for (Character ch : s.toCharArray()) {
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                }
                else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    Character ch2 = stack.pop();
                    if ((ch == ')' && ch2 != '(') ||
                            (ch == ']' && ch2 != '[') ||
                            (ch == '}' && ch2 != '{')) {
                        return false;
                    }
                }
            }
            return stack.isEmpty();
        }

        //3 ms
        public boolean isValid2(String s) {
            HashMap<Character,Character> map = new HashMap<>();
            map.put(')','(');
            map.put(']','[');
            map.put('}','{');
            Stack<Character> stack=new Stack<>();
            for (Character ch : s.toCharArray()) {
                if(map.containsKey(ch)){
                    if(stack.empty() || stack.pop() != map.get(ch)) {
                        return false;
                    }
                }
                else
                    stack.push(ch);
            }
            return stack.empty();
        }
    }
}
