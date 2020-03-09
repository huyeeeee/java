package leetcode;

import java.util.Arrays;

public class maximumProduct_628 {
	public int maximumProduct(int[] nums){
		Arrays.sort(nums);
		int a = nums[0] * nums[1] * nums[nums.length-1];
		int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
		return a > b ? a : b;
	}
}
