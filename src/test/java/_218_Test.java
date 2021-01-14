import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _218_Test {

    private static _218.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _218.Solution1();
    }

    @Test
    public void test1() {
        int[][] buildings = { {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8} };
        List<List<Integer>> results = Arrays.asList(
                Arrays.asList(2, 10),
                Arrays.asList(3, 15),
                Arrays.asList(7, 12),
                Arrays.asList(12, 0),
                Arrays.asList(15, 10),
                Arrays.asList(20, 8),
                Arrays.asList(24, 0));
        assertThat(solution1.getSkyline(buildings)).isEqualTo(results);
    }
}
