import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _125_Test {

    private static final _125.Solution SOLUTION = new _125.Solution();

    @Test
    public void test1() {
        String s = "A man, a plan, a canal: Panama";
        assertThat(SOLUTION.isPalindrome(s)).isTrue();
    }

    @Test
    public void test2() {
        String s = "race a car";
        assertThat(SOLUTION.isPalindrome(s)).isFalse();
    }

    @Test
    public void test3() {
        String s = ";:";
        assertThat(SOLUTION.isPalindrome(s)).isTrue();
    }
}
