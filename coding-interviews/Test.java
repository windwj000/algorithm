import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0)
            return false;
        int len = sequence.length;
        int rootVal = sequence[len - 1];
        int idx = 0;
        while (len-- > 0) {
            while (sequence[idx] < rootVal) {
                idx++;
            }
            while (sequence[idx] > rootVal) {
                idx++;
            }
            if (idx < len)
                return false;
            idx = 0;
        }
        return true;
    }
}
