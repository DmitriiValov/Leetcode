import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _344_Test {

    private static _344.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _344.Solution();
    }

    @Test
    public void test1() {
        char[] chars = {'h','e','l','l','o'};
        char[] results = {'o','l','l','e','h'};
        solution.reverseString(chars);
        assertThat(chars).isEqualTo(results);
    }
}
