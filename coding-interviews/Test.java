import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        f(pRoot, res, 0);
        return res;
    }

    private void f(TreeNode node, ArrayList<ArrayList<Integer>> res, int level) {
        if (node == null)
            return;
        if (res.size() <= level) {
            ArrayList<Integer> newLevel = new ArrayList<>();
            res.add(newLevel);
        }
        ArrayList<Integer> tmp = res.get(level);
        if (level % 2 == 0)
            tmp.add(node.val);
        else
            tmp.add(0, node.val);
        f(node.left, res, level + 1);
        f(node.right, res, level + 1);
    }
}
