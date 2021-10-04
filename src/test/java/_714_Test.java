import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _714_Test {

    private static final _714.Solution SOLUTION = new _714.Solution();

    @Test
    public void test1() {
        int[] prices = {1,3,2,8,4,9};
        int fee = 2;
        int result = 8;
        assertThat(SOLUTION.maxProfit(prices, fee)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] prices = {1,3,7,5,10,3};
        int fee = 3;
        int result = 6;
        assertThat(SOLUTION.maxProfit(prices, fee)).isEqualTo(result);
    }

    @Test
    public void test3() {
        int[] prices = {9,8,7,1,2};
        int fee = 3;
        int result = 0;
        assertThat(SOLUTION.maxProfit(prices, fee)).isEqualTo(result);
    }

    @Test
    public void test4() {
        int[] prices = {4,5,2,4,3,3,1,2,5,4};
        int fee = 1;
        int result = 4;
        assertThat(SOLUTION.maxProfit(prices, fee)).isEqualTo(result);
    }
}
