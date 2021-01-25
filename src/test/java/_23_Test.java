import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _23_Test {

    private static final _23.Solution SOLUTION = new _23.Solution();

    @Test
    public void test1() {
        assertThat(SOLUTION.mergeKLists(
                new _23.ListNode[]{
                        new _23.ListNode(1, new _23.ListNode(5, new _23.ListNode(5))),
                        new _23.ListNode(1, new _23.ListNode(3, new _23.ListNode(4))),
                        new _23.ListNode(2, new _23.ListNode(6))
                })).isEqualTo(
                new _23.ListNode(1,
                        new _23.ListNode(1,
                                new _23.ListNode(2,
                                        new _23.ListNode(3,
                                                new _23.ListNode(4,
                                                        new _23.ListNode(5,
                                                                new _23.ListNode(5,
                                                                        new _23.ListNode(6)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test2() {
        assertThat(SOLUTION.mergeKLists(
                new _23.ListNode[]{
                        new _23.ListNode(1, new _23.ListNode(4, new _23.ListNode(5))),
                        new _23.ListNode(1, new _23.ListNode(3, new _23.ListNode(4))),
                        new _23.ListNode(2, new _23.ListNode(6))
                })).isEqualTo(
                new _23.ListNode(1,
                        new _23.ListNode(1,
                                new _23.ListNode(2,
                                        new _23.ListNode(3,
                                                new _23.ListNode(4,
                                                        new _23.ListNode(4,
                                                                new _23.ListNode(5,
                                                                        new _23.ListNode(6)
                                                                )
                                                        )
                                                )
                                        )
                                )
                        )
                )
        );
    }

    @Test
    public void test3() {
        assertThat(SOLUTION.mergeKLists(new _23.ListNode[]{}))
                .isEqualTo(null);
    }

    @Test
    public void test4() {
        assertThat(SOLUTION.mergeKLists(new _23.ListNode[]{null, new _23.ListNode(1)}))
                .isEqualTo(new _23.ListNode(1));
    }

    @Test
    public void test5() {
        assertThat(SOLUTION.mergeKLists(new _23.ListNode[]{null, null}))
                .isEqualTo(null);
    }
}
