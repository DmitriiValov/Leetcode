import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _443_Test {

    private static _443.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _443.Solution1();
    }

    @Test
    public void test1() {
        char[] chars = {'a','a','b','b','c','c','c'};
        assertThat(solution1.compress(chars)).isEqualTo(6);
    }

    @Test
    public void test2() {
        char[] chars = {'a'};
        assertThat(solution1.compress(chars)).isEqualTo(1);
    }
}
