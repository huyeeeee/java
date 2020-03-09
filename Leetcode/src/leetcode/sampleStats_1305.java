package leetcode;

import java.lang.reflect.Array;
import java.util.*;

public class sampleStats_1305 {
	public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
		List<Integer> result = inOrder(root1);
		List<Integer> r2 = inOrder(root2);
		result.addAll(r2);
		Collections.sort(result);
		return result;
	}

	private static List<Integer> inOrder(TreeNode root){
		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> temp = new Stack<>();
		TreeNode t = root;
		while (t != null || !temp.isEmpty()) {
			if (t != null){
				temp.push(t);
				t = t.left;
			} else {
				t = temp.pop();
				result.add(t.val);
				t = t.right;
			}
		}
		return result;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		List<Integer> re = getAllElements(t1,t1);
		System.out.println(re);
	}
}
