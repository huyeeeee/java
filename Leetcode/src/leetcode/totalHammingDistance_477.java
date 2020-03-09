package leetcode;

public class totalHammingDistance_477 {
	public int totalHammingDistance(int[] nums){
		int count = 0;
		for (int i = 0;i < nums.length;i++){
			for (int j = i;j < nums.length;j++){
				count += hanmmingDistance(nums[i],nums[j]);
			}
		}
		return count;
	}

	private int hanmmingDistance(int num1,int num2){
		int count = 0;
		String[] s1 = Integer.toBinaryString(num1).split("");
		String[] s2 = Integer.toBinaryString(num2).split("");
		int lenBigger = (s1.length < s2.length) ? s2.length : s1.length;
		int lenSmaller = (s1.length > s2.length) ? s2.length : s1.length;
		for (int i = 0;i < lenSmaller;i++){

			if (!s1[s1.length-1-i].equals(s2[s2.length-1-i])){
				count++;
			}
		}
		for (int i = 0;i < lenBigger-lenSmaller;i++){
			if (s1.length < s2.length){
				if (!s2[s2.length-1-lenSmaller-i].equals("0")){
					count++;
				}
			}
			else {
				if (!s1[s1.length-1-lenSmaller-i].equals("0")){
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args){
		int[] a = new int[]{4,14,2};
		System.out.println(new totalHammingDistance_477().totalHammingDistance(a));
	}
}
