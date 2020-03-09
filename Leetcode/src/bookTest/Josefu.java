package bookTest;

import java.util.ArrayList;

public class Josefu {
	public static void main(String[] args){
		ArrayList<Integer> person = new ArrayList<>();
		long t1,t2;
		for (int i = 0;i < 10000;i++){
			person.add(i);
		}
		t1 = System.currentTimeMillis();
		System.out.println(solution(person,432));
		t2 = System.currentTimeMillis();
		System.out.println("speed time is: " + (t2 - t1));
	}

	public static int solution(ArrayList<Integer> person, int num){
		int count = 0;
		while (person.size() > 1){
//			System.out.println(count + " " + num + " " + person.size());
			count = (count + num) % person.size();
			person.remove(count);
//			System.out.println(person.remove((count + num) % person.size()));
		}
		return person.get(0);
	}
}
