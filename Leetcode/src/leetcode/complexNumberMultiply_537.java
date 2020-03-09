package leetcode;

public class complexNumberMultiply_537 {
	public static String complexNumberMultiply(String a, String b){
		int a_r,a_i,b_r,b_i;
		a_r = Integer.valueOf(a.split("\\+")[0]);
		if (a.split("\\+")[1].equals("i")){
			a_i = 1;
		}
		else {
			a_i = Integer.parseInt(a.split("\\+")[1].split("i")[0]);
		}
		b_r = Integer.valueOf(b.split("\\+")[0]);
		if (b.split("\\+")[1].equals("i")){
			b_i = 1;
		}
		else {
			b_i = Integer.parseInt(b.split("\\+")[1].split("i")[0]);
		}
		int temp_1 = a_r * b_r;
		int temp_2 = a_i * b_i;
		int temp_3 = a_r * b_i + a_i * b_r;
		return (temp_1 - temp_2) + "+" + (temp_3) + "i";
	}

	public static void main(String[] args){
		String a = "1+-1i";
		String b = "1+-1i";
		System.out.println(complexNumberMultiply(a,b));
	}
}
