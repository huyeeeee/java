import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println(name.length());//the length of the string
		String[] temp = name.split("");//split the string as an array
		int count = 0;//count the number of the letter that is not vowel
		System.out.println(temp[0] + " " + temp[temp.length / 2] + " " + temp[temp.length-1]);
		//print the first,middle,last character of the string
		for (int i = 0;i < temp.length;i++){
			// count the number of the non-vowel letter
			if (!temp[i].equals("a") && !temp[i].equals("e") && !temp[i].equals("i")
					&& !temp[i].equals("o") && !temp[i].equals("u")){
				count++;
			}
		}
		//if the last character is Punctuation, count-1
		if (temp[temp.length-1].equals(".") || temp[temp.length-1].equals("!"))
			count--;
		System.out.println(count);
	}

}
