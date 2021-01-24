import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _48_Test {

    private static _48.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _48.Solution();
    }

    @Test
    public void test1() {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] results = {{7,4,1},{8,5,2},{9,6,3}};
        solution.rotate(matrix);
        assertThat(matrix).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        int[][] results = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        solution.rotate(matrix);
        assertThat(matrix).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[][] matrix = {{1}};
        int[][] results = {{1}};
        solution.rotate(matrix);
        assertThat(matrix).isEqualTo(results);
    }

    @Test
    public void test4() {
        int[][] matrix = {{1,2},{3,4}};
        int[][] results = {{3,1},{4,2}};
        solution.rotate(matrix);
        assertThat(matrix).isEqualTo(results);
    }
}
