import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int TreeDepth(TreeNode root) {
        if (root == null)
            return 0;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        s1.push(root);
        s2.push(1);
        int depth = 0;
        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            int tmp = s2.pop();
            depth = Math.max(depth, tmp);
            if (node.left != null) {
                s1.push(node.left);
                s2.push(tmp + 1);
            }
            if (node.right != null) {
                s1.push(node.right);
                s2.push(tmp + 1);
            }
        }
        return depth;
    }
}
