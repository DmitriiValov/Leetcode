import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _29_Test {

    private static final _29.Solution SOLUTION = new _29.Solution();

    @Test
    public void test1() {
        int dividend = 10;
        int divisor = 3;
        assertThat(SOLUTION.divide(dividend, divisor)).isEqualTo(3);
    }

    @Test
    public void test2() {
        int dividend = 7;
        int divisor = -3;
        assertThat(SOLUTION.divide(dividend, divisor)).isEqualTo(-2);
    }

    @Test
    public void test3() {
        int dividend = 0;
        int divisor = 1;
        assertThat(SOLUTION.divide(dividend, divisor)).isEqualTo(0);
    }

    @Test
    public void test4() {
        int dividend = 1;
        int divisor = 1;
        assertThat(SOLUTION.divide(dividend, divisor)).isEqualTo(1);
    }

}
