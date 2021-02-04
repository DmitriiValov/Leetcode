import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _27_Test {

    private static final _27.Solution SOLUTION = new _27.Solution();

    @Test
    public void test1() {
        int[] nums = {3,2,2,3};
        int val = 3;
        assertThat(SOLUTION.removeElement(nums, val)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        assertThat(SOLUTION.removeElement(nums, val)).isEqualTo(5);
    }
}
