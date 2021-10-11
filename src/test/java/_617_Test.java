import org.junit.Test;
import utils.TreeNode;

import static org.assertj.core.api.Assertions.assertThat;

public class _617_Test {

    private static final _617.Solution SOLUTION = new _617.Solution();

    @Test
    public void test1() {
        TreeNode root1 = new TreeNode(
                1,
                new TreeNode(3,
                        new TreeNode(5),
                        null
                        ),
                new TreeNode(2)
        );
        TreeNode root2 = new TreeNode(
                2,
                new TreeNode(1,
                        null,
                        new TreeNode(4)
                ),
                new TreeNode(3,
                        null,
                        new TreeNode(7))
        );
        TreeNode output = new TreeNode(
                3,
                new TreeNode(4,
                        new TreeNode(5),
                        new TreeNode(4)
                ),
                new TreeNode(5,
                        null,
                        new TreeNode(7))
        );
        assertThat(SOLUTION.mergeTrees(root1, root2)).isEqualTo(output);
    }
}
