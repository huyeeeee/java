import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) throws IOException {
		File f = new File("./Students.txt");
		Scanner in = new Scanner(f);
		String[] str;
		String fullName;
		String userName;
		String password;
		HashMap<String,String> user2pwd = new HashMap<>();
		HashMap<String,String> user2fname = new HashMap<>();
		while (in.hasNextLine()){
			str = in.nextLine().split("\t");
			fullName = str[0];
			userName = str[1];
			password = str[2];
			user2pwd.put(userName,password);
			user2fname.put(userName,fullName);
		}
		in = new Scanner(System.in);
		String name;
		String pass;
		int num = 3;
		while (true){
			num--;
			System.out.print("Login: ");
			name = in.nextLine();
			System.out.print("Password: ");
			pass = in.nextLine();
			if (user2pwd.containsKey(name) && user2pwd.get(name).equals(pass)){
				System.out.println("Login successful");
				System.out.println("Welcome "+user2fname.get(name));
				break;
			}
			else {
				System.out.println("Either the username or password is incorrect. You have\t"
						+ num + " more attempts.");
			}
			if (num <= 0){
				System.out.println("Sorry. Incorrect login. Please contact the system administrator.");
				break;
			}
		}

	}
}
