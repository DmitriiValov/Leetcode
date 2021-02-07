import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class _199_Test {

    private static final _199.Solution SOLUTION = new _199.Solution();

    @Test
    public void test1() {
        _199.TreeNode root = new _199.TreeNode(
                1,
                new _199.TreeNode(2,
                        null,
                        new _199.TreeNode(5)),
                new _199.TreeNode(3,
                        null,
                        new _199.TreeNode(4))
        );
        assertThat(SOLUTION.rightSideView(root)).isEqualTo(List.of(1, 3, 4));
    }

    @Test
    public void test2() {
        _199.TreeNode root = new _199.TreeNode(
                1,
                new _199.TreeNode(2,
                        null,
                        null),
                null
        );
        assertThat(SOLUTION.rightSideView(root)).isEqualTo(List.of(1, 2));
    }
}
