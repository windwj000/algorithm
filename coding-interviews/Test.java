import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)
            return true;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(pRoot.left);
        q.offer(pRoot.right);
        while (!q.isEmpty()) {
            TreeNode left = q.poll();
            TreeNode right = q.poll();
            if (left == null && right == null)
                continue;
            if (left == null || right == null || left.val != right.val)
                return false;
            q.offer(left.left);
            q.offer(right.right);
            q.offer(left.right);
            q.offer(right.left);
        }
        return true;
    }
}
