import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _38_Test {
    private static final _38.Solution SOLUTION = new _38.Solution();

    @Test
    public void test1() {
        int input = 1;
        String output = "1";
        assertThat(SOLUTION.countAndSay(input)).isEqualTo(output);
    }

    @Test
    public void test2() {
        int input = 4;
        String output = "1211";
        assertThat(SOLUTION.countAndSay(input)).isEqualTo(output);
    }
}
