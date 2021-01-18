import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _217_Test {

    private static _217.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _217.Solution1();
    }

    @Test
    public void test1() {
        int[] nums = {1,2,3,1};
        assertThat(solution1.containsDuplicate(nums)).isTrue();
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,4};
        assertThat(solution1.containsDuplicate(nums)).isFalse();
    }

    @Test
    public void test3() {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        assertThat(solution1.containsDuplicate(nums)).isTrue();
    }
}
