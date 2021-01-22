import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/">1657. Determine if Two Strings Are Close</a>
 */

public class _1657 {

    public static class Solution {

        public boolean closeStrings(String word1, String word2) {
            if (word1.length() != word2.length()) {
                return false;
            }
            int alphabetSize = 26;
            Set<Integer> lettersSet1 = new HashSet<>();
            Set<Integer> lettersSet2 = new HashSet<>();

            int[] lettersCount1 = new int[alphabetSize];
            int[] lettersCount2 = new int[alphabetSize];

            for (char ch : word1.toCharArray()) {
                lettersCount1[ch - 'a']++;
                lettersSet1.add(ch - 'a');
            }
            for (char ch : word2.toCharArray()) {
                lettersCount2[ch - 'a']++;
                lettersSet2.add(ch - 'a');
            }

            int value1 = 0;
            int value2 = 0;
            for(int i = 0; i < alphabetSize; ++i) {
                value1 ^= lettersCount1[i];
                value2 ^= lettersCount2[i];
            }

            return lettersSet1.equals(lettersSet2) && value1 == value2;
        }
    }
}
