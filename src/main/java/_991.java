
/**
 * <a href="https://leetcode.com/problems/broken-calculator/">991. Broken Calculator</a>
 */

public class _991 {

    public static class Solution {
        public int brokenCalc(int X, int Y) {
            int counter = 0;
            while (Y > X) {
                counter++;
                if (Y % 2 == 1)
                    Y++;
                else
                    Y /= 2;
            }
            return counter + X - Y;
        }
    }
}
