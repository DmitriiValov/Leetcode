import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class _167_Test {

    private static final _167.Solution SOLUTION = new _167.Solution();

    @Test
    public void test1() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] results = {1,2};
        assertThat(SOLUTION.twoSum(numbers, target)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] numbers = {2,3,4};
        int target = 6;
        int[] results = {1,3};
        assertThat(SOLUTION.twoSum(numbers, target)).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[] numbers = {-1,0};
        int target = -1;
        int[] results = {1,2};
        assertThat(SOLUTION.twoSum(numbers, target)).isEqualTo(results);
    }
}
