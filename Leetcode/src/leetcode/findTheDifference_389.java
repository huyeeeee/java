package leetcode;

public class findTheDifference_389 {
	public char findTheDifference(String s,String t){
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		int sum1 = 0,sum2 = 0;
		for (int i = 0;i < s1.length;i++){
			sum1 += s1[i];
		}
		for (char c : t1){
			sum2 += c;
		}
		return (char)(sum2 - sum1);
	}
	public static void main(String[] args){
		String s = "abcd";
		String t = "abcde";
		System.out.println(new findTheDifference_389().findTheDifference(s,t));
	}
}
