import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _946_Test {

    private static final _946.Solution SOLUTION = new _946.Solution();

    @Test
    public void test1() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        assertThat(SOLUTION.validateStackSequences(pushed, popped)).isTrue();
    }

    @Test
    public void test2() {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,3,5,1,2};
        assertThat(SOLUTION.validateStackSequences(pushed, popped)).isFalse();
    }

    @Test
    public void test3() {
        int[] pushed = {2,1,0};
        int[] popped = {1,2,0};
        assertThat(SOLUTION.validateStackSequences(pushed, popped)).isTrue();
    }
}
