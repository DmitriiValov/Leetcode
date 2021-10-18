import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _190_Test {
    private static final _190.Solution SOLUTION = new _190.Solution();

    @Test
    public void test1() {
        int n = 43261596;
        int result = 964176192;
        assertThat(SOLUTION.reverseBits(n)).isEqualTo(result);
    }
}
