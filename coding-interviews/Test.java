import javax.swing.tree.TreeNode;
import java.util.Stack;

public class Test {
    public void Mirror(TreeNode root) {
        if (root == null)
            return;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()) {
            TreeNode p = s.pop();
            if (root.left != null || root.right != null) {
                TreeNode tmp = p.left;
                p.left = p.right;
                p.right = tmp;
            }
            if (p.left != null)
                s.push(p.left);
            if (p.right != null)
                s.push(p.right);
        }
    }
}
