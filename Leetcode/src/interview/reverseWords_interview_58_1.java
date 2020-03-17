package interview;

public class reverseWords_interview_58_1 {
	public String reverseWords(String s){
		StringBuilder sb = new StringBuilder();
		String[] strings = s.trim().split(" ");
		for (int i = strings.length-1;i >= 0;i--){
			if (!strings[i].equals("")){
				sb.append(strings[i]);
				sb.append(" ");
			}
		}
		return sb.toString().trim();
	}
}
