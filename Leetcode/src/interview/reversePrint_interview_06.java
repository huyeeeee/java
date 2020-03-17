package interview;

public class reversePrint_interview_06 {
	public int[] reversePrint(ListNode head){
		ListNode node = head;
		int count = 0;
		while (node!= null){
			count++;
			node = node.next;
		}
		int[] result = new int[count];
		node = head;
		for (int i = count-1;i >= 0;i--){
			result[i] = node.val;
			node = node.next;
		}
		return result;
	}
	public static void main(String[] args){
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(2);
		l1.next = l2;
		l2.next = l3;
		reversePrint_interview_06 r = new reversePrint_interview_06();
		int[] res = r.reversePrint(l1);
		for (int i : res){
			System.out.println(i);
		}
	}
}
