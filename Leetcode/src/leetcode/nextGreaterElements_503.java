package leetcode;

public class nextGreaterElements_503 {
	public int[] nextGreaterElements(int[] nums){
		int[] result = new int[nums.length];
		for (int i = 0;i < result.length;i++){
			result[i] = -1;
		}
		for (int i = 0;i < nums.length;i++){
			for (int j = i+1;j < nums.length+i;j++){
				if (nums[j%nums.length] > nums[i]){
					result[i] = nums[j%nums.length];
					break;
				}
			}
		}
		return result;
	}

	public static void main(String[] args){
		int[] nums = new int[]{1,2,1};
		int[] res = new nextGreaterElements_503().nextGreaterElements(nums);
		for (int i = 0;i < res.length;i++){
			System.out.print(res[i]+"\t");
		}
	}
}
