import java.util.ArrayList;
import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		// three players and initialization
		ArrayList<String> p1 = new ArrayList<>();
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			p1.add(in.next());
		}
		for (int i = 0; i < 5; i++) {
			p2.add(in.next());
		}
		for (int i = 0; i < 5; i++) {
			p3.add(in.next());
		}

		// the next 17 cards in the pile
		ArrayList<String> pPile = new ArrayList<>();
		for (int i = 0; i < 17; i++) {
			pPile.add(in.next());
		}
		
		
		int sign = 0;
		String temp = "";
		boolean ifTakeTwo = true;
		String color = null; 
		
		//the discard card
		String s = pPile.remove(0);
		System.out.println("0: " + s);
		
		while (true) {
			if (sign % 3 == 0) {
				// player 1
				temp = order(p1, s, color);
				if (s.split("")[1].equals("2") && !isExistTwo(p1) && ifTakeTwo) {
					// if the card is a "two" card and there is no "two" card in current cards,add
					// two cards from the pile
					ifTakeTwo = !ifTakeTwo;
					p1.add(pPile.remove(0));
					p1.add(pPile.remove(0));
					System.out.println("1: TAKE TWO");
					sign++;
					continue;
				}
				
				if (s.split("")[1].equals("2") && !ifTakeTwo) {
					ifTakeTwo = !ifTakeTwo;
				}
				
				if (s.split("")[1].equals("8")) {										
					if(isExistEight(p1)) {
						s = temp;
						p1.remove(temp);
						color = findNewColor(p1);
						System.out.println("1: " + temp +" LOCO "+ color);
						if (p1.size() == 0) {
							System.out.println(" (WINNER)");
							break;
						}
						else {
							sign++;
							continue;
						}
					}else {
						if (!temp.equals("DRAW")) {							
							color = null;
						}						
					}										
				}
							
				if (temp.equals("DRAW")) {
					p1.add(pPile.remove(0));
					System.out.print("1: " + "DRAW");
				} else {
					s = temp;
					p1.remove(temp);
					
					if(temp.endsWith("8"))
					{
						color = findNewColor(p1);
						System.out.print("1: " + temp +" LOCO "+ color);
					}
					else {
						System.out.print("1: " + temp);
					}
				}
				if (p1.size() == 0) {
					System.out.println(" (WINNER)");
					break;
				} else {
					System.out.println();
				}
			} else if (sign % 3 == 1) {
				temp = order(p2, s, color);
				if (s.split("")[1].equals("2") && !isExistTwo(p2) && ifTakeTwo) {

					ifTakeTwo = !ifTakeTwo;
					p2.add(pPile.remove(0));
					p2.add(pPile.remove(0));
					System.out.println("2: TAKE TWO");
					sign++;
					continue;
				}
				if (s.split("")[1].equals("2") && !ifTakeTwo) {
					ifTakeTwo = !ifTakeTwo;
				}
				
				if (s.split("")[1].equals("8")) {										
					if(isExistEight(p2)) {
						s = temp;
						p2.remove(temp);
						color = findNewColor(p2);
						System.out.println("2: " + temp +" LOCO "+ color);
						if (p2.size() == 0) {
							System.out.println(" (WINNER)");
							break;
						}
						else {
							sign++;
							continue;
						}
					}else {
						if (!temp.equals("DRAW")) {							
							color = null;
						}						
					}										
				}
				
				
				if (temp.equals("DRAW")) {
					p2.add(pPile.remove(0));
					System.out.print("2: " + "DRAW");
				} else {
					s = temp;
					p2.remove(temp);
					if(temp.endsWith("8"))
					{
						color = findNewColor(p2);
						System.out.print("2: " + temp +" LOCO "+ color);
					}
					else {
						System.out.print("2: " + temp);
					}
				}
				if (p2.size() == 0) {
					System.out.println(" (WINNER)");
					break;
				} else {
					System.out.println();
				}
			} else if (sign % 3 == 2) {
				temp = order(p3, s, color);
				if (s.split("")[1].equals("2") && !isExistTwo(p3) && ifTakeTwo) {
					ifTakeTwo = !ifTakeTwo;
					p3.add(pPile.remove(0));
					p3.add(pPile.remove(0));
					System.out.println("3: TAKE TWO");
					sign++;
					continue;
				}
				if (s.split("")[1].equals("2") && !ifTakeTwo) {
					ifTakeTwo = !ifTakeTwo;
				}
				
				if (s.split("")[1].equals("8")) {										
					if(isExistEight(p3)) {
						s = temp;
						p3.remove(temp);
						color = findNewColor(p3);
						System.out.println("3: " + temp +" LOCO "+ color);
						if (p3.size() == 0) {
							System.out.println(" (WINNER)");
							break;
						}
						else {
							sign++;
							continue;
						}
					}else {
						if (!temp.equals("DRAW")) {							
							color = null;
						}						
					}										
				}
				
				if (temp.equals("DRAW")) {
					p3.add(pPile.remove(0));
					System.out.print("3: " + "DRAW");
				} else {
					s = temp;
					p3.remove(temp);
					
					if(temp.endsWith("8"))
					{
						color = findNewColor(p3);
						System.out.print("3: " + temp +" LOCO "+ color);
					}
					else {
						System.out.print("3: " + temp);
					}
				}
				
				if (p3.size() == 0) {
					System.out.println(" (WINNER)");
					break;
				} else {
					System.out.println();
				}
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
			if("R".equals(temp)) {
				colorString = "R";
				break;
			}else if("Y".equals(temp)) {
				if(!"R".equals(colorString)) {
					colorString = "Y";
				}
			}else if("G".equals(temp)) {
				if(!"R".equals(colorString) && !"Y".equals(colorString)) {
					colorString = "G";
				}
			}else if("B".equals(temp)) {
				if(!"R".equals(colorString) && !"Y".equals(colorString)&&!"G".equals(colorString)) {
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
	public static String order(ArrayList<String> arrayList, String s,String expectColor) {
		
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
			
			if(num != 10)
			{
				return expectColor + num;
			}
			else {
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
	 R1 R4 Y6 G8 B2
	 R2 R3 R6 Y4 G5
	 R5 R8 Y7 Y8 G2
	 B6
	 Y3 B7 Y1 G6 Y5 G7
	 B3 R7 G1 G4 B5
	 G3 B1 B8 B4 Y2*/
}
