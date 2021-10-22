import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _463_Test {

    private static final _463.Solution SOLUTION = new _463.Solution();

    @Test
    public void test1() {
        int[][] grid = {{0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0}};
        int output = 16;
        assertThat(SOLUTION.islandPerimeter(grid)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int[][] grid = {{1}};
        int output = 4;
        assertThat(SOLUTION.islandPerimeter(grid)).isEqualTo(output);
    }

    @Test
    public void test3() {
        int[][] grid = {{1,0}};
        int output = 4;
        assertThat(SOLUTION.islandPerimeter(grid)).isEqualTo(output);
    }
}
