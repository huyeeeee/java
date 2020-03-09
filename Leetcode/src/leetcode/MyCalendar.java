package leetcode;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MyCalendar {
	//leetcode 729
	private ArrayList<int[]> booked;
	public MyCalendar() {
		booked = new ArrayList<>();
	}

	public boolean book(int start, int end) {
		for (int[] i : booked){
			if (!(i[0] >= end || i[1] <= start)){
				return false;
			}
		}
		booked.add(new int[]{start,end});
		return true;
	}

	public static void main(String[] args){
		MyCalendar m = new MyCalendar();
		System.out.println(m.book(10,20));
		System.out.println(m.book(15,25));
		System.out.println(m.book(20,30));
	}
}
