package leetcode;

public class middleNode_876 {
	public ListNode middleNode(ListNode head){
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode slow = head;
		ListNode fast = head;
		while (slow.next != null && fast.next != null){
			slow = slow.next;
			fast = fast.next;
			if (fast.next != null){
				fast = fast.next;
			}
			else {
				break;
			}
		}
		return slow;
	}
}
