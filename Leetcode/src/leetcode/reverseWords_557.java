package leetcode;

public class reverseWords_557 {
	public String reverseWords(String s){
		String[] strs = s.split(" ");
		StringBuffer res = new StringBuffer();
		for (int i = 0;i < strs.length;i++){
			res.append(new StringBuffer(strs[i]).reverse());
			res.append(" ");
		}
		return res.toString();
	}

	public static void main(String[] args){
		System.out.println(new reverseWords_557().reverseWords("this is a Problem1"));
	}
}
