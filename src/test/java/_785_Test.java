import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _785_Test {

    private static final _785.Solution SOLUTION = new _785.Solution();

    @Test
    public void test1() {
        int[][] graph = {{1,3},{0,2},{1,3},{0,2}};
        assertThat(SOLUTION.isBipartite(graph)).isTrue();
    }

    @Test
    public void test2() {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        assertThat(SOLUTION.isBipartite(graph)).isFalse();
    }
}
