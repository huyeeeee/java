package leetcode;

public class maxDepth_104 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right));
    }
}
