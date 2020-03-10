import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int FirstNotRepeatingChar(String str) {
        BitSet bs1 = new BitSet(128);
        BitSet bs2 = new BitSet(128);
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (!bs1.get(c) && !bs2.get(c)) {
                bs1.set(c);
            } else if (bs1.get(c) && !bs2.get(c))
                bs2.set(c);
        }
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (bs1.get(c) && !bs2.get(c))
                return i;
        }
        return -1;
    }
}
