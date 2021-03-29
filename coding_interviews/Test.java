import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<>();
        HashMap<TreeNode, TreeNode> map = new HashMap<>();
        stack.push(root);
        map.put(root, null);
        while (!map.containsKey(p) || !map.containsKey(q)) {  //注意
            TreeNode node = stack.pop();
            if (node.left != null) {
                map.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                map.put(node.right, node);
                stack.push(node.right);
            }
        }
        HashSet<TreeNode> set = new HashSet<>();
        while (p != null) {
            set.add(p);
            p = map.get(p);
        }
        while (!set.contains(q)) {
            q = map.get(q);
        }
        return q;
    }
}
