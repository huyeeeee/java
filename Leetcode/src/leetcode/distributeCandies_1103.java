package leetcode;

public class distributeCandies_1103 {
	public static int[] distributeCandies(int candies,int num_people){
		int[] res = new int[num_people];
		int count_1 = 0,count_2 = 1;
		while (true){
			if (candies <= count_2){
				res[count_1 % num_people] += candies;
				break;
			}
			else {
				res[count_1 % num_people] += count_2;
			}
			candies -= count_2;
			count_1++;
			count_2++;
		}
		return res;
	}

	public static void main(String[] args){
		int candies = 100;
		int num_people = 3;
		int[] res = distributeCandies(candies,num_people);
		for (int i : res){
			System.out.println(i);
		}
	}
}
