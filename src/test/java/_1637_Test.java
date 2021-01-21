import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1637_Test {

    private static _1637.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _1637.Solution();
    }

    @Test
    public void test1() {
        int[] nums = {3,5,2,6};
        int k = 2;
        int[] result = {2,6};
        assertThat(solution.mostCompetitive(nums, k)).isEqualTo(result);
    }
}
