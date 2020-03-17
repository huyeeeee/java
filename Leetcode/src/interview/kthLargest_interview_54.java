package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class kthLargest_interview_54 {
	private int res = 0,count = 0;
	public int kthLargest(TreeNode root,int k){
		getValues(root,k);
		return res;
	}
	private void getValues(TreeNode root,int k){
		if (root == null)
			return;
		getValues(root.right,k);
		if (++count == k){
			res = root.val;
			return;
		}
		getValues(root.left,k);
	}
}
