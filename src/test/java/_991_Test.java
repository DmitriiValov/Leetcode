import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _991_Test {

    private static final _991.Solution SOLUTION = new _991.Solution();

    @Test
    public void test1() {
        int X = 2;
        int Y = 3;
        int result = 2;
        assertThat(SOLUTION.brokenCalc(X, Y)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int X = 5;
        int Y = 8;
        int result = 2;
        assertThat(SOLUTION.brokenCalc(X, Y)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int X = 3;
        int Y = 10;
        int result = 3;
        assertThat(SOLUTION.brokenCalc(X, Y)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int X = 1024;
        int Y = 1;
        int result = 1023;
        assertThat(SOLUTION.brokenCalc(X, Y)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int X = 1;
        int Y = 1000000000;
        int result = 39;
        assertThat(SOLUTION.brokenCalc(X, Y)).isEqualTo(result);
    }

}
