import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int cnt = q.size();
            while (cnt-- > 0) {
                TreeNode p = q.poll();
                if (p == null)
                    continue;
                res.add(p.val);
                q.offer(p.left);
                q.offer(p.right);
            }
        }
        return res;
    }
}
