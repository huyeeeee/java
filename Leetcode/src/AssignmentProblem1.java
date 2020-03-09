import java.util.ArrayList;
import java.util.Scanner;

public class AssignmentProblem1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		//three players and initialization
		ArrayList<String> p1 = new ArrayList<>();
		ArrayList<String> p2 = new ArrayList<>();
		ArrayList<String> p3 = new ArrayList<>();
		for (int i = 0;i < 5;i++){
			p1.add(in.next());
		}
		for (int i = 0;i < 5;i++){
			p2.add(in.next());
		}
		for (int i = 0;i < 5;i++){
			p3.add(in.next());
		}

		// the next 17 cards in the pile
		ArrayList<String> pPile = new ArrayList<>();
		for (int i = 0;i < 17;i++){
			pPile.add(in.next());
		}
		int sign = 0;
		String temp = "";
		String s = pPile.remove(0);
		System.out.println(0 + ": " + s);
		while (true){
			if (sign % 3 == 0){
				//player one
				temp = order(p1,s);

				if (temp.equals("DRAW")){//if neither color nor number matched, add the first card in the pile
					p1.add(pPile.remove(0));
				}
				else {
					s = temp;
					p1.remove(temp);
				}
				System.out.print("1: " + temp);
				if (p1.size() == 0){// if there is no card, that means this player is the winner
					System.out.println(" (WINNER)");
					break;
				}
				else {
					System.out.println();
				}
			}
			else if (sign % 3 == 1){
				//player 2
				temp = order(p2,s);
				if (temp.equals("DRAW")){
					p2.add(pPile.remove(0));
				}
				else {
					s = temp;
					p2.remove(temp);
				}
				System.out.print("2: " + temp);
				if (p2.size() == 0){
					System.out.println(" (WINNER)");
					break;
				}
				else {
					System.out.println();
				}
			}
			else if (sign % 3 == 2){
				//player 3
				temp = order(p3,s);

				if (temp.equals("DRAW")){
					p3.add(pPile.remove(0));
				}
				else {
					s = temp;
					p3.remove(temp);
				}
				System.out.print("3: " + temp);
				if (p3.size() == 0){
					System.out.println(" (WINNER)");
					break;
				}
				else {
					System.out.println();
				}
			}
			sign++;
		}

	}

	/**
	 * this method is used to find the right answer of "s" and "arrayList" by the rules
	 * @param arrayList is one player current cards
	 * @param s is the card that given to let player discard one right card
	 * @return the answer
	 */
	public static String order(ArrayList<String> arrayList,String s){
		String color = s.split("")[0];
		int number = Integer.parseInt(s.split("")[1]);
		String[] colors = new String[arrayList.size()];
		int[] numbers = new int[arrayList.size()];
		int countColor = 0,countNumber = 0;
		for (int i = 0;i < arrayList.size();i++){
			colors[i] = arrayList.get(i).split("")[0];
			numbers[i] = Integer.parseInt(arrayList.get(i).split("")[1]);
		}
		for (int i = 0;i < arrayList.size();i++){
			if (color.equals(colors[i])){
				countColor++;
			}
			if (number == numbers[i]){
				countNumber++;
			}
		}

		if (countColor == 0 && countNumber == 0){//if neither color nor number matched,return draw
			return "DRAW";
		}
		else if (countNumber > countColor){
			//if the matched number is more than matched color
			if (arrayList.contains("R"+number)){
				return "R"+number;
			}
			else if (arrayList.contains("Y"+number)){
				return "Y"+number;
			}
			else if (arrayList.contains("G"+number)){
				return "G"+number;
			}
			else if (arrayList.contains("B"+number)){
				return "B"+number;
			}
			else {
				return "DRAW";
			}
		}
		else {
			//if the matched color is equal or more than matched number
			if (arrayList.contains(color+1)){
				return color+1;
			}
			else if (arrayList.contains(color+2)){
				return color+2;
			}
			else if (arrayList.contains(color+3)){
				return color+3;
			}
			else if (arrayList.contains(color+4)){
				return color+4;
			}
			else if (arrayList.contains(color+5)){
				return color+5;
			}
			else if (arrayList.contains(color+6)){
				return color+6;
			}
			else if (arrayList.contains(color+7)){
				return color+7;
			}
			else if (arrayList.contains(color+8)){
				return color+8;
			}
			else{
				return "DRAW";
			}
		}
	}
	//R1 R4 G2 G8 B2 R2 R8 Y7 Y8 B3 R3 R6 Y3 G4 G5 B6 Y2 B7 Y1 G6 Y5 G7 R5 R7 G1 Y4 B5 G3 B1 B8 B4 Y6
	//Y3 Y7 Y8 B1 B7 R8 Y1 G4 G8 B8 R3 R4 R7 Y6 B5 B3 R2 G5 B6 Y5 G3 G2 Y4 R1 G1 Y2 G6 B4 R5 G7 R6 B2
	/**Y3 Y7 Y8 B1 B7
	   R8 Y1 G4 G8 B8
	   R3 R4 R7 Y6 B5
	   B3
	   R2 G5 B6 Y5 G3 G2
	      Y4 R1 G1 Y2 G6
	      B4 R5 G7 R6 B2*/
}
