import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _994_Test {

    private static final _994.Solution SOLUTION = new _994.Solution();

    @Test
    public void test1() {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        int output = 4;
        assertThat(SOLUTION.orangesRotting(grid)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int[][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        int output = -1;
        assertThat(SOLUTION.orangesRotting(grid)).isEqualTo(output);
    }

    @Test
    public void test3() {
        int[][] grid = {{0,2}};
        int output = 0;
        assertThat(SOLUTION.orangesRotting(grid)).isEqualTo(output);
    }
}
