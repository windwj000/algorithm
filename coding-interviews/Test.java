import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        int diff = 0;
        for (int a : array) {
            diff ^= a;
        }
        diff &= -diff;
        for (int a : array) {
            if ((diff & a) == 0)
                num1[0] ^= a;
            else
                num2[0] ^= a;
        }
    }
}
