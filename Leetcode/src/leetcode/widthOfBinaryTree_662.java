package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class widthOfBinaryTree_662 {
	public int widthOfBinaryTree(TreeNode root){
		int max = -1;
		if (root == null)
			return 0;
		List<List<Integer>> res = levelOrder(root);
		for (int i = 0;i < res.size();i++){
			if (res.get(i).size() > max)
				max = res.get(i).size();
		}
		return max;
	}

	private List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> result = new ArrayList<>();
		Queue<TreeNode> queue = new ArrayDeque<>();
		if (root != null){
			queue.add(root);
			while (queue.size() != 0){
				List<Integer> temp = new ArrayList<>();
				int len = queue.size();
				for (int i = 0;i < len;i++){
					TreeNode t = queue.poll();
					if (t.left != null){
						queue.add(t.left);
					}
					if (t.right != null){
						queue.add(t.right);
					}
					temp.add(t.val);
				}
				result.add(temp);
			}
		}
		return result;
	}
}
