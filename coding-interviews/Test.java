import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null)
            return true;
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        HashMap<TreeNode, Integer> map = new HashMap<>();
        while (!s.isEmpty()) {
            TreeNode node = s.pop();
            if ((node.left == null || node.left != null && map.containsKey(node.left)) &&
                    (node.right == null || node.right != null && map.containsKey(node.right))) {
                int left = (node.left == null) ? 0 : map.get(node.left);
                int right = (node.right == null) ? 0 : map.get(node.right);
                if (Math.abs(left - right) > 1)
                    return false;
                map.put(node, 1 + Math.max(left, right));
            } else {
                if (node.left != null && !map.containsKey(node.left)) {
                    s.push(node);
                    s.push(node.left);
                } else {
                    s.push(node);
                    s.push(node.right);
                }
            }
        }
        return true;
    }
}
