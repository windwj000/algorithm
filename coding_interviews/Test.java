import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    private int cnt = 0;

    public int InversePairs(int[] array) {
        mergeSort(array, 0, array.length - 1);
        return cnt;
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mergeSort(array, low, mid);
            mergeSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    private void merge(int[] array, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] tmp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (array[i] <= array[j]) {
                tmp[k++] = array[i++];
            } else {
                tmp[k++] = array[j++];
                cnt += mid - i + 1;
                cnt %= 1000000007;
            }
        }
        while (i <= mid) {
            tmp[k++] = array[i++];
        }
        while (j <= high) {
            tmp[k++] = array[j++];
        }
        for (k = 0; k < tmp.length; k++) {
            array[k + low] = tmp[k];
        }
    }
}
