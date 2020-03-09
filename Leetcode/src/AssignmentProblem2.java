import java.util.ArrayList;
import java.util.Scanner;
enum State {
	START,ONE,TWO,END
}
public class AssignmentProblem2 {

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
		State state = State.START;
		String s = pPile.remove(0);
		System.out.println(0 + ": " + s);
		while (true){
			if (sign % 3 == 0){
				//player 1
				temp = order(p1,s,state);
				if (s.split("")[1].equals("2") && !isExistTwo(p1) && state == State.START){
					//if the card is a "two" card and there is no "two" card in current cards,add two cards from the pile
					state = State.ONE;
					p1.add(pPile.remove(0));
					p1.add(pPile.remove(0));
					System.out.println("1: TAKE TWO");
					sign++;
					continue;
				}
				if (state == State.ONE){
					state = State.TWO;
				}
				else if (state == State.TWO){
					state = State.END;
				}
				else if (state == State.END){
					state = State.START;
				}
				if (temp.equals("DRAW")){
					p1.add(pPile.remove(0));
				}
				else {
					s = temp;
					p1.remove(temp);
				}
				System.out.print("1: " + temp);
				if (p1.size() == 0){
					System.out.println(" (WINNER)");
					break;
				}
				else {
					System.out.println();
				}
			}
			else if (sign % 3 == 1){
				temp = order(p2,s,state);
				if (s.split("")[1].equals("2") && !isExistTwo(p2) && state == State.START){
					p2.add(pPile.remove(0));
					p2.add(pPile.remove(0));
					state = State.ONE;
					System.out.println("2: TAKE TWO");
					sign++;
					continue;
				}
				if (state == State.ONE){
					state = State.TWO;
				}
				else if (state == State.TWO){
					state = State.END;
				}
				else if (state == State.END){
					state = State.START;
				}
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
				temp = order(p3,s,state);
				if (s.split("")[1].equals("2") && !isExistTwo(p3) && state == State.START){
					p3.add(pPile.remove(0));
					p3.add(pPile.remove(0));
					System.out.println("3: TAKE TWO");
					sign++;
					state = State.ONE;
					continue;
				}

				if (state == State.ONE){
					state = State.TWO;
				}
				else if (state == State.TWO){
					state = State.END;
				}
				else if (state == State.END){
					state = State.START;
				}
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
	 * judge if one player's current cards exists a "two" card
	 * @param arrayList is player's current cards
	 * @return true if exist a "two" card,return false if not
	 */
	public static boolean isExistTwo(ArrayList<String> arrayList){
		for (int i = 0;i < arrayList.size();i++){
			if (arrayList.get(i).split("")[1].equals("2")){
				return true;
			}
		}
		return false;
	}
	/**
	 * this method is used to find the right answer of "s" and "arrayList" by the rules
	 * @param arrayList is one player current cards
	 * @param s is the card that given to let player discard one right card
	 * @return the answer
	 */
	public static String order(ArrayList<String> arrayList,String s,State state){
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
		if (state == State.START){
			if (s.split("")[1].equals("2")){
				if (arrayList.contains("R2")){
					return "R2";
				}
				else if (arrayList.contains("Y2")){
					return "Y2";
				}
				else if (arrayList.contains("G2")){
					return "G2";
				}
				else if (arrayList.contains("B2")){
					return "B2";
				}
			}
		}
		if (countColor == 0 && countNumber == 0){
			return "DRAW";
		}
		else if (countNumber > countColor){
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
}

