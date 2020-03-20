import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int GetNumberOfK(int[] array, int k) {
        int first = binarySearch(array, k);
        int last = binarySearch(array, k + 1);
        return last - first;
    }

    private int binarySearch(int[] array, int k) {
        int low = 0;
        int high = array.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (array[mid] < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low;
    }
}
