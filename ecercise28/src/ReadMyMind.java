import java.util.Random;
import java.util.Scanner;

public class ReadMyMind {
	public static void main(String[] args) {
		System.out.println("Enter:");
		System.out.println("   - 1 for guessing a postal code\r\n" +
				"   - 2 f or guessing a phone numb");
		System.out.println("   - -1 to exit");
		SecureRandom secureRandom = new SecureRandom();
//        String postal="K1K4V7";
//        String phone="6135551212";
		secureRandom.postalPhone();
//        int a = (int) 'A';
//        System.out.println(a);
//        char b = (char) 66;
//        System.out.println(b);
	}
}

class SecureRandom {
	public void postalPhone() {
		while (true) {

			Scanner scanner = new Scanner(System.in);
			int code = scanner.nextInt();
			String result = "";
			Random random = new Random();
			if (code == 1) {

				if (code == 1) {
					for (int i = 0; i < 6; i++) {

						int min = 'A';
						int max = 'Z'+1;

						int x = random.nextInt((max - min)) + min;
						System.out.println("Is it " + (char) x + "?");
						String s = scanner.next();
						if (s.toUpperCase().equals("Y")) {
							result = result + x;
						}
						while (!s.toUpperCase().equals("Y")) {
							String s1 = scanner.nextLine();
							if (s1.split(" ")[0].toLowerCase().equals("down")) {
								//down
								int d = Integer.parseInt(s1.split(" ")[1]);
								if (d == 20 || d == 15) {
									//x-5 x
									x = x - (random.nextInt(5) + 1);//1~5
								} else {
									x--;
								}
							}
							else {
								//up
								int d = Integer.parseInt(s1.split(" ")[1]);
								if (d == 20 || d == 15) {
									x = x +(random.nextInt(5) + 1);//1~5
								} else {
									x++;
								}
							}

							System.out.println("Is it " + (char) x + "?");

							if (s.toUpperCase().equals("Y")) {
								result = result + (char) x;
								break;
							}
						}

					}
				}
			} else if (code == 2) {

				for (int i = 0; i <10; i++) {
					int min = 0;
					int max = 10;
					int x = random.nextInt((max - min)) + min;
					System.out.println("Is it " + x + "?");
					System.out.println("Please input Y or N");
					String s = scanner.next();
					if(s.equals("Y")){
						result=result+x;
					}
					while (!s.equals("Y")) {
						System.out.println("You can input Down number or Up number");
						String a=scanner.nextLine();
						String s1 = scanner.nextLine();
						if (s1.indexOf("Down") != -1) {
							int d = Integer.parseInt(s1.substring(5, s1.length()));
							if(max-min<=3){
								max=max-1;
							}
							else if(max-d>min){

								max = max - d;
							}

							if (min == max) {
								result = result + x;
								s = "Y";
							} else {
								x = random.nextInt((max - min)) + min;
								System.out.println("Is it " + x + "?");
								System.out.println("Please input Y or N");
								s = scanner.next();
								if (s.equals("Y")) {
									result = result + x;
								}
							}


						} else if (s1.indexOf("Up") != -1) {
							int d = Integer.parseInt(s1.substring(3, s1.length()));
							if(max-min<=3){
								min=min+1;
							}else if(max-d>min){
								min = min + d;
							}


							if (min == max) {
								result = result + x;
								s = "Y";
							} else {
								x = random.nextInt((max - min)) + min;
								System.out.println("Is it " + x + "?");
								System.out.println("Please input Y or N");
								s = scanner.next();
								if (s.equals("Y")) {
									result = result + x;
								}
							}


						} else {
							System.out.println("You should input Down number or Up number");
						}


					}
					System.out.println(result);
				}
				System.out.println("The phone number is " + result);
			} else if (code == -1)  {
				System.out.println("Good bye.");
				break;
			}
		}

	}
}
