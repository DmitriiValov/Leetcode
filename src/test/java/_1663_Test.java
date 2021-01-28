import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1663_Test {
    private static final _1663.Solution SOLUTION = new _1663.Solution();

    @Test
    public void test1() {
        int n = 3;
        int k = 27;
        String result = "aay";
        assertThat(SOLUTION.getSmallestString(n, k)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int n = 5;
        int k = 73;
        String result = "aaszz";
        assertThat(SOLUTION.getSmallestString(n, k)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int n = 1;
        int k = 1;
        String result = "a";
        assertThat(SOLUTION.getSmallestString(n, k)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int n = 5;
        int k = 31;
        String result = "aaabz";
        assertThat(SOLUTION.getSmallestString(n, k)).isEqualTo(result);
    }
}
