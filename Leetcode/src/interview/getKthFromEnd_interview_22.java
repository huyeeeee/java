package interview;

public class getKthFromEnd_interview_22 {
	public ListNode getKthFromEnd(ListNode head,int k){
		ListNode l1 = head;
		ListNode l2 = head;
		while (l1.next != null){
			if (k > 0){
				k--;
			}
			if (k == 0){
				l2 = l2.next;
			}
			l1 = l1.next;
		}
		return l2;
	}
}
