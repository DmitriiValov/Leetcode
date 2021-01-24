import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1329_Test {

    private static _1329.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _1329.Solution();
    }

    @Test
    public void test1() {
        int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] results = {{1,1,1,1},{1,2,2,2},{1,2,3,3}};
        assertThat(solution.diagonalSort(mat)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[][] mat = {{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}};
        int[][] results = {{5,17,4,1,52,7},{11,11,25,45,8,69},{14,23,25,44,58,15},{22,27,31,36,50,66},{84,28,75,33,55,68}};
        assertThat(solution.diagonalSort(mat)).isEqualTo(results);
    }
}
