import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _70_Test {

    private static final _70.Solution SOLUTION = new _70.Solution();

    @Test
    public void test1() {
        int i = 2;
        int o = 2;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }

    @Test
    public void test2() {
        int i = 3;
        int o = 3;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }

    @Test
    public void test3() {
        int i = 4;
        int o = 5;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }

    @Test
    public void test4() {
        int i = 5;
        int o = 8;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }

    @Test
    public void test5() {
        int i = 6;
        int o = 13;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }

    @Test
    public void test6() {
        int i = 7;
        int o = 21;
        assertThat(SOLUTION.climbStairs(i)).isEqualTo(o);
    }
}
