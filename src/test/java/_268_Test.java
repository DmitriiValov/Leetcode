import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _268_Test {

    private static final _268.Solution SOLUTION = new _268.Solution();

    @Test
    public void test1() {
        int[] nums = {3,0,1};
        int result = 2;
        assertThat(SOLUTION.missingNumber(nums)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] nums = {0,1};
        int result = 2;
        assertThat(SOLUTION.missingNumber(nums)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int result = 8;
        assertThat(SOLUTION.missingNumber(nums)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int[] nums = {0};
        int result = 1;
        assertThat(SOLUTION.missingNumber(nums)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int result = 13;
        assertThat(SOLUTION.missingNumber(nums)).isEqualTo(result);
    }
}

