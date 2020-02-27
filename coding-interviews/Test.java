import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    private int[] a = new int[128];
    private StringBuilder sb = new StringBuilder();

    //Insert one char from stringstream
    public void Insert(char ch) {
        sb.append(ch);
        a[ch]++;
    }

    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (char c : sb.toString().toCharArray()) {
            if (a[c] == 1)
                return c;
        }
        return '#';
    }
}
