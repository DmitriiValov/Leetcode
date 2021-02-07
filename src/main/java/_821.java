
/**
 * <a href="https://leetcode.com/problems/shortest-distance-to-a-character/">821. Shortest Distance to a Character</a>
 */

public class _821 {

    public static class Solution {
        public int[] shortestToChar(String s, char c) {
            int[] result = new int[s.length()];
            int prevPos = -1;
            while (true) {
                int pos = s.indexOf(c, prevPos + 1);
                if (pos == -1) {
                    for (int i = prevPos; i < s.length(); ++i) {
                        result[i] = i - prevPos;
                    }
                    break;
                }
                for (int i = prevPos + 1; i < pos; ++i) {
                    if (prevPos == -1) {
                        result[i] = pos - i;
                    }
                    else {
                        result[i] = Math.min(pos - i, i - prevPos);
                    }
                }
                prevPos = pos;
            }
            return result;
        }
    }
}
