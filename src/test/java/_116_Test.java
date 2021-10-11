import org.junit.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _116_Test {

    private static final _116.Solution SOLUTION = new _116.Solution();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5),
                        null
                ),
                new TreeNode(3,
                        new TreeNode(6),
                        new TreeNode(7),
                        null
                ),
                null
        );

        TreeNode node7 = new TreeNode(7);
        TreeNode node6 = new TreeNode(6);
        node6.next = node7;
        TreeNode node5 = new TreeNode(5);
        node5.next = node6;
        TreeNode node4 = new TreeNode(4);
        node4.next = node5;
        TreeNode node3 = new TreeNode(3,
                node6,
                node7,
                null);
        TreeNode node2 = new TreeNode(2,
                node4,
                node5,
                node3);
        TreeNode output = new TreeNode(1,
                node2,
                node3,
                null);
        assertThat(SOLUTION.connect(root)).isEqualTo(output);
    }

    @Test
    public void test2() {
        TreeNode root = null;
        TreeNode output = null;
        assertThat(SOLUTION.connect(root)).isEqualTo(output);
    }
}
