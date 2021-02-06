import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class _283_Test {

    private static final _283.Solution SOLUTION = new _283.Solution();

    @Test
    public void test1() {
        int[] nums = {0,1,0,3,12};
        int[] result = {1,3,12,0,0};
        SOLUTION.moveZeroes(nums);
        assertThat(nums).isEqualTo(result);
    }
}
