import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _231_Test {

    private static final _231.Solution SOLUTION = new _231.Solution();

    @Test
    public void test1() {
        int n = 1;
        assertThat(SOLUTION.isPowerOfTwo(n)).isTrue();
    }

    @Test
    public void test2() {
        int n = 16;
        assertThat(SOLUTION.isPowerOfTwo(n)).isTrue();
    }

    @Test
    public void test3() {
        int n = 3;
        assertThat(SOLUTION.isPowerOfTwo(n)).isFalse();
    }

    @Test
    public void test4() {
        int n = 4;
        assertThat(SOLUTION.isPowerOfTwo(n)).isTrue();
    }

    @Test
    public void test5() {
        int n = 5;
        assertThat(SOLUTION.isPowerOfTwo(n)).isFalse();
    }
}
