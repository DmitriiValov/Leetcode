import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _278_Test {

    private static final _278.Solution SOLUTION = new _278.Solution();

    @Test
    public void test1() {
        SOLUTION.setTarget(12345);
        int n = 1000000000;
        int result = 12345;
        assertThat(SOLUTION.firstBadVersion(n)).isEqualTo(result);
    }
}
