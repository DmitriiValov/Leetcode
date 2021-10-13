import org.junit.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _206_Test {

    private static final _206.Solution SOLUTION = new _206.Solution();

    @Test
    public void test1() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode output = new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1))));

        assertThat(SOLUTION.reverseList(head)).isEqualTo(output);
    }
}
