import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _66_Test {

    private static final _66.Solution SOLUTION = new _66.Solution();

    @Test
    public void test1() {
        int[] digits = {1,2,3};
        int[] results = {1,2,4};
        assertThat(SOLUTION.plusOne(digits)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] digits = {4,3,2,1};
        int[] results = {4,3,2,2};
        assertThat(SOLUTION.plusOne(digits)).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[] digits = {0};
        int[] results = {1};
        assertThat(SOLUTION.plusOne(digits)).isEqualTo(results);
    }

    @Test
    public void test4() {
        int[] digits = {9};
        int[] results = {1,0};
        assertThat(SOLUTION.plusOne(digits)).isEqualTo(results);
    }
}
