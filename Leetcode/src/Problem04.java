import java.util.ArrayList;
import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int players = in.nextInt();

		ArrayList<ArrayList<String>> playersList = new ArrayList<ArrayList<String>>();

		for (int i = 0; i < players; i++) {
			ArrayList<String> tempList = new ArrayList<String>();
			for (int j = 0; j < 5; j++) {
				tempList.add(in.next());
			}
			playersList.add(tempList);
		}

		// the other cards in the pile
		ArrayList<String> pPile = new ArrayList<>();
		for (int i = 0; i < 32 - 5 * players; i++) {
			pPile.add(in.next());
		}

		int sign = 0;
		String temp = "";
		boolean ifTakeTwo = true;
		String color = null;

		// the discard card
		String s = pPile.remove(0);
		System.out.println("0: " + s);

		while (true) {

			int order = sign % players;
			ArrayList<String> list = playersList.get(order);
			temp = order(list, s, color);

			if (s.split("")[1].equals("2") && !isExistTwo(list) && ifTakeTwo) {
				// if the card is a "two" card and there is no "two" card in current cards,add
				// two cards from the pile
				ifTakeTwo = !ifTakeTwo;
				list.add(pPile.remove(0));
				list.add(pPile.remove(0));
				System.out.println((order + 1) + ": TAKE TWO");
				sign++;
				continue;
			}

			if (s.split("")[1].equals("2") && !ifTakeTwo) {
				ifTakeTwo = !ifTakeTwo;
			}

			if (s.split("")[1].equals("8")) {
				if (isExistEight(list)) {
					s = temp;
					list.remove(temp);
					color = findNewColor(list);
					System.out.println((order + 1) + ": " + temp + " LOCO " + color);
					if (list.size() == 0) {
						System.out.println(" (WINNER)");
						break;
					} else {
						sign++;
						continue;
					}
				} else {
					if (!temp.equals("DRAW")) {
						color = null;
					}
				}
			}

			if (temp.equals("DRAW")) {
				list.add(pPile.remove(0));
				System.out.print((order + 1) + ": " + "DRAW");
			} else {
				s = temp;
				list.remove(temp);
				
				if(temp.endsWith("8"))
				{
					color = findNewColor(list);
					System.out.print((order + 1) +": " + temp +" LOCO "+ color);
				}
				else {
					System.out.print((order + 1) +": " + temp);
				}
			}

			if (list.size() == 0) {
				System.out.println(" (WINNER)");
				break;
			} else {
				System.out.println();
			}
			sign++;
		}
		
	}

	/**
	 * judge if one player's current cards exists a "two" card
	 * 
	 * @param arrayList is player's current cards
	 * @return true if exist a "two" card,return false if not
	 */
	public static boolean isExistTwo(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).split("")[1].equals("2")) {
				return true;
			}
		}
		return false;
	}

	public static boolean isExistEight(ArrayList<String> arrayList) {
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).split("")[1].equals("8")) {
				return true;
			}
		}
		return false;
	}

	public static String findNewColor(ArrayList<String> arrayList) {

		String colorString = null;
		for (int i = 0; i < arrayList.size(); i++) {
			String temp = arrayList.get(i).split("")[0];
			if ("R".equals(temp)) {
				colorString = "R";
				break;
			} else if ("Y".equals(temp)) {
				if (!"R".equals(colorString)) {
					colorString = "Y";
				}
			} else if ("G".equals(temp)) {
				if (!"R".equals(colorString) && !"Y".equals(colorString)) {
					colorString = "G";
				}
			} else if ("B".equals(temp)) {
				if (!"R".equals(colorString) && !"Y".equals(colorString) && !"G".equals(colorString)) {
					colorString = "B";
				}
			}

		}
		return colorString;
	}

	/**
	 * this method is used to find the right answer of "s" and "arrayList" by the
	 * rules
	 * 
	 * @param arrayList is one player current cards
	 * @param s         is the card that given to let player discard one right card
	 * @return the answer
	 */
	public static String order(ArrayList<String> arrayList, String s, String expectColor) {

		String color = s.split("")[0];
		int number = Integer.parseInt(s.split("")[1]);

		String[] colors = new String[arrayList.size()];
		int[] numbers = new int[arrayList.size()];

		int countColor = 0, countNumber = 0;
		for (int i = 0; i < arrayList.size(); i++) {
			colors[i] = arrayList.get(i).split("")[0];
			numbers[i] = Integer.parseInt(arrayList.get(i).split("")[1]);
		}

		for (int i = 0; i < arrayList.size(); i++) {
			if (color.equals(colors[i])) {
				countColor++;
			}
			if (number == numbers[i]) {
				countNumber++;
			}
		}
		if (s.split("")[1].equals("2")) {
			if (arrayList.contains("R2")) {
				return "R2";
			} else if (arrayList.contains("Y2")) {
				return "Y2";
			} else if (arrayList.contains("G2")) {
				return "G2";
			} else if (arrayList.contains("B2")) {
				return "B2";
			}
		}

		if (s.split("")[1].equals("8")) {
			if (arrayList.contains("R8")) {
				return "R8";
			} else if (arrayList.contains("Y8")) {
				return "Y8";
			} else if (arrayList.contains("G8")) {
				return "G8";
			} else if (arrayList.contains("B8")) {
				return "B8";
			}

			int num = 10;
			for (int i = 0; i < arrayList.size(); i++) {
				if (expectColor.equals(colors[i]) && numbers[i] < num) {
					num = numbers[i];
				}
			}

			if (num != 10) {
				return expectColor + num;
			} else {
				return "DRAW";
			}
		}

		if (countColor == 0 && countNumber == 0) {
			return "DRAW";
		} else if (countNumber > countColor) {
			if (arrayList.contains("R" + number)) {
				return "R" + number;
			} else if (arrayList.contains("Y" + number)) {
				return "Y" + number;
			} else if (arrayList.contains("G" + number)) {
				return "G" + number;
			} else if (arrayList.contains("B" + number)) {
				return "B" + number;
			} else {
				return "DRAW";
			}
		} else {
			if (arrayList.contains(color + 1)) {
				return color + 1;
			} else if (arrayList.contains(color + 2)) {
				return color + 2;
			} else if (arrayList.contains(color + 3)) {
				return color + 3;
			} else if (arrayList.contains(color + 4)) {
				return color + 4;
			} else if (arrayList.contains(color + 5)) {
				return color + 5;
			} else if (arrayList.contains(color + 6)) {
				return color + 6;
			} else if (arrayList.contains(color + 7)) {
				return color + 7;
			} else if (arrayList.contains(color + 8)) {
				return color + 8;
			} else {
				return "DRAW";
			}
		}
	}
	/**
	 4
	 R2 Y8 G6 G7 G8
	 R7 Y3 Y6 B2 B4
	 R6 R8 Y1 B1 B5
	 R1 R3 R5 Y7 B6
	 B7
	 G1 G3 Y2 G2 B8 Y4
	 R4 G8 B3 G5 Y5*/

}
