package leetcode;

public class checkPerfectNumber_507 {
	public static boolean checkPerfectNumber(int num){
		int count = 1,sum = 0;
		if (num <= 0)
			return false;
		while (count < num / 2 + 1){
			if (num % count == 0){
				sum += count;
			}
			count++;
		}
		return sum == num;
	}

	public static void main(String[] args){
		System.out.println(checkPerfectNumber(0));
	}
}
