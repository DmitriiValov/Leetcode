import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _567_Test {

    private static final _567.Solution SOLUTION = new _567.Solution();

    @Test
    public void test1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        assertThat(SOLUTION.checkInclusion(s1, s2)).isTrue();
    }

    @Test
    public void test2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        assertThat(SOLUTION.checkInclusion(s1, s2)).isFalse();
    }

    @Test
    public void test3() {
        String s1 = "adc";
        String s2 = "dcda";
        assertThat(SOLUTION.checkInclusion(s1, s2)).isTrue();
    }
}
