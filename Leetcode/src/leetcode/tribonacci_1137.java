package leetcode;

import java.util.ArrayList;

public class tribonacci_1137 {
	public int tribonacci(int n){
		ArrayList<Integer> result = new ArrayList<>();
		result.add(0);
		result.add(1);
		result.add(1);
		for (int i = 3;i <= n;i++){
			result.add(result.get(i-1)+result.get(i-2)+result.get(i-3));
		}
		return result.get(n);
	}
	public static void main(String[] args){
		System.out.println(new tribonacci_1137().tribonacci(25));
	}
}
