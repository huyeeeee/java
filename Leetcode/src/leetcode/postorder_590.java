package leetcode;

import java.util.ArrayList;
import java.util.List;

public class postorder_590 {
	private List<Integer> res = new ArrayList<>();
	public List<Integer> postorder(Node1 root){
		if (root == null)
			return null;
		if (root.children.size() != 0){
			res.add(root.val);
			for (int i = 0;i < root.children.size();i++){
				postorder(root.children.get(i));
			}

		}
		else {
			res.add(root.val);
		}
		return res;
	}

	public static void main(String[] args){

	}
}
class Node1{
	public int val;
	public List<Node1> children;

	public Node1() {}

	public Node1(int _val) {
		val = _val;
	}

	public Node1(int _val, List<Node1> _children) {
		val = _val;
		children = _children;
	}
}
