import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _77_Test {

    private static final _77.Solution SOLUTION = new _77.Solution();

    @Test
    public void test1() {
        int n = 4;
        int k = 2;
        List<List<Integer>> results = List.of(
                List.of(1,2),
                List.of(1,3),
                List.of(1,4),
                List.of(2,3),
                List.of(2,4),
                List.of(3,4));
        assertThat(SOLUTION.combine(n, k)).isEqualTo(results);
    }

    @Test
    public void test2() {
        int n = 1;
        int k = 1;
        List<List<Integer>> results = List.of(List.of(1));
        assertThat(SOLUTION.combine(n, k)).isEqualTo(results);
    }
}
