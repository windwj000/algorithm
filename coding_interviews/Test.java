import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public double Power(double base, int exponent) {
        if (exponent == 0)
            return 1;
        if (exponent == 1)
            return base;
        int n = exponent;
        if (exponent < 0) {
            if (base == 0)
                throw new RuntimeException("base can't be 0!");
            n = -n;
        }
        double res = Power(base * base, n >> 1);
        if ((exponent & 1) == 1)
            res *= base;
        return exponent > 0 ? res : 1 / res;
    }
}
