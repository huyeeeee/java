package leetcode;

import java.util.ArrayList;

public class validMountainArray_941 {
	public boolean validMountainArray(int[] A){
		ArrayList<Integer> a1 = new ArrayList<>();
		ArrayList<Integer> a2 = new ArrayList<>();
		int i = 0;
		for (;i < A.length-1;i++){
			if (A[i] == A[i+1])
				return false;
			else if (A[i] < A[i+1]){
				a1.add(A[i]);
			}
			else{
				break;
			}
		}
		for (;i < A.length-1;i++){
			if (A[i] <= A[i+1]){
				return false;
			}
			else {
				a2.add(A[i]);
			}
		}
		return a1.size() > 0 && a2.size() > 0;
	}
}
