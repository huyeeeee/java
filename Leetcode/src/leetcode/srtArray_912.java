package leetcode;

import java.util.ArrayList;
import java.util.List;

public class srtArray_912 {
//	public List<Integer> sortArray(int[] nums){
//
//	}

	private List<Integer> bubbleSort(int[] nums){
		//O(n^2)
		List<Integer> result = new ArrayList<>();
		for (int i = 0;i < nums.length;i++){
			for (int j = i+1;j < nums.length;j++){
				if(nums[i] > nums[j]){
					int temp = 0;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
			result.add(nums[i]);
		}
		return result;

	}

	private List<Integer> selectionSort(int[] nums){
		//O(n^2)
		List<Integer> result = new ArrayList<>();
		int index = 0;
		for (int i = 0;i < nums.length-1;i++){
			int min = Integer.MAX_VALUE;
			for (int j = i+1;j < nums.length;j++){
				if (min > nums[j]){
					min = nums[j];
					index = j;
				}
			}
			if (nums[i] >= nums[index]){
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;

			}
			result.add(nums[i]);
		}
		result.add(nums[nums.length-1]);
		return result;
	}
	private List<Integer> mergeSort(int[] nums){
		List<Integer> result = new ArrayList<>();
		return result;
	}
	public static void main(String[] args){
		int[] nums = new int[]{5,1,1,2,0,0};
		srtArray_912 s = new srtArray_912();
		System.out.println("the result of the bubble sort is: "+s.bubbleSort(nums));
		System.out.println("the result of the selection sort is: "+s.selectionSort(nums));
	}
}
