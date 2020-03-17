package interview;


public class maxDepth_interview_55_1 {
	public static int maxDepth(TreeNode root){
		return root == null ? 0 : Math.max(maxDepth(root.right),maxDepth(root.left)) + 1;
	}
	public static void main(String[] args){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		System.out.println(maxDepth(t1));
	}
}
