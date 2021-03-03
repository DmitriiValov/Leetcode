import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _645_Test {

    private static final _645.Solution SOLUTION = new _645.Solution();

    @Test
    public void test1() {
        int[] nums = {1,2,2,4};
        int[] results = {2,3};
        assertThat(SOLUTION.findErrorNums(nums)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {1,1};
        int[] results = {1,2};
        assertThat(SOLUTION.findErrorNums(nums)).isEqualTo(results);
    }
}
