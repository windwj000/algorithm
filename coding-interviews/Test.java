import javax.swing.tree.TreeNode;
import java.util.*;

public class Test {
    class Node {
        int val;
        int cnt;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.cnt = 1;
        }
    }

    public TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null)
            return null;
        Node node = build(pRoot);
        int val = kthSmallest(node, k);
        return search(pRoot, val);
    }

    private Node build(TreeNode root) {
        if (root == null)
            return null;
        Node node = new Node(root.val);
        node.left = build(root.left);
        node.right = build(root.right);
        if (node.left != null)
            node.cnt += node.left.cnt;
        if (node.right != null)
            node.cnt += node.right.cnt;
        return node;
    }

    private int kthSmallest(Node node, int k) {
        if (k <= 0 || k > node.cnt)
            return -1;
        if (node.left != null) {
            if (node.left.cnt > k - 1)
                return kthSmallest(node.left, k);
            if (node.left.cnt == k - 1)
                return node.val;
            return kthSmallest(node.right, k - 1 - node.left.cnt);
        } else {
            if (k == 1)
                return node.val;
            return kthSmallest(node.right, k - 1);
        }
    }

    private TreeNode search(TreeNode root, int val) {
        if (root == null || val == -1)
            return null;
        if (root.val == val)
            return root;
        if (root.val > val)
            return search(root.left, val);
        return search(root.right, val);
    }
}
