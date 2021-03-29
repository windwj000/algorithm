import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        if (exponent == 1) {
            return base;
        }
        double res = 1.0;
        int n = exponent;
        if (exponent < 0) {
            if (base == 0) {
                throw new RuntimeException("base can't be 0!");
            }
            n = -n;
        }
        while (n > 0) {
            if ((n & 1) == 1) {
                res *= base;
            }
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? res : 1 / res;
    }
}
