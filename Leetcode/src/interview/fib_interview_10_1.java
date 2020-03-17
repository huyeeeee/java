package interview;

public class fib_interview_10_1 {
	public int fib(int n){
		if (n < 2){
			return n;
		}
		int[] result = new int[n+1];
		result[0] = 0;
		result[1] = 1;
		for (int i = 2;i <= n;i++){
			result[i] = (result[i-1] + result[i-2]) % 1000000007;
		}
		return result[n];
	}
	public static void main(String[] args){
		fib_interview_10_1 f = new fib_interview_10_1();
		for (int i = 0;i < 100;i++){
			System.out.println(f.fib(i) + " " + i);
		}

	}
}
