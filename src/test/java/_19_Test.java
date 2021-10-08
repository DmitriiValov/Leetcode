import org.junit.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _19_Test {

    private static final _19.Solution SOLUTION = new _19.Solution();

    @Test
    public void test1() {
        int n = 2;
        assertThat(SOLUTION.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5))))), n))
                .isEqualTo(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))))
                );
    }
}
