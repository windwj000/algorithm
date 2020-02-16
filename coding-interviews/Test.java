import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        TreeNode p = root;
        while (!s.isEmpty() || p != null) {
            while (p != null) {
                s.push(p);
                list.add(p.val);
                target -= p.val;
                p = p.left != null ? p.left : p.right;
            }
            p = s.pop();
            if (target == 0 && p.left == null && p.right == null)
                res.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            target += p.val;
            if (!s.isEmpty() && s.peek().left == p)
                p = s.peek().right;
            else
                p = null;
        }
        return res;
    }
}
