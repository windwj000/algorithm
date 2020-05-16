import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class Test {
    public int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[low] == array[mid] && array[mid] == array[high])
                return minNumber(array, low, high);
            if (array[mid] > array[high])
                low = mid + 1;
            else
                high = mid;
        }
        return array[low];
    }

    private int minNumber(int[] array, int low, int high) {
        for (int i = low; i < high; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[low];
    }
}
