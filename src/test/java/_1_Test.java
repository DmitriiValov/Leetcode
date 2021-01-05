import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1_Test {

    private static _1.Solution1 solution1;
    private static _1.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _1.Solution1();
        solution2 = new _1.Solution2();
    }

    @Test
    public void test1() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] results = { 0, 1 };
        assertThat(solution1.twoSum(nums, target)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] results = { 0, 1 };
        assertThat(solution2.twoSum(nums, target)).isEqualTo(results);
    }
}
