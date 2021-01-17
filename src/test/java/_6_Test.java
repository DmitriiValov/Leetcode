import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _6_Test {

    private static _6.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _6.Solution1();
    }

    @Test
    public void test1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String result = "PAHNAPLSIIGYIR";
        assertThat(solution1.convert(s, numRows)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = "PINALSIGYAHRPI";
        assertThat(solution1.convert(s, numRows)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String s = "A";
        int numRows = 1;
        String result = "A";
        assertThat(solution1.convert(s, numRows)).isEqualTo(result);
    }

    @Test
    public void test4() {
        String s = "ABCD";
        int numRows = 3;
        String result = "ABDC";
        assertThat(solution1.convert(s, numRows)).isEqualTo(result);
    }
}
