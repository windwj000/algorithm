import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int[] multiply(int[] A) {
        int len = A.length;
        if (A == null || len == 0) {
            return A;
        }
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = 1;
        right[len - 1] = 1;
        for (int i = 1; i < len; i++) {
            left[i] = left[i - 1] * A[i - 1];
        }
        for (int i = len - 2; i >= 0; i--) {    //注意，从 len-2 开始
            right[i] = right[i + 1] * A[i + 1];
        }
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = left[i] * right[i];
        }
        return res;
    }
}
