import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _704_Test {

    private static final _704.Solution SOLUTION = new _704.Solution();

    @Test
    public void test1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int results = 4;
        assertThat(SOLUTION.search(nums, target)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;
        int results = -1;
        assertThat(SOLUTION.search(nums, target)).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[] nums = {5};
        int target = 5;
        int results = 0;
        assertThat(SOLUTION.search(nums, target)).isEqualTo(results);
    }

    @Test
    public void test4() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 12;
        int results = 5;
        assertThat(SOLUTION.search(nums, target)).isEqualTo(results);
    }
}
