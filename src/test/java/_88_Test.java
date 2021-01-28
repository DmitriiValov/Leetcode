import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _88_Test {

    private static final _88.Solution SOLUTION = new _88.Solution();

    @Test
    public void test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        int[] results = {1,2,2,3,5,6};
        SOLUTION.merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(results);
    }

    @Test
    public void test2() {
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = 1;
        int n = 0;
        int[] results = {1};
        SOLUTION.merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(results);
    }

    @Test
    public void test3() {
        int[] nums1 = {0};
        int[] nums2 = {1};
        int m = 0;
        int n = 1;
        int[] results = {1};
        SOLUTION.merge(nums1, m, nums2, n);
        assertThat(nums1).containsExactly(results);
    }
}
