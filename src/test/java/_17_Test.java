import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _17_Test {

    private static _17.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _17.Solution1();
    }

    @Test
    public void test1() {
        String digits = "23";
        List<String> results = Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf");
        assertThat(solution1.letterCombinations(digits)).containsExactlyInAnyOrderElementsOf(results);
    }

    @Test
    public void test2() {
        String digits = "";
        List<String> results = Arrays.asList();
        assertThat(solution1.letterCombinations(digits)).containsExactlyInAnyOrderElementsOf(results);
    }

    @Test
    public void test3() {
        String digits = "2";
        List<String> results = Arrays.asList("a","b","c");
        assertThat(solution1.letterCombinations(digits)).containsExactlyInAnyOrderElementsOf(results);
    }
}
