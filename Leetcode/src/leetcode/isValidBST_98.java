package leetcode;

import java.util.ArrayList;

public class isValidBST_98 {
	public boolean isValidBST(TreeNode root){
		if (root == null)
			return true;
		inOrder(root);
		for (int i = 0;i < order.size()-1;i++){
			if (order.get(i) >= order.get(i+1)){
				return false;
			}
		}
		return true;
	}
	private ArrayList<Integer> order = new ArrayList<>();
	private void inOrder(TreeNode root){
		if (root.left != null)
			inOrder(root.left);
		order.add(root.val);
		if (root.right != null)
			inOrder(root.right);
	}
}
