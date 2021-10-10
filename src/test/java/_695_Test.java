import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _695_Test {

    private static final _695.Solution SOLUTION = new _695.Solution();

    @Test
    public void test1() {
        int[][] grid = {
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        int result = 6;
        assertThat(SOLUTION.maxAreaOfIsland(grid)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[][] grid = {{0,0,0,0,0,0,0,0}};
        int result = 0;
        assertThat(SOLUTION.maxAreaOfIsland(grid)).isEqualTo(result);
    }
}
