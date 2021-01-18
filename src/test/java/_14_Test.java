import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _14_Test {

    private static _14.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _14.Solution1();
    }

    @Test
    public void test1() {
        String[] strs = {"flower","flow","flight"};
        assertThat(solution1.longestCommonPrefix(strs)).isEqualTo("fl");
    }

    @Test
    public void test2() {
        String[] strs = {"dog","racecar","car"};
        assertThat(solution1.longestCommonPrefix(strs)).isEqualTo("");
    }

    @Test
    public void test3() {
        String[] strs = {"ab","a"};
        assertThat(solution1.longestCommonPrefix(strs)).isEqualTo("a");
    }

    @Test
    public void test4() {
        String[] strs = {"abab","aba",""};
        assertThat(solution1.longestCommonPrefix(strs)).isEqualTo("");
    }
}
