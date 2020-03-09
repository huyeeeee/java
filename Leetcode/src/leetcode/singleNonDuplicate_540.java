package leetcode;

public class singleNonDuplicate_540 {
	public static int singleNonDuplicate(int[] nums){
		//位运算，但是时间复杂度O(n)
		int res = nums[0];
		for (int i = 1;i < nums.length;i++){
			res ^= nums[i];
		}
		return res;
	}

	public static void main(String[] args){
		int[] nums = {1,1,2,3,3,4,5,4,5};
		System.out.println(singleNonDuplicate(nums));
	}
}
