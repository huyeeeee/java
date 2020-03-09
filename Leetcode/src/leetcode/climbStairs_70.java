package leetcode;

public class climbStairs_70 {
	public int climbStairs(int n){
		int[] result = new int[n+1];
		result[0] = 1;
		result[1] = 1;
		for (int i = 2;i < n+1;i++){
			result[i] = result[i-1] + result[i-2];
		}
		return result[n];
	}

	public static void main(String[] args){
		System.out.println(new climbStairs_70().climbStairs(30));
	}
}
