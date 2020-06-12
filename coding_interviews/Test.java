import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    private int n = 0;

    public int[] printNumbers(int n) {
        int[] res = new int[(int) Math.pow(10, n) - 1];
        if (n <= 0) {
            return res;
        }
        char[] array = new char[n];
        printNumbers(array, res, 0);
        return res;
    }

    private void printNumbers(char[] array, int[] res, int idx) {
        if (idx == array.length) {
            print(array, res);
            return;
        }
        for (int i = 0; i < 10; i++) {
            array[idx] = (char) (i + '0');
            printNumbers(array, res, idx + 1);
        }
    }

    private void print(char[] array, int[] res) {
        int i = 0;
        while (i < array.length && array[i] == '0') {
            i++;
        }
        int tmp = 0;
        while (i < array.length) {
            tmp = tmp * 10 + array[i++] - '0';
        }
        if (tmp == 0) {
            return;
        }
        res[n++] = tmp;
    }
}
