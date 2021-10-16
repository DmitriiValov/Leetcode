import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _120_Test {

    private static final _120.Solution SOLUTION = new _120.Solution();

    @Test
    public void test1() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3,4),
                List.of(5,6,7),
                List.of(4,1,8,3));
        int output = 11;
        assertThat(SOLUTION.minimumTotal(triangle)).isEqualTo(output);
    }

    @Test
    public void tes2() {
        List<List<Integer>> triangle = List.of(List.of(-10));
        int output = -10;
        assertThat(SOLUTION.minimumTotal(triangle)).isEqualTo(output);
    }
}
