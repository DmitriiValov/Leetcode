import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _557_Test {

    private static final _557.Solution SOLUTION = new _557.Solution();

    @Test
    public void test1() {
        String s = "Let's take LeetCode contest";
        String result = "s'teL ekat edoCteeL tsetnoc";
        assertThat(SOLUTION.reverseWords(s)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "God Ding";
        String result = "doG gniD";
        assertThat(SOLUTION.reverseWords(s)).isEqualTo(result);
    }
}
