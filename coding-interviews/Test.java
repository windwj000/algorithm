import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int Add(int num1, int num2) {
        return num2 == 0 ? num1 : Add(num1 ^ num2, (num1 & num2) << 1);
    }
}
