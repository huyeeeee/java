package leetcode;

import java.util.ArrayList;
import java.util.List;

public class findTarget_653 {
	public static List<Integer> in = new ArrayList<>();
	public static boolean findTarget(TreeNode root,int k){
		inOrder(root);
		for (int i = 0;i < in.size()-1;i++){
			for (int j = i+1;j < in.size();j++){
				if (in.get(i) + in.get(j) == k)
					return true;
			}
		}
		return false;
	}

	public static void inOrder(TreeNode root){
		if (root.left != null)
			inOrder(root.left);
		in.add(root.val);
		if (root.right != null)
			inOrder(root.right);
	}

	public static void main(String[] args){
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(6);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		System.out.println(findTarget(t1,28));
	}
}
