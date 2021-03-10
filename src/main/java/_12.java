import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a>
 */

public class _12 {

    public static class Solution {
        public String intToRoman(int num) {
            Map<Integer, Character> map = new HashMap<>();
            map.put(1, 'I');
            map.put(5, 'V');
            map.put(10, 'X');
            map.put(50, 'L');
            map.put(100, 'C');
            map.put(500, 'D');
            map.put(1000, 'M');

            Set<Integer> set = new HashSet<>();
            set.add(10);
            set.add(100);
            set.add(1000);

            StringBuilder result = new StringBuilder();
            List<Integer> keys = new ArrayList<>(map.keySet());
            Collections.sort(keys, Collections.reverseOrder());
            int prevKey = 0;
            for (int key : keys) {
                if (set.contains(prevKey) && num >= prevKey - prevKey / 10) {
                    result.append(map.get(prevKey / 10));
                    result.append(map.get(prevKey));
                    num += prevKey / 10;
                    num -= prevKey;
                }
                else if (num >= key) {
                    int count = num / key;
                    if (count == 4) {
                        result.append(map.get(key));
                        result.append(map.get(prevKey));
                        num -= prevKey;
                        num += key;
                    }
                    else {
                        for(int i = 1; i <= count; ++i) {
                            result.append(map.get(key));
                        }
                        num -= count * key;
                    }
                }
                else {

                }
                prevKey = key;
            }
            return result.toString();
        }
    }
}
