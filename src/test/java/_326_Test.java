import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class _326_Test {

    private static final _326.Solution SOLUTION = new _326.Solution();

    @Test
    public void test1() {
        int n = 27;
        assertThat(SOLUTION.isPowerOfThree(n)).isTrue();
    }

    @Test
    public void test2() {
        int n = 0;
        assertThat(SOLUTION.isPowerOfThree(n)).isFalse();
    }

    @Test
    public void test3() {
        int n = 9;
        assertThat(SOLUTION.isPowerOfThree(n)).isTrue();
    }

    @Test
    public void test4() {
        int n = 45;
        assertThat(SOLUTION.isPowerOfThree(n)).isFalse();
    }

    @Test
    public void test5() {
        int n = 1;
        assertThat(SOLUTION.isPowerOfThree(n)).isTrue();
    }
}
