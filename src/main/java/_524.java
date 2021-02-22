import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/">524. Longest Word in Dictionary through Deleting</a>
 */

public class _524 {

    public static class Solution {
        public String findLongestWord(String s, List<String> d) {
            if (s == null || s.length() == 0) {
                return "";
            }
            List<String> result = new ArrayList<>();
            char[] template = s.toCharArray();
            int currLength = 0;
            List<String> list = new ArrayList<>(d);
            list.sort((s1, s2) -> s2.length() - s1.length());
            for (String str : list) {
                if(str.length() < currLength) {
                    break;
                }
                char[] word = str.toCharArray();
                int j = 0;
                int i = 0;
                while (true) {
                    if (word[i] == template[j]) {
                        ++i;
                        if(i == word.length) {
                            result.add(str);
                            currLength = str.length();
                            break;
                        }
                    }
                    ++j;
                    if (j >= template.length) {
                        break;
                    }
                }
            }
            if (result.size() >= 1) {
                Collections.sort(result);
                return result.get(0);
            }
            else {
                return "";
            }
        }
    }
}
