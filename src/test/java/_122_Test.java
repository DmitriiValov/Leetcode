import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _122_Test {

    private static _122.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _122.Solution();
    }

    @Test
    public void test1() {
        int[] prices = {7,1,5,3,6,4};
        assertThat(solution.maxProfit(prices)).isEqualTo(7);
    }

    @Test
    public void test2() {
        int[] prices = {1,2,3,4,5};
        assertThat(solution.maxProfit(prices)).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[] prices = {7};
        assertThat(solution.maxProfit(prices)).isEqualTo(0);
    }

    @Test
    public void test4() {
        int[] prices = {7,6,4,3,1};
        assertThat(solution.maxProfit(prices)).isEqualTo(0);
    }

    @Test
    public void test5() {
        int[] prices = {6,1,3,2,4,7};
        assertThat(solution.maxProfit(prices)).isEqualTo(7);
    }
}
