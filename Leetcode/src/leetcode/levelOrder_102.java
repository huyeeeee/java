package leetcode;

import java.util.*;

public class levelOrder_102 {
    public List<List<Integer>> levelOrder(TreeNode root){
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


    public static void main(String[] args){

    }
}
