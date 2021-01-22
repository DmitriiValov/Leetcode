import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _1657_Test {

    private static _1657.Solution solution;

    @BeforeClass
    public static void setup() {
        solution = new _1657.Solution();
    }

    @Test
    public void test1() {
        String word1 = "abc";
        String word2 = "bca";
        assertThat(solution.closeStrings(word1, word2)).isTrue();
    }

    @Test
    public void test2() {
        String word1 = "a";
        String word2 = "aa";
        assertThat(solution.closeStrings(word1, word2)).isFalse();
    }

    @Test
    public void test3() {
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertThat(solution.closeStrings(word1, word2)).isTrue();
    }

    @Test
    public void test4() {
        String word1 = "cabbba";
        String word2 = "aabbss";
        assertThat(solution.closeStrings(word1, word2)).isFalse();
    }
}
