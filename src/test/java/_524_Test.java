import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _524_Test {

    private static final _524.Solution SOLUTION = new _524.Solution();

    @Test
    public void test1() {
        String s = "abpcplea";
        List<String> d = List.of("ale","apple","monkey","plea");
        String result = "apple";
        assertThat(SOLUTION.findLongestWord(s, d)).isEqualTo(result);
    }

    @Test
    public void test2() {
        String s = "abpcplea";
        List<String> d = List.of("a","b","c");
        String result = "a";
        assertThat(SOLUTION.findLongestWord(s, d)).isEqualTo(result);
    }

    @Test
    public void test3() {
        String s = "aewfafwafjlwajflwajflwafj";
        List<String> d = List.of("apple","ewaf","awefawfwaf","awef","awefe","ewafeffewafewf");
        String result = "ewaf";
        assertThat(SOLUTION.findLongestWord(s, d)).isEqualTo(result);
    }
}