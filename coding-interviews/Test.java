import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        f(pRoot, res, 0);
        return res;
    }

    private void f(TreeNode pRoot, ArrayList<ArrayList<Integer>> res, int depth) {
        if (pRoot == null)
            return;
        if (depth == res.size())
            res.add(new ArrayList<Integer>());
        res.get(depth).add(pRoot.val);
        f(pRoot.left, res, depth + 1);
        f(pRoot.right, res, depth + 1);
    }
}
