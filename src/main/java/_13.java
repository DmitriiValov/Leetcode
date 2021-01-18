import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
 */

public class _13 {

    public static class Solution1 {

        public int romanToInt(String s) {
            int result = 0;
            for (int i = 0; i < s.length(); ++i) {
                if (i + 1 < s.length()) {
                    if (s.charAt(i) == 'I') {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            ++i;
                            continue;
                        }
                        else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            ++i;
                            continue;
                        }
                    }
                    else if (s.charAt(i) == 'X') {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            ++i;
                            continue;
                        }
                        else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            ++i;
                            continue;
                        }
                    }
                    else if (s.charAt(i) == 'C') {
                        if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            ++i;
                            continue;
                        }
                        else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            ++i;
                            continue;
                        }
                    }
                }
                switch (s.charAt(i)) {
                    case 'I': {
                        result += 1;
                        break;
                    }
                    case 'V': {
                        result += 5;
                        break;
                    }
                    case 'X': {
                        result += 10;
                        break;
                    }
                    case 'L': {
                        result += 50;
                        break;
                    }
                    case 'C': {
                        result += 100;
                        break;
                    }
                    case 'D': {
                        result += 500;
                        break;
                    }
                    case 'M': {
                        result += 1000;
                        break;
                    }
                }
            }
            return result;
        }
    }

    public static class Solution2 {

        public int romanToInt(String s) {
            int result = 0;
            Map<Character, Integer> abc = new HashMap<>();

            abc.put('I', 1);
            abc.put('V', 5);
            abc.put('X', 10);
            abc.put('L', 50);
            abc.put('C', 100);
            abc.put('D', 500);
            abc.put('M', 1000);

            int prevValue = 0;
            for (int i = 0; i < s.length(); ++i) {
                int value = abc.get(s.charAt(i));
                if (value > prevValue) {
                    value -= 2 * prevValue;
                }
                result += value;
                prevValue = value;
            }
            return result;
        }
    }
}
