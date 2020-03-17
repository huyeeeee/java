package interview;

public class replaceSpace_interview_05 {
	public String replaceSpace(String s){
		StringBuilder stringBuilder = new StringBuilder();
		String[] strings = s.split("");
		for (String s1 : strings){
			if (s1.equals(" ")){
				stringBuilder.append("%20");
			}
			else {
				stringBuilder.append(s1);
			}
		}
		return stringBuilder.toString();
	}
}
