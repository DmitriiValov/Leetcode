import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _45_Test {

    private static final _45.Solution SOLUTION = new _45.Solution();

    @Test
    public void test1() {
        int[] nums = {2,3,1,1,4};
        int res = 2;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }
    @Test
    public void test2() {
        int[] nums = {2,3,0,1,4};
        int res = 2;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }
    @Test
    public void test3() {
        int[] nums = {1,1,1,1};
        int res = 3;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }

    @Test
    public void test4() {
        int[] nums = {5,0,7,1,1,1,1,1,1};
        int res = 2;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }

    @Test
    public void test5() {
        int[] nums = {2,1,1,1,1};
        int res = 3;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }

    @Test
    public void test6() {
        int[] nums = {3,4,3,2,5,4,3};
        int res = 3;
        assertThat(SOLUTION.jump(nums)).isEqualTo(res);
    }
}
