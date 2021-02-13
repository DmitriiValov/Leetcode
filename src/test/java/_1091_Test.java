import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1091_Test {
    private static final _1091.Solution SOLUTION = new _1091.Solution();

    @Test
    public void test1() {
        int[][] grid = {{0, 1}, {1, 0}};
        assertThat(SOLUTION.shortestPathBinaryMatrix(grid)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[][] grid = {{0, 0, 0}, {1, 1, 0}, {1, 1, 0}};
        assertThat(SOLUTION.shortestPathBinaryMatrix(grid)).isEqualTo(4);
    }
}
