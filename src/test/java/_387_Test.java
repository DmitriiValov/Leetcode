import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class _387_Test {

    private static final _387.Solution SOLUTION = new _387.Solution();

    @Test
    public void test1() {
        String s = "leetcode";
        assertThat(SOLUTION.firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    public void test2() {
        String s = "loveleetcode";
        assertThat(SOLUTION.firstUniqChar(s)).isEqualTo(2);
    }
}
