import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _9_Test {

    private static _9.Solution1 solution1;

    @BeforeClass
    public static void setup() {
        solution1 = new _9.Solution1();
    }

    @Test
    public void test1() {
        assertThat(solution1.isPalindrome(121)).isTrue();
    }

    @Test
    public void test2() {
        assertThat(solution1.isPalindrome(-121)).isFalse();
    }

    @Test
    public void test3() {
        assertThat(solution1.isPalindrome(10)).isFalse();
    }

    @Test
    public void test4() {
        assertThat(solution1.isPalindrome(123454321)).isTrue();
    }
}
