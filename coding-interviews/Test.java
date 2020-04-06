import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    public String ReverseSentence(String str) {
        int len = str.length();
        char[] c = str.toCharArray();
        int i = 0;
        for (int j = 0; j <= len; j++) {
            if (j == len || str.charAt(j) == ' ') {
                reverse(c, i, j - 1);
                i = j + 1;
            }
        }
        reverse(c, 0, len - 1);
        return new String(c);
    }

    private void reverse(char[] c, int i, int j) {
        while (i < j) {
            swap(c, i++, j--);
        }
    }

    private void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }
}
