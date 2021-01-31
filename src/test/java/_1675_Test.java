import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1675_Test {

    private static final _1675.Solution SOLUTION = new _1675.Solution();

    @Test
    public void test1() {
        int[] nums = {1,2,3,4};
        int result = 1;
        assertThat(SOLUTION.minimumDeviation(nums)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] nums = {4,1,5,20,3};
        int result = 3;
        assertThat(SOLUTION.minimumDeviation(nums)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[] nums = {2,10,8};
        int result = 3;
        assertThat(SOLUTION.minimumDeviation(nums)).isEqualTo(result);
    }
}
