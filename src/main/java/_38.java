/**
 * <a href="https://leetcode.com/problems/count-and-say/">38. Count and Say</a>
 */

public class _38 {
    public static class Solution {
        public String countAndSay(int n) {
            String res = "1";
            for (int i = 1; i < n; ++i){
                res = count(res);
            }
            return res;
        }

        private String count(String s) {
            String res = "";
            char ch = s.charAt(0);
            int count = 1;
            for (int i = 1; i < s.length(); ++i) {
                if(s.charAt(i) == ch) {
                    ++count;
                }
                else {
                    res += "" + count + ch;
                    ch = s.charAt(i);
                    count = 1;
                }
            }
            res += "" + count + ch;
            return res;
        }
    }
}
