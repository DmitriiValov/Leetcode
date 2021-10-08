import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _811_Test {

    private static final _811.Solution SOLUTION = new _811.Solution();

    @Test
    public void test1() {
        String[] input = {"9001 discuss.leetcode.com", "9001 discuss.leetcode.com"};
        List<String> result = new ArrayList<>();
        result.add("18002 com");
        result.add("18002 leetcode.com");
        result.add("18002 discuss.leetcode.com");
        assertThat(SOLUTION.subdomainVisits(input)).isEqualTo(result);
    }
}
