import org.junit.Test;
import utils.ListNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _876_Test {

    private static final _876.Solution SOLUTION = new _876.Solution();

    @Test
    public void test1() {
        assertThat(SOLUTION.middleNode(new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5)))))))
                .isEqualTo(new ListNode(3, new ListNode(4, new ListNode(5)))
        );
    }
}
