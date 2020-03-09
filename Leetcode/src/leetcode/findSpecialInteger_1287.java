package leetcode;

import java.util.HashMap;
import java.util.Map;

public class findSpecialInteger_1287 {
	public static int findSpecialInteger(int[] arr){
		Map<Integer,Integer> res = new HashMap<>();
		for (int i:arr){
			if (res.containsKey(i)){
				res.put(i,(1+res.get(i)));
			}
			else{
				res.put(i,0);
			}
		}
		int max_value = -1,max_key = 0;
		for (int i : res.keySet()){
			if (max_value < res.get(i)){
				max_value = res.get(i);
				max_key = i;
			}
		}
		return max_key;
	}

	public static void main(String[] args){
		int[] arr = {1,2,2,6,6,6,6,7,10};
		System.out.println(findSpecialInteger(arr));
	}
}
