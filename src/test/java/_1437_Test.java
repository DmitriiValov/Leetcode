import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1437_Test {
    private static final _1437.Solution SOLUTION = new _1437.Solution();

    @Test
    public void test1() {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        assertThat(SOLUTION.kLengthApart(nums, k)).isTrue();
    }

    @Test
    public void test2() {
        int[] nums = {1,0,0,1,0,1};
        int k = 2;
        assertThat(SOLUTION.kLengthApart(nums, k)).isFalse();
    }

    @Test
    public void test3() {
        int[] nums = {1,1,1,1,1};
        int k = 0;
        assertThat(SOLUTION.kLengthApart(nums, k)).isTrue();
    }

    @Test
    public void test4() {
        int[] nums = {0,1,0,1};
        int k = 0;
        assertThat(SOLUTION.kLengthApart(nums, k)).isTrue();
    }
}
