import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _198_Test {

    private static final _198.Solution SOLUTION = new _198.Solution();

    @Test
    public void test1() {
        int[] nums = {1,2,3,1};
        int output = 4;
        assertThat(SOLUTION.rob(nums)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int[] nums = {2,7,9,3,1};
        int output = 12;
        assertThat(SOLUTION.rob(nums)).isEqualTo(output);
    }

    @Test
    public void test3() {
        int[] nums = {7,1,1,9,1};
        int output = 16;
        assertThat(SOLUTION.rob(nums)).isEqualTo(output);
    }
}
