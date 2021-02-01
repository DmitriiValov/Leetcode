import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _191_Test {
    private static final _191.Solution SOLUTION = new _191.Solution();

    @Test
    public void test1() {
        int n = 00000000000000000000000000001011;
        int result = 3;
        assertThat(SOLUTION.hammingWeight(n)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int n = 00000000000000000000000010000000;
        int result = 1;
        assertThat(SOLUTION.hammingWeight(n)).isEqualTo(result);
    }
}
