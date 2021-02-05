import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _350_Test {

    private static final _350.Solution SOLUTION = new _350.Solution();

    @Test
    public void test1() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = {2,2};
        assertThat(SOLUTION.intersect(nums1,nums2)).isEqualTo(result);
    }

    @Test
    public void test2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] result = {4,9};
        assertThat(SOLUTION.intersect(nums1,nums2)).isEqualTo(result);
    }
}
