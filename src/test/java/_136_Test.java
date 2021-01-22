import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _136_Test {
    private static _136.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _136.Solution();
    }

    @Test
    public void test1() {
        int[] nums = {2,2,1};
        assertThat(solution.singleNumber(nums)).isEqualTo(1);
    }

    @Test
    public void test2() {
        int[] nums = {4,1,2,1,2};
        assertThat(solution.singleNumber(nums)).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        assertThat(solution.singleNumber(nums)).isEqualTo(1);
    }
}
