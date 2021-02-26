import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/validate-stack-sequences/">946. Validate Stack Sequences</a>
 */

public class _946 {

    public static class Solution {
        public boolean validateStackSequences(int[] pushed, int[] popped) {
            Stack<Integer> stack = new Stack<>();
            int pi = 0;
            for (int p : pushed) {
                stack.push(p);
                while (!stack.isEmpty() && stack.peek() == popped[pi]) {
                    stack.pop();
                    ++pi;
                }
            }
            for (int i = pi; i < popped.length; ++i) {
                if (stack.peek() == popped[i]) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }
}
