package leetcode;

import java.util.ArrayList;
import java.util.List;

public class findDisappearedNumbers_448 {
	public List<Integer> findDisappearedNumbers(int[] nums){
		List<Integer> res = new ArrayList<>();
		for (int i = 0;i < nums.length-1;i++){
			if (nums[i] == nums[i+1]){
				res.add(nums[i]);
			}
		}
		return res;
	}

	public static void main(String[] args){
		int[] nums = new int[]{4,3,2,7,8,2,3,1};
		System.out.println(new findDisappearedNumbers_448().findDisappearedNumbers(nums));
	}
}
