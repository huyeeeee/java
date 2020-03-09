package leetcode;

import java.util.*;

public class levelOrder_429 {
	public List<List<Integer>> levelOrder(Node1 root){
		List<List<Integer>> result = new ArrayList<>();
		Queue<Node1> q = new ArrayDeque<>();
		if (root != null){
			q.add(root);
			while (q.size() != 0){
				List<Integer> temp = new ArrayList<>();
				int len = q.size();
				for (int i = 0;i < len;i++){
					Node1 node = q.poll();
					if (node.children.size() != 0){
						for (Node1 n : node.children){
							q.add(n);
						}
					}
					temp.add(node.val);
				}
				result.add(temp);
			}
		}
		return result;
	}
}
