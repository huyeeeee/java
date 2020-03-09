package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minimumAbsDifference_1200 {
	public List<List<Integer>> minimumAbsDifference(int[] arr){
		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<>();
		int min = Math.abs(arr[1] - arr[0]);
		for (int i = 0;i < arr.length - 1;i++){
			min = min > Math.abs(arr[i+1] - arr[i])
					? Math.abs(arr[i+1] - arr[i])
					: min;
		}
		System.out.println(min);
		for (int i = 0;i < arr.length-1;i++){
			List<Integer> temp = new ArrayList<>();
			if (min == Math.abs(arr[i+1] - arr[i])){
				temp.add(arr[i]);
				temp.add(arr[i+1]);
				result.add(temp);
			}
		}
		return result;
	}

	public static void main(String[] args){
		int[] arr = {1,3,6,10,15};
		System.out.println(new minimumAbsDifference_1200().minimumAbsDifference(arr));
	}
}
