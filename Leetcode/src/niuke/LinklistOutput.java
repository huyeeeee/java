package niuke;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode{
    int val;
    ListNode next = null;
    ListNode(int val){
        this.val = val;
    }
}
public class LinklistOutput {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (listNode != null){
            arrayList.add(listNode.val);
            listNode = listNode.next;
        }
        Collections.reverse(arrayList);
        return arrayList;
    }
}
