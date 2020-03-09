package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class findSecondMinimumValue_671 {
	public int findSecondMinimumValue(TreeNode root){
		midOrder(root);
		Collections.sort(order);
		int sec = order.get(0);
		if (order.size() < 2)
			return -1;
		for (int i = 0;i < order.size();i++){
			if (sec != order.get(i)){
				return order.get(i);
			}
		}
		return -1;
	}
	private ArrayList<Integer> order = new ArrayList<>();
	private void midOrder(TreeNode root){
		if (root.left != null){
			midOrder(root.left);
		}
		order.add(root.val);
		if (root.right != null){
			midOrder(root.right);
		}
	}
}
