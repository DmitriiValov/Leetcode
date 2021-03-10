import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _12_Test {
    private static final _12.Solution SOLUTION = new _12.Solution();

    @Test
    public void test1() {
        int num = 3;
        String result = "III";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int num = 4;
        String result = "IV";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int num = 9;
        String result = "IX";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int num = 58;
        String result = "LVIII";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }

    @Test
    public void test5() {
        int num = 1994;
        String result = "MCMXCIV";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }

    @Test
    public void test6() {
        int num = 1;
        String result = "I";
        assertThat(SOLUTION.intToRoman(num)).isEqualTo(result);
    }
}
