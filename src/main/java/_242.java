import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/">242. Valid Anagram</a>
 */

public class _242 {

    public static class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            char[] str1 = s.toCharArray();
            char[] str2 = t.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            return Arrays.equals(str1, str2);
        }
    }

    public static class Solution1 {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            ArrayList<Character> ch1 = new ArrayList<>(s.chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
            ArrayList<Character> ch2 = new ArrayList<>(t.chars().mapToObj(e -> (char) e).collect(Collectors.toList()));
            Collections.sort(ch1);
            Collections.sort(ch2);
            return ch1.toString().equals(ch2.toString());
        }
    }
}
