import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public String Serialize(TreeNode root) {
        if (root == null)
            return "";
        Queue<TreeNode> q = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode n = q.poll();
            if (n == null) {
                sb.append("#").append(",");
                continue;
            }
            sb.append(n.val).append(",");
            q.offer(n.left);
            q.offer(n.right);
        }
        return sb.toString();
    }

    public TreeNode Deserialize(String str) {
        if (str == "")
            return null;
        String[] sa = str.split(",");
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(sa[0]));
        q.offer(root);
        for (int i = 1; i < sa.length; i++) {
            TreeNode n = q.poll();
            if (!sa[i].equals("#")) {
                TreeNode left = new TreeNode(Integer.valueOf(sa[i]));
                n.left = left;
                q.offer(left);
            }
            if (!sa[++i].equals("#")) {
                TreeNode right = new TreeNode(Integer.valueOf(sa[i]));
                n.right = right;
                q.offer(right);
            }
        }
        return root;
    }
}
