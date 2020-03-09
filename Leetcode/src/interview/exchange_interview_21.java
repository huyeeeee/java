package interview;

public class exchange_interview_21 {
	public int[] exchange(int[] nums){
		int[] result = new int[nums.length];
		int c1 = 0,c2 = nums.length-1;
		for (int i = 0;i < nums.length;i++){
			if (nums[i] % 2 == 1){
				result[c1++] = nums[i];
			}
			else {
				result[c2--] = nums[i];
			}
		}
		return result;
	}

	public static void main(String[] args){
		int[] nums = {1,2,3,4};
		for (int i : new exchange_interview_21().exchange(nums)){
			System.out.println(i);
		}
	}
}
