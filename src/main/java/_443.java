
/**
 * <a href="https://leetcode.com/problems/string-compression/">443. String Compression</a>
 */

public class _443 {

    public static class Solution1 {

        public int compress(char[] chars) {
            String result = "";
            for (int i = 0; i < chars.length; ++i) {
                char ch = chars[i];
                result += ch;
                int counter = 0;
                while (i + counter + 1 < chars.length && ch == chars[i + counter + 1]) {
                    ++counter;
                    if (i + counter + 1 >= chars.length) {
                        break;
                    }
                }
                if(counter > 0) {
                    i += counter;
                    result += Integer.toString(counter + 1);
                }
            }
            for( int i = 0; i < result.length(); ++i) {
                chars[i] = result.charAt(i);
            }
            return result.length();
        }
    }
}
