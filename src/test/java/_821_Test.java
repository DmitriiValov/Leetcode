import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _821_Test {
    private static final _821.Solution SOLUTION = new _821.Solution();

    @Test
    public void test1() {
        String s = "loveleetcode";
        char c = 'e';
        int[] result = {3,2,1,0,1,0,0,1,2,2,1,0};
        assertThat(SOLUTION.shortestToChar(s, c)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "aaab";
        char c = 'b';
        int[] result = {3,2,1,0};
        assertThat(SOLUTION.shortestToChar(s, c)).isEqualTo(result);
    }
}
