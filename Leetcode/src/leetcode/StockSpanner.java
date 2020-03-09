package leetcode;

import java.util.ArrayList;

public class StockSpanner {
	//leetcode 901
	private ArrayList<Integer> res;
	public StockSpanner(){
		res = new ArrayList<>();
	}

	public int next(int price){
		int count = 1;
		res.add(price);
		for (int i = 0;i < res.size();i++){
			if (price > res.get(i)){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args){
		StockSpanner s = new StockSpanner();
		System.out.println(s.next(29));
		System.out.println(s.next(91));
		System.out.println(s.next(62));
		System.out.println(s.next(76));
		System.out.println(s.next(51));
//		System.out.println(s.next(75));
//		System.out.println(s.next(85));

	}
}
