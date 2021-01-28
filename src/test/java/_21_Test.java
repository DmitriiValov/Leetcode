import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _21_Test {

    private static final _21.Solution SOLUTION = new _21.Solution();

    @Test
    public void test1() {
        _21.ListNode l1 = new _21.ListNode(1, new _21.ListNode(2, new _21.ListNode(4)));
        _21.ListNode l2 = new _21.ListNode(1, new _21.ListNode(3, new _21.ListNode(4)));

        assertThat(SOLUTION.mergeTwoLists(l1, l2)).isEqualTo(
                new _21.ListNode(1,
                        new _21.ListNode(1,
                                new _21.ListNode(2,
                                        new _21.ListNode(3,
                                                new _21.ListNode(4,
                                                        new _21.ListNode(4)
                                                )
                                        )
                                )
                        )
                )
        );
    }
}
