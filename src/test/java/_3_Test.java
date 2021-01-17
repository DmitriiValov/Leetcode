import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _3_Test {

    private static _3.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _3.Solution1();
    }

    @Test
    public void test1() {
        String s = "abcabcbb";
        assertThat(solution1.lengthOfLongestSubstring(s)).isEqualTo(3);
    }

    @Test
    public void test2() {
        String s = "bbbbb";
        assertThat(solution1.lengthOfLongestSubstring(s)).isEqualTo(1);
    }

    @Test
    public void test3() {
        String s = "pwwkew";
        assertThat(solution1.lengthOfLongestSubstring(s)).isEqualTo(3);
    }

    @Test
    public void test4() {
        String s = "";
        assertThat(solution1.lengthOfLongestSubstring(s)).isEqualTo(0);
    }

    @Test
    public void test5() {
        String s = "qwertyuiopqwer";
        assertThat(solution1.lengthOfLongestSubstring(s)).isEqualTo(10);
    }
}
