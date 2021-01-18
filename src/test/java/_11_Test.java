import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _11_Test {

    private static _11.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _11.Solution1();
    }

    @Test
    public void test1() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertThat(solution1.maxArea(height)).isEqualTo(49);
    }

    @Test
    public void test2() {
        int[] height = {1,1};
        assertThat(solution1.maxArea(height)).isEqualTo(1);
    }

    @Test
    public void test3() {
        int[] height = {4,3,2,1,4};
        assertThat(solution1.maxArea(height)).isEqualTo(16);
    }

    @Test
    public void test4() {
        int[] height = {1,2,1};
        assertThat(solution1.maxArea(height)).isEqualTo(2);
    }
}
