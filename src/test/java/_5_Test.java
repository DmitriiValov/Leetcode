import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _5_Test {

    private static _5.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _5.Solution1();
    }

    @Test
    public void test1() {
        String s = "babad";
        String result = "bab";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "babab";
        String result = "babab";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String s = "a";
        String result = "a";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test4() {
        String s = "";
        String result = "";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test5() {
        String s = "ac";
        String result = "a";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test6() {
        String s = "xaabacxcabaaxcabaax";
        String result = "xaabacxcabaax";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test7() {
        String s = "eabcb";
        String result = "bcb";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }

    @Test
    public void test8() {
        String s = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        String result = "dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
        assertThat(solution1.longestPalindrome(s)).isEqualTo(result);
    }
}
