import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1680_Test {
    private static final _1680.Solution SOLUTION = new _1680.Solution();

    @Test
    public void test1() {
        int n = 1;
        int result = 1;
        assertThat(SOLUTION.concatenatedBinary(n)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int n = 3;
        int result = 27;
        assertThat(SOLUTION.concatenatedBinary(n)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int n = 12;
        int result = 505379714;
        assertThat(SOLUTION.concatenatedBinary(n)).isEqualTo(result);
    }
}
