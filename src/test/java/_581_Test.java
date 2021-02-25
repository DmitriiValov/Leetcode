import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _581_Test {

    private static final _581.Solution SOLUTION = new _581.Solution();

    @Test
    public void test1() {
        int[] nums = {2,6,4,8,10,9,15};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(5);
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,4};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(0);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(0);
    }

    @Test
    public void test4() {
        int[] nums = {1,3,2,2,2};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(4);
    }

    @Test
    public void test5() {
        int[] nums = {1,3,2,3,3};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(2);
    }

    @Test
    public void test6() {
        int[] nums = {2,3,3,2,4};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(3);
    }

    @Test
    public void test7() {
        int[] nums = {1,2,3,3,3};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(0);
    }

    @Test
    public void test8() {
        int[] nums = {5,4,3,2,1};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(5);
    }

    @Test
    public void test9() {
        int[] nums = {1,3,5,2,4};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(4);
    }

    @Test
    public void test10() {
        int[] nums = {2,1,5,3,4};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(5);
    }

    @Test
    public void test11() {
        int[] nums = {2,3,1,4,5};
        assertThat(SOLUTION.findUnsortedSubarray(nums)).isEqualTo(3);
    }
}