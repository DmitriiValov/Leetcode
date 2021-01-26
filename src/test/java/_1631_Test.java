import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1631_Test {

    private static final _1631.Solution SOLUTION = new _1631.Solution();

    @Test
    public void test1() {
        int[][] heights = {{1,2,2}, {3,8,2},{5,3,5}};
        assertThat(SOLUTION.minimumEffortPath(heights)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] heights = {{1,2,3}, {3,8,4},{5,3,5}};
        assertThat(SOLUTION.minimumEffortPath(heights)).isEqualTo(1);
    }
}
