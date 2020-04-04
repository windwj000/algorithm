import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = (int) Math.sqrt(2 * sum); i >= 2; i--) {
            if ((i & 1) == 1 && sum % i == 0 || (sum % i) * 2 == i) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = 0, k = (sum / i) - (i - 1) / 2; j < i; j++, k++) {
                    list.add(k);
                }
                res.add(list);
            }
        }
        return res;
    }
}
