import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _31_Test {
    private static final _31.Solution SOLUTION = new _31.Solution();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        int[] result = {1,3,2};
        SOLUTION.nextPermutation(nums);
        assertThat(nums).containsExactly(result);
    }

    @Test
    public void test2() {
        int[] nums = {3,2,1};
        int[] result = {1,2,3};
        SOLUTION.nextPermutation(nums);
        assertThat(nums).containsExactly(result);
    }

    @Test
    public void test3() {
        int[] nums = {1,1,5};
        int[] result = {1,5,1};
        SOLUTION.nextPermutation(nums);
        assertThat(nums).containsExactly(result);
    }

    @Test
    public void test4() {
        int[] nums = {1};
        int[] result = {1};
        SOLUTION.nextPermutation(nums);
        assertThat(nums).containsExactly(result);
    }
}
