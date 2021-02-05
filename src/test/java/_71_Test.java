import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _71_Test {

    private static final _71.Solution SOLUTION = new _71.Solution();

    @Test
    public void test1() {
        String path = "/home/";
        String result = "/home";
        assertThat(SOLUTION.simplifyPath(path)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String path = "/../";
        String result = "/";
        assertThat(SOLUTION.simplifyPath(path)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String path = "/home//foo";
        String result = "/home/foo";
        assertThat(SOLUTION.simplifyPath(path)).isEqualTo(result);
    }

    @Test
    public void test4() {
        String path = "/a/./b/../../c/";
        String result = "/c";
        assertThat(SOLUTION.simplifyPath(path)).isEqualTo(result);
    }
}
