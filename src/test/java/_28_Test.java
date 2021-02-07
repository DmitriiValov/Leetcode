import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _28_Test {
    private static final _28.Solution SOLUTION = new _28.Solution();

    @Test
    public void test1() {
        String haystack = "hello";
        String needle = "ll";
        assertThat(SOLUTION.strStr(haystack, needle)).isEqualTo(2);
    }

    @Test
    public void test2() {
        String haystack = "aaaaa";
        String needle = "bba";
        assertThat(SOLUTION.strStr(haystack, needle)).isEqualTo(-1);
    }

    @Test
    public void test3() {
        String haystack = "";
        String needle = "";
        assertThat(SOLUTION.strStr(haystack, needle)).isEqualTo(0);
    }
}
