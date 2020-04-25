import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int row = 0；
        int col = array[0].length - 1;
        while (row < array.length && col >= 0) {
            if (array[row][col] == target)
                return true;
            if (array[row][col] < target)
                row++;
            else
                col--;
        }
        return false;
    }
}
