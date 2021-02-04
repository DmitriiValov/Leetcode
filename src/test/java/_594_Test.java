import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _594_Test {

    private static final _594.Solution SOLUTION = new _594.Solution();

    @Test
    public void test1() {
        int[] nums = {1,3,2,2,5,2,3,7};
        assertThat(SOLUTION.findLHS(nums)).isEqualTo(5);
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,4};
        assertThat(SOLUTION.findLHS(nums)).isEqualTo(2);
    }

    @Test
    public void test3() {
        int[] nums = {1,1,1,1};
        assertThat(SOLUTION.findLHS(nums)).isEqualTo(0);
    }

    @Test
    public void test4() {
        int[] nums = {1,3,5,7,9,11,13,15,17};
        assertThat(SOLUTION.findLHS(nums)).isEqualTo(0);
    }

    @Test
    public void test5() {
        int[] nums = {-3,-1,-1,-1,-3,-2};
        assertThat(SOLUTION.findLHS(nums)).isEqualTo(4);
    }
}
