import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/first-unique-character-in-a-string/solution/">387. First Unique Character in a String</a>
 */

public class _387 {

    public static class Solution {
        public int firstUniqChar(String s) {
            Map<Character, Integer> map = new HashMap<>();
            for (char ch : s.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
            for (int i = 0; i < s.length(); ++i) {
                if (map.get(s.charAt(i)) == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
}
