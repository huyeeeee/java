package leetcode;

public class addTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode(0);
        ListNode h = l;
        while (l1 != null && l2 != null){
        	l.next = new ListNode(0);
        	if (l1.val + l2.val + l.val < 10){
        		l.val += (l1.val + l2.val);
			}
			else {
        		l.val = (l.val + l1.val + l2.val) % 10;
        		l.next.val = 1;
			}
			l = l.next;
        	l1 = l1.next;
        	l2 = l2.next;
		}
		while (l1 != null){
        	l.next = new ListNode(0);
        	if (l.val + l1.val < 10){
        		l.val += l1.val;
			}
			else {
        		l.val = (l.val + l1.val) % 10;
        		l.next.val = 1;
        	}
			l = l.next;
        	l1 = l1.next;
		}

		while (l2 != null){
			l.next = new ListNode(0);
			if (l.val + l2.val < 10){
				l.val += l2.val;
			}
			else {
				l.val = (l.val + l2.val) % 10;
				l.next.val = 1;
			}
			l = l.next;
			l2 = l2.next;
		}
		ListNode h1 = h;
		while (h != null){
			if (h.next != null && h.next.next == null && h.next.val == 0){
				h.next = null;
				break;
			}
			h = h.next;
		}
		return h1;
    }

    public static void main(String[] args){
    	ListNode l1 = new ListNode(9);
    	l1.next = new ListNode(1);
    	l1.next.next = new ListNode(6);
    	ListNode l2 = new ListNode(0);
    	ListNode l3 = new addTwoNumbers_2().addTwoNumbers(l1,l2);
    	while (l3 != null){
			System.out.print(l3.val);
			l3 = l3.next;
		}
	}
}
