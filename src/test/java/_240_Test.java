import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _240_Test {


    private static final _240.Solution SOLUTION = new _240.Solution();

    @Test
    public void test1() {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 23;
        assertThat(SOLUTION.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    public void test2() {
        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}
        };
        int target = 20;
        assertThat(SOLUTION.searchMatrix(matrix, target)).isFalse();
    }

    @Test
    public void test3() {
        int[][] matrix = {{-5}};
        int target = -5;
        assertThat(SOLUTION.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    public void test4() {
        int[][] matrix = {{-1, 3}};
        int target = 3;
        assertThat(SOLUTION.searchMatrix(matrix, target)).isTrue();
    }

    @Test
    public void test5() {
        int[][] matrix = {{-1},{-1}};
        int target = -2;
        assertThat(SOLUTION.searchMatrix(matrix, target)).isFalse();
    }
}
