import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		//split the two strings as two arrays
		String[] s = in.next().toLowerCase().split("");
		String[] t = in.next().toLowerCase().split("");
		ArrayList<String> res = new ArrayList<>();// store the letters that are in both strings
		for (int i = 0;i < s.length;i++){
			for (int j = 0;j < t.length;j++){
				if (s[i].equals(t[j]) && !res.contains(s[i])){
					res.add(s[i]);
				}
			}
		}
		String result = "";
		for (int i = 0;i < res.size();i++){//let the array become a string
			result += res.get(i);
		}
		System.out.println(result);
	}
}
