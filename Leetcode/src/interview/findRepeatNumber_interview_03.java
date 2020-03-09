package interview;

public class findRepeatNumber_interview_03 {
	public int findRepeatNumber(int[] nums){
		int[] counts = new int[nums.length];
		for (int i = 0;i < nums.length;i++){
			counts[nums[i]]++;
			if (counts[nums[i]] > 1){
				return nums[i];
			}
		}
		return 0;
	}
}
