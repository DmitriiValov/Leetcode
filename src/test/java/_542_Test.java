import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _542_Test {

    private static final _542.Solution SOLUTION = new _542.Solution();

    @Test
    public void test1() {
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] output = {{0,0,0},{0,1,0},{0,0,0}};
        assertThat(SOLUTION.updateMatrix(mat)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] output = {{0,0,0},{0,1,0},{1,2,1}};
        assertThat(SOLUTION.updateMatrix(mat)).isEqualTo(output);
    }
}
