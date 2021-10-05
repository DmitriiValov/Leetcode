import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _35_Test {

    private static final _35.Solution SOLUTION = new _35.Solution();

    @Test
    public void test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int result = 2;
        assertThat(SOLUTION.searchInsert(nums, target)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int result = 1;
        assertThat(SOLUTION.searchInsert(nums, target)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int result = 4;
        assertThat(SOLUTION.searchInsert(nums, target)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int[] nums = {1,3,5,6};
        int target = 0;
        int result = 0;
        assertThat(SOLUTION.searchInsert(nums, target)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int[] nums = {1};
        int target = 0;
        int result = 0;
        assertThat(SOLUTION.searchInsert(nums, target)).isEqualTo(result);
    }
}
