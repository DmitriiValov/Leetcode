import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _7_Test {

    private static _7.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _7.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.reverse(123)).isEqualTo(321);
    }

    @Test
    public void test2() {
        assertThat(solution1.reverse(0)).isEqualTo(0);
    }

    @Test
    public void test3() {
        assertThat(solution1.reverse(-123)).isEqualTo(-321);
    }

    @Test
    public void test4() {
        assertThat(solution1.reverse(120)).isEqualTo(21);
    }

    @Test
    public void test5() {
        assertThat(solution1.reverse(2147483647)).isEqualTo(0);
    }
}
