import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _242_Test {
    private static _242.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _242.Solution();
    }

    @Test
    public void test1() {
        String s = "anagram";
        String t = "nagaram";
        assertThat(solution.isAnagram(s, t)).isTrue();
    }

    @Test
    public void test2() {
        String s = "rat";
        String t = "car";
        assertThat(solution.isAnagram(s, t)).isFalse();
    }
}
