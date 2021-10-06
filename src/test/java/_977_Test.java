import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _977_Test {

    private static final _977.Solution SOLUTION = new _977.Solution();

    @Test
    public void test1() {
        int[] nums = {-4,-1,0,3,10};
        int[] results = {0,1,9,16,100};
        assertThat(SOLUTION.sortedSquares(nums)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {-7,-3,2,3,11};
        int[] results = {4,9,9,49,121};
        assertThat(SOLUTION.sortedSquares(nums)).isEqualTo(results);
    }
}
