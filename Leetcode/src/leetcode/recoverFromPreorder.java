package leetcode;

public class recoverFromPreorder {
//	public TreeNode recoverFromPreorder(String S) {
//		int depth = TreeDepth(S);
//		String sp = "-";
//		TreeNode root = new TreeNode(Integer.parseInt(S.substring(0,1)));
//		for (int i = 0;i < depth;i++){
//
//		}
//	}

	private int TreeDepth(String S){
		String[] temp = S.split("");
		int max = -1;
		int len = 0;
		for (String s : temp){
			if (s.equals("-")){
				len++;
			}
			else {
				if (max < len){
					max = len;
				}
				len = 0;
			}
		}
		return max;
	}

	public static void main(String[] args){
		System.out.println("Hello world 1");
	}
	static {
		System.out.println("Hello world 2");
	}

}
