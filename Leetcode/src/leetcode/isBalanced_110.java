package leetcode;

public class isBalanced_110 {
	public boolean isBalanced(TreeNode root){
		if (root == null)
			return true;
		return Math.abs(getHeight(root.left) - getHeight(root.right)) <= 1
				&& isBalanced(root.left) && isBalanced(root.right);
	}
	private int getHeight(TreeNode root){
		if (root == null)
			return 1;
		return 1 + Math.max(getHeight(root.right),getHeight(root.left));
	}

}
