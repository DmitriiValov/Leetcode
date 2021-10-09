import java.util.HashMap;

/**
 * <a href="https://leetcode.com/problems/permutation-in-string/">567. Permutation in String</a>
 */

public class _567 {
    public static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            if (s1.length() > s2.length()) return false;
            HashMap<Character, Integer> map = new HashMap<>();
            char[] chars = s1.toCharArray();
            for (char ch : chars) {
                if (map.containsKey(ch)) {
                    map.computeIfPresent(ch, (k, v) -> ++v);
                }
                else {
                    map.put(ch, 1);
                }
            }
            char[] chars2 = s2.toCharArray();
            HashMap<Character, Integer> mapSlide = new HashMap<>();
            for (int i = 0; i < s1.length(); ++i) {
                char ch = chars2[i];
                if (mapSlide.containsKey(ch)) {
                    mapSlide.computeIfPresent(ch, (k, v) -> ++v);
                }
                else {
                    mapSlide.put(ch, 1);
                }
            }
            if (matches(map, mapSlide)) {
                return true;
            }
            for (int i = s1.length(); i < s2.length(); ++i) {
                char ch = chars2[i - s1.length()];
                if (mapSlide.containsKey(ch)) {
                    mapSlide.computeIfPresent(ch, (k, v) -> --v);
                }
                ch = chars2[i];
                if (mapSlide.containsKey(ch)) {
                    mapSlide.computeIfPresent(ch, (k, v) -> ++v);
                }
                else {
                    mapSlide.put(ch, 1);
                }
                if (matches(map, mapSlide)) {
                    return true;
                }
            }
            return false;
        }

        public boolean matches(HashMap <Character, Integer> map1, HashMap <Character, Integer> map2) {
            for (char key: map1.keySet()) {
                if (map1.get(key) - map2.getOrDefault(key, -1) != 0)
                    return false;
            }
            return true;
        }
    }
}

