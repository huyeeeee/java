import java.util.Scanner;

public class Problem4 {
	public static double average(int[] arr){
		double sum = 0.;// the sum
		for (int i = 0;i < arr.length;i++){
			sum += arr[i];// sum numbers in array one by one
		}
		return sum / (double) arr.length;// return the average
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();// the length of the arrays
		int[] arr = new int[len];
		for (int i = 0;i < len;i++){
			arr[i] = in.nextInt();// input the numbers one by one
		}
		System.out.println(average(arr));
	}
}
