import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _20_Test {

    private static final _20.Solution SOLUTION = new _20.Solution();

    @Test
    public void test1() {
        String s = "()";
        assertThat(SOLUTION.isValid(s)).isTrue();
    }

    @Test
    public void test2() {
        String s = "()[]{}";
        assertThat(SOLUTION.isValid(s)).isTrue();
    }

    @Test
    public void test3() {
        String s = "(]";
        assertThat(SOLUTION.isValid(s)).isFalse();
    }

    @Test
    public void test4() {
        String s = "([)]";
        assertThat(SOLUTION.isValid(s)).isFalse();
    }

    @Test
    public void test5() {
        String s = "{[]}";
        assertThat(SOLUTION.isValid(s)).isTrue();
    }
}
