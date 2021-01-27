import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _204_Test {

    private static final _204.Solution SOLUTION = new _204.Solution();

    @Test
    public void test1() {
        int n = 10;
        int result = 4;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int n = 0;
        int result = 0;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int n = 1;
        int result = 0;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int n = 100;
        int result = 25;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int n = 2;
        int result = 0;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test6() {
        int n = 10000;
        int result = 1229;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }

    @Test
    public void test7() {
        int n = 5;
        int result = 2;
        assertThat(SOLUTION.countPrimes(n)).isEqualTo(result);
    }
}
