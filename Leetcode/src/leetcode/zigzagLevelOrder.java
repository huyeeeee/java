package leetcode;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class zigzagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root){
		Queue<TreeNode> q1 = new ArrayDeque<>();
		Queue<TreeNode> q2 = new ArrayDeque<>();
		List<List<Integer>> result = new ArrayList<>();
		if (root == null){
			return result;
		}
		q1.add(root);
		while (q1.size() != 0 || q2.size() != 0){
			List<Integer> temp = new ArrayList<>();
			TreeNode t;
			if (q1.size() != 0 && q2.size() == 0){

				while (q1.size() != 0){
					t = q1.poll();
					if (t.left != null){
						q2.add(t.left);
					}
					if (t.right != null){
						q2.add(t.right);
					}
					temp.add(t.val);
				}
			}
			else {
				while (q2.size() != 0){
					t = q2.poll();
					if (t.left != null){
						q1.add(t.left);
					}
					if (t.right != null){
						q1.add(t.right);
					}
					temp.add(0,t.val);
				}
			}
			result.add(temp);
		}
		return result;
	}
}
