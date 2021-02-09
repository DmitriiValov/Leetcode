import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class _538_Test {

    private static _538.Solution solution;

    private static _538.TreeNode root1;
    private static _538.TreeNode expected1;

    @BeforeClass
    public static void setup() {
        solution = new _538.Solution();

        root1 = new _538.TreeNode(
                4,
                new _538.TreeNode(1,
                        new _538.TreeNode(0),
                        new _538.TreeNode(2,
                                null,
                                new _538.TreeNode(3))),
                new _538.TreeNode(6,
                        new _538.TreeNode(5),
                        new _538.TreeNode(7,
                                null,
                                new _538.TreeNode(8)))
        );

        expected1 = new _538.TreeNode(
                30,
                new _538.TreeNode(36,
                        new _538.TreeNode(36),
                        new _538.TreeNode(35,
                                null,
                                new _538.TreeNode(33))),
                new _538.TreeNode(21,
                        new _538.TreeNode(26),
                        new _538.TreeNode(15,
                                null,
                                new _538.TreeNode(8)))
        );
    }

    @Test
    public void test1() {
        assertThat(solution.convertBST(root1)).isEqualTo(expected1);
    }
}
