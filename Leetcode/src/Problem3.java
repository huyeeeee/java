import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
	public static String commonLetters(String str1,String str2){
		//split the two string as the two arrays
		String[] s = str1.toLowerCase().split("");
		String[] t = str2.toLowerCase().split("");

		// store the letters that are in both strings
		ArrayList<String> res = new ArrayList<>();
		for (int i = 0;i < s.length;i++){
			for (int j = 0;j < t.length;j++){
				if (s[i].equals(t[j]) && !res.contains(s[i])){
					//add the letter if in both two strings and not duplication
					res.add(s[i]);
				}
			}
		}
		String result = "";
		for (int i = 0;i < res.size();i++){
			result += res.get(i);
		}
		return result;
	}
	public static void main(String[] args){
		Scanner in= new Scanner(System.in);
		String str1 = in.next();//the two inputs
		String str2 = in.next();
		System.out.println(commonLetters(str1,str2));
	}
}
