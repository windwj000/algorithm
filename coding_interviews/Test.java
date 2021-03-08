import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character, Boolean> hm = new HashMap<>();
        for (char c : str.toCharArray()) {
            hm.put(c, !hm.containsKey(c));
        }
        for (int i = 0; i < str.length(); i++) {
            if (hm.get(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
