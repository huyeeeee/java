package interview;

import java.util.Arrays;

public class majorityElement_interview_39 {
	public int majorityElement(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
}
