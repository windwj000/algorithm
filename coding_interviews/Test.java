import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public int JumpFloorII(int target) {
        int a = 1;
        int b = 2;
        for (int i = 2; i <= target; i++) {
            b = a * 2;
            a = b;
        }
        return a;
    }
}
