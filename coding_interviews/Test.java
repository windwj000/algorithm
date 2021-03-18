import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        dfs(pRoot, res, 0);
        return res;
    }

    private void dfs(TreeNode node, ArrayList<ArrayList<Integer>> res, int level) {
        if (node == null) {
            return;
        }
        if (level == res.size()) {
            ArrayList<Integer> newLevel = new ArrayList<>();
            res.add(newLevel);
        }
        ArrayList<Integer> tmp = res.get(level);
        if (level % 2 == 0) {
            tmp.add(node.val);
        } else {
            tmp.add(0, node.val);
        }
        dfs(node.left, res, level + 1);
        dfs(node.right, res, level + 1);
    }
}
