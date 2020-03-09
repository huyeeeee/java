package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class averageOfLevels_637 {
	public static List<Double> averageOfLevels(TreeNode root){
		Queue<TreeNode> t1 = new ArrayDeque<>();
		Queue<TreeNode> t2 = new ArrayDeque<>();
		List<Double> result = new ArrayList<>();
		if (root == null)
			return result;
		t1.add(root);
		TreeNode temp;

		while (true){
			while (t1.size() != 0){
				temp = t1.poll();
				t2.add(temp);
			}
			long sum = 0,count = 0;
			while (t2.size() != 0){
				temp = t2.poll();

				if (temp.left != null){
					t1.add(temp.left);
				}
				if (temp.right != null){
					t1.add(temp.right);
				}

				sum += temp.val;
				count ++;
			}
			System.out.println(sum + " " + count);
			result.add((double)sum / (double)count);
			if (t1.size() == 0 && t2.size() == 0)
				break;
		}
		return result;
	}

	public static void main(String[] args){
		TreeNode t1 = new TreeNode(2147483647);
		TreeNode t2 = new TreeNode(2147483647);
		TreeNode t3 = new TreeNode(2147483647);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		t1.left = t2;
		t1.right = t3;
//		t2.left = t4;
//		t2.right = t5;
//		t3.right = t6;
		System.out.println(averageOfLevels(t1));
	}
}
