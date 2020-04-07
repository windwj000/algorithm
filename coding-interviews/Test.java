import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public String LeftRotateString(String str, int n) {
        int len = str.length();
        if (str == null || len == 0)
            return "";
        if (n >= len)
            return str;
        str += str;
        return str.substring(n, n + len);
    }
}
