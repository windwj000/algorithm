import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return res;
        }
        backtracking(str.toCharArray(), res, 0);
        Collections.sort(res);
        return res;
    }

    private void backtracking(char[] ca, ArrayList<String> res, int idx) {
        if (idx == ca.length - 1) {
            res.add(String.valueOf(ca));
            return;
        }
        HashSet<Character> hs = new HashSet<>();
        for (int i = idx; i < ca.length; i++) {
            if (hs.contains(ca[i])) {  //注意
                continue;
            }
            hs.add(ca[i]);
            swap(ca, i, idx);
            backtracking(ca, res, idx + 1);
            swap(ca, i, idx);
        }
    }

    private void swap(char[] ca, int i, int j) {
        char tmp = ca[i];
        ca[i] = ca[j];
        ca[j] = tmp;
    }
}
