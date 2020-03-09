package interview;

import java.util.Stack;

public class CQueue {
	private Stack<Integer> s1;
	private Stack<Integer> s2;
	public CQueue() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void appendTail(int value) {
		s1.push(value);
	}

	public int deleteHead() {
		if (s1.size() == 0 && s2.size() == 0){
			return -1;
		}
		while (s1.size() != 0){
			s2.push(s1.pop());
		}
		int result = s2.pop();
		while (s2.size() != 0){
			s1.push(s2.pop());
		}
		return result;
	}
}
