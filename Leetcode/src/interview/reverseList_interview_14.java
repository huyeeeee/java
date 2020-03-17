package interview;

public class reverseList_interview_14 {
	public ListNode reverseList(ListNode head){
		if (head == null)
			return null;
		ListNode l1 = null,l2 = head,l3 = null;
		while (l2 != null){
			l3 = l2.next;
			l2.next = l1;
			l1 = l2;
			l2 = l3;
		}
		return l1;

	}
}
