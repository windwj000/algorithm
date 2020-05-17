import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        boolean[] flag = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (backtracking(matrix, rows, cols, str, i, j, flag, 0))
                    return true;
            }
        }
        return false;
    }

    private boolean backtracking(char[] matrix, int rows, int cols, char[] str, int i, int j, boolean[] flag, int idx) {
        int tmp = i * cols + j;
        if (i < 0 || i >= rows || j < 0 || j >= cols || matrix[tmp] != str[idx] || flag[tmp] == true)
            return false;
        if (idx == str.length - 1)
            return true;
        flag[tmp] = true;
        if (backtracking(matrix, rows, cols, str, i + 1, j, flag, idx + 1) ||
                backtracking(matrix, rows, cols, str, i - 1, j, flag, idx + 1) ||
                backtracking(matrix, rows, cols, str, i, j + 1, flag, idx + 1) ||
                backtracking(matrix, rows, cols, str, i, j - 1, flag, idx + 1))
            return true;
        flag[tmp] = false;
        return false;
    }
}
