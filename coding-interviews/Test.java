import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public int numDecodings(String s) {
        int len = s.length();
        if (s == null || len == 0)
            return 0;
        int pp = 0;
        int p = 1;
        for (int i = len - 1; i >= 0; i--) {
            int cur = s.charAt(i) == '0' ? 0 : p;
            if (i < len - 1 && (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) < '7')))
                cur += pp;
            pp = p;
            p = cur;
        }
        return p;
    }
}
