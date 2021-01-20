import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _26_Test {

    private static _26.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _26.Solution1();
    }

    @Test
    public void test1() {
        int[] nums = {1,1,2};
        assertThat(solution1.removeDuplicates(nums)).isEqualTo(2);
    }

    @Test
    public void test2() {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        assertThat(solution1.removeDuplicates(nums)).isEqualTo(5);
    }

}
