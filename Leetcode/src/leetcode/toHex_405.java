package leetcode;

public class toHex_405 {
	public String toHex(int num){
		char[] c = "0123456789abcdef".toCharArray();
		String result = new String();
		while (num != 0){
			int end = num & 15;
			result = c[end] + result;
			num >>>=4;
		}
		if (result.length() == 0){
			result = "0";
		}
		return result;
	}


	public static void main(String[] args){
		System.out.println(new toHex_405().toHex(-1));
	}
}
