public class Test {
    public double Power(double base, int exponent) {
        double res = 1;
        double cur = base;
        int n = exponent;
        if (exponent == 0)
            return 1;
        if (exponent < 0) {
            if (base == 0)
                throw new RuntimeException("base cant be 0!");
            n = -n;
        }
        while (n > 0) {
            if ((n & 1) == 1)
                res *= cur;
            cur *= cur;
            n >>= 1;
        }
        return exponent > 0 ? res : 1 / res;
    }
}
