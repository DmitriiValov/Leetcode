import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1249_Test {
    private static final _1249.Solution SOLUTION = new _1249.Solution();

    @Test
    public void test1() {
        String s = "lee(t(c)o)de)";
        String result = "lee(t(c)o)de";
        assertThat(SOLUTION.minRemoveToMakeValid(s)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "a)b(c)d";
        String result = "ab(c)d";
        assertThat(SOLUTION.minRemoveToMakeValid(s)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String s = "))((";
        String result = "";
        assertThat(SOLUTION.minRemoveToMakeValid(s)).isEqualTo(result);
    }

    @Test
    public void test4() {
        String s = "(a(b(c)d)";
        String result = "a(b(c)d)";
        assertThat(SOLUTION.minRemoveToMakeValid(s)).isEqualTo(result);
    }
}
