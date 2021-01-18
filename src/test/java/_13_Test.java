import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _13_Test {
    private static _13.Solution1 solution1;
    private static _13.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _13.Solution1();
        solution2 = new _13.Solution2();
    }

    @Test
    public void test1() {
        String s = "III";
        assertThat(solution1.romanToInt(s)).isEqualTo(3);
    }

    @Test
    public void test2() {
        String s = "IV";
        assertThat(solution1.romanToInt(s)).isEqualTo(4);
    }

    @Test
    public void test3() {
        String s = "IX";
        assertThat(solution1.romanToInt(s)).isEqualTo(9);
    }

    @Test
    public void test4() {
        String s = "LVIII";
        assertThat(solution1.romanToInt(s)).isEqualTo(58);
    }

    @Test
    public void test5() {
        String s = "MCMXCIV";
        assertThat(solution1.romanToInt(s)).isEqualTo(1994);
    }

    @Test
    public void test21() {
        String s = "III";
        assertThat(solution2.romanToInt(s)).isEqualTo(3);
    }

    @Test
    public void test22() {
        String s = "IV";
        assertThat(solution2.romanToInt(s)).isEqualTo(4);
    }

    @Test
    public void test23() {
        String s = "IX";
        assertThat(solution2.romanToInt(s)).isEqualTo(9);
    }

    @Test
    public void test24() {
        String s = "LVIII";
        assertThat(solution2.romanToInt(s)).isEqualTo(58);
    }

    @Test
    public void test25() {
        String s = "MCMXCIV";
        assertThat(solution2.romanToInt(s)).isEqualTo(1994);
    }
}
