import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            if (array[low] + array[high] == sum)
                return new ArrayList<>(Arrays.asList(array[low], array[high]));
            if (array[low] + array[high] < sum)
                low++;
            else
                high--;
        }
        return new ArrayList<>();
    }
}
