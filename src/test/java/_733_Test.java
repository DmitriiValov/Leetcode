import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _733_Test {

    private static final _733.Solution SOLUTION = new _733.Solution();

    @Test
    public void test1() {
        int[][] image = {{0,0,0},{0,0,0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
        int[][] output = {{2,2,2},{2,2,2}};
        assertThat(SOLUTION.floodFill(image, sr, sc, newColor)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] output = {{2,2,2},{2,2,0},{2,0,1}};
        assertThat(SOLUTION.floodFill(image, sr, sc, newColor)).isEqualTo(output);
    }

    @Test
    public void test3() {
        int[][] image = {{0,0,0},{0,1,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        int[][] output = {{0,0,0},{0,1,1}};
        assertThat(SOLUTION.floodFill(image, sr, sc, newColor)).isEqualTo(output);
    }

}
