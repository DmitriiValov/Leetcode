import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1337_Test {

    private static final _1337.Solution SOLUTION = new _1337.Solution();

    @Test
    public void test1() {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        int[] result = {2,0,3};
        assertThat(SOLUTION.kWeakestRows(mat, k)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[][] mat = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k = 2;
        int[] result = {0,2};
        assertThat(SOLUTION.kWeakestRows(mat, k)).isEqualTo(result);
    }
}
