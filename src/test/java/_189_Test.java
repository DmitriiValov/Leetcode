import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _189_Test {
    private static _189.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _189.Solution();
    }

    @Test
    public void test1() {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3;
        int[] results = {5,6,7,1,2,3,4};
        solution.rotate(nums, k);
        assertThat(nums).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {1};
        int k = 0;
        int[] results = {1};
        solution.rotate(nums, k);
        assertThat(nums).isEqualTo(results);
    }
}
