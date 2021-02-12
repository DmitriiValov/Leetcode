import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1342_Test {


    private static final _1342.Solution SOLUTION = new _1342.Solution();

    @Test
    public void test1() {
        int num = 14;
        assertThat(SOLUTION.numberOfSteps(num)).isEqualTo(6);
    }

    @Test
    public void test2() {
        int num = 8;
        assertThat(SOLUTION.numberOfSteps(num)).isEqualTo(4);
    }

    @Test
    public void test3() {
        int num = 123;
        assertThat(SOLUTION.numberOfSteps(num)).isEqualTo(12);
    }
}
