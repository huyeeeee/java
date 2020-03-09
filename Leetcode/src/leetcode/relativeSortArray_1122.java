package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class relativeSortArray_1122 {
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		ArrayList<Integer> arr3 = new ArrayList<>();
		for (int i = 0;i < arr2.length;i++){
			for (int j = 0;j < arr1.length;j++){
				if (arr2[i] == arr1[j]){
					arr3.add(arr1[j]);
				}
			}
		}
		ArrayList<Integer> arr4 = new ArrayList<>();
		for (int i = 0;i < arr1.length;i++){
			if (!arr3.contains(arr1[i])){
				arr4.add(arr1[i]);
			}
		}
		Collections.sort(arr4);
		int[] res = new int[arr1.length];
		for (int i = 0;i < arr3.size();i++){
			res[i] = arr3.get(i);
		}
		for (int i = 0;i < arr4.size();i++){
			res[arr3.size()+i] = arr4.get(i);
		}
		return res;
	}
	public static void main(String[] args){
		int[] a1 = new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,
				29,48,30,31,2,42,38,0,43,21};
		int[] a2 = new int[]{2,42,38,0,43,21};
		int[] a3 = new relativeSortArray_1122().relativeSortArray(a1,a2);
		for (int i : a3){
			System.out.print(i + "\t");
		}
	}
}
