import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _46_Test {

    private static final _46.Solution SOLUTION = new _46.Solution();

    @Test
    public void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> results = List.of(
                List.of(1,2,3),
                List.of(1,3,2),
                List.of(2,1,3),
                List.of(2,3,1),
                List.of(3,1,2),
                List.of(3,2,1));
        assertThat(SOLUTION.permute(nums)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int[] nums = {0,1};
        List<List<Integer>> results = List.of(
                List.of(0,1),
                List.of(1,0));
        assertThat(SOLUTION.permute(nums)).isEqualTo(results);
    }

    @Test
    public void test3() {
        int[] nums = {1};
        List<List<Integer>> results = List.of(List.of(1));
        assertThat(SOLUTION.permute(nums)).isEqualTo(results);
    }
}
