package leetcode;
//动态规划
public class maxProduct_152 {
	public static int maxProduct(int[] nums){
		int imax = 1,imin = 1,max = Integer.MIN_VALUE;
		for (int i : nums){
			if (i < 0){
				int temp = imax;
				imax = imin;
				imin = temp;
			}
			imax = Math.max(imax * i,i);
			imin = Math.min(imin * i,i);
			max = Math.max(max,imax);
		}
		return max;
	}
	public static void main(String[] args){
		int[] nums = {-2,0,-1};
		System.out.println(maxProduct(nums));
	}
}
