import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < in.length; i++) {
            map.put(in[i], i);
        }
        Stack<TreeNode> stack = new Stack<>();
        int val = pre[0];
        TreeNode root = new TreeNode(val);
        stack.push(root);
        for (int i = 1; i < pre.length; i++) {
            val = pre[i];
            TreeNode node = new TreeNode(val);
            if (map.get(val) < map.get(stack.peek().val))
                stack.peek().left = node;
            else {
                TreeNode parent = null;
                while (!stack.isEmpty() && map.get(val) > map.get(stack.peek().val)) {
                    parent = stack.pop();
                }
                parent.right = node;
            }
            stack.push(node);
        }
        return root;
    }
}
