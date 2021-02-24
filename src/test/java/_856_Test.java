import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _856_Test {

    private static final _856.Solution SOLUTION = new _856.Solution();

    @Test
    public void test1() {
        String s = "()";
        int result = 1;
        assertThat(SOLUTION.scoreOfParentheses(s)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "(())";
        int result = 2;
        assertThat(SOLUTION.scoreOfParentheses(s)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String s = "()()";
        int result = 2;
        assertThat(SOLUTION.scoreOfParentheses(s)).isEqualTo(result);
    }

    @Test
    public void test4() {
        String s = "(()(()))";
        int result = 6;
        assertThat(SOLUTION.scoreOfParentheses(s)).isEqualTo(result);
    }
}
