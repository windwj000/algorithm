public class Test {
    public int[] multiply(int[] A) {
        int len = A.length;
        int[] B = new int[len];
        if (A == null || len == 0)
            return B;
        B[0] = 1;
        for (int i = 1; i < len; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        for (int i = len - 2, tmp = 1; i >= 0; i--) {
            tmp *= A[i + 1];
            B[i] *= tmp;
        }
        return B;
    }
}
