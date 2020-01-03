public class Test {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n = (n - 1) & n;
        }
        return cnt;
    }
}
