import java.util.ArrayDeque;

/**
 * <a href="https://leetcode.com/problems/simplify-path/">71. Simplify Path</a>
 */

public class _71 {

    public static class Solution {

        public String simplifyPath(String path) {
            String[] components = path.split("/");
            ArrayDeque<String> deque = new ArrayDeque<>();
            for (String c : components) {
                if ("..".equals(c)) {
                    if (deque.size() > 0) {
                        deque.pollLast();
                    }
                }
                else if (!".".equals(c) && c.length() > 0) {
                    deque.addLast(c);
                }
            }
            String result = "";
            if (deque.size() == 0) {
                result = "/";
            }
            while (deque.size() > 0) {
                result += "/" + deque.pollFirst();
            }
            return result;
        }
    }
}
