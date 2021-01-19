import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _15_Test {

    private static _15.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _15.Solution1();
    }

    @Test
    public void test1() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> results = Arrays.asList(
                Arrays.asList(-1,-1,2),
                Arrays.asList(-1,0,1));
        assertThat(solution1.threeSum(nums)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {};
        List<List<Integer>> results = Arrays.asList();
        assertThat(solution1.threeSum(nums)).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[] nums = {0};
        List<List<Integer>> results = Arrays.asList();
        assertThat(solution1.threeSum(nums)).containsExactlyInAnyOrderElementsOf(results);
    }

    @Test
    public void test4() {
        int[] nums = {-2,0,1,1,2};
        List<List<Integer>> results = Arrays.asList(
                Arrays.asList(-2,0,2),
                Arrays.asList(-2,1,1));
        assertThat(solution1.threeSum(nums)).containsExactlyInAnyOrderElementsOf(results);
    }

    @Test
    public void test5() {
        int[] nums = {3,0,-2,-1,1,2};
        List<List<Integer>> results = Arrays.asList(
                Arrays.asList(-2,-1,3),
                Arrays.asList(-2,0,2),
                Arrays.asList(-1,0,1));
        assertThat(solution1.threeSum(nums)).containsExactlyInAnyOrderElementsOf(results);
    }
}
