import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _575_Test {

    private static final _575.Solution SOLUTION = new _575.Solution();

    @Test
    public void test1() {
        int[] candyType = {1,1,2,2,3,3};
        assertThat(SOLUTION.distributeCandies(candyType)).isEqualTo(3);
    }

    @Test
    public void test2() {
        int[] candyType = {1,1,2,3};
        assertThat(SOLUTION.distributeCandies(candyType)).isEqualTo(2);
    }

    @Test
    public void test3() {
        int[] candyType = {6,6,6,6};
        assertThat(SOLUTION.distributeCandies(candyType)).isEqualTo(1);
    }
}
