import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _8_Test {

    private static _8.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _8.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.myAtoi(" -123456 ")).isEqualTo(-123456);
    }

    @Test
    public void test2() {
        assertThat(solution1.myAtoi(" -123456 gthgrth")).isEqualTo(-123456);
    }

    @Test
    public void test3() {
        assertThat(solution1.myAtoi("vfdvfd -123456 ")).isEqualTo(0);
    }

    @Test
    public void test4() {
        assertThat(solution1.myAtoi("3.14159")).isEqualTo(3);
    }

    @Test
    public void test5() {
        assertThat(solution1.myAtoi("9223372036854775808")).isEqualTo(2147483647);
    }
}
