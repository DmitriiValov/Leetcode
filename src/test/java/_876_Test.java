import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _876_Test {

    private static final _876.Solution SOLUTION = new _876.Solution();

    @Test
    public void test1() {
        assertThat(SOLUTION.middleNode(new _876.ListNode(1, new _876.ListNode(2, new _876.ListNode(3,
                new _876.ListNode(4, new _876.ListNode(5)))))))
                .isEqualTo(new _876.ListNode(3, new _876.ListNode(4, new _876.ListNode(5)))
        );
    }
}
