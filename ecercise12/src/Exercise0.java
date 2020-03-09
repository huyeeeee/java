import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Exercise0 {
	public static ArrayList<Integer> createKeys(int n){
		ArrayList<Integer> res = new ArrayList<>();
		Random r = new Random();
		for (int i = 0;i < n;i++){
			int temp = r.nextInt(10000);
			while (temp == 0 || res.contains(temp)){
				temp = r.nextInt(10000);
			}
			res.add(temp);
		}
		return res;
	}

	public static ArrayList<LinkedList<Integer>> createHashTable(int t,int n){
		ArrayList<LinkedList<Integer>> table = new ArrayList<>(t);
		ArrayList<Integer> keys = createKeys(n);
		for (int i = 0;i < 10;i++){
			LinkedList<Integer> l = new LinkedList<>();
			for (int j = 0;j < keys.size();j++){
				if (keys.get(j) % 10 == i){
					l.add(keys.get(j));
				}

			}
			table.add(l);
		}
		return table;
	}

	public static void show(int t,int n){
		ArrayList<LinkedList<Integer>> table = createHashTable(t,n);
		int max = -1;
		int collisions = 0;
		System.out.println("Hash Table created:");

		for (int i = 0;i < table.size();i++){
			max = (max < table.get(i).size()) ? table.get(i).size() : max;
			if (table.get(i).size() == 0){
				System.out.println("-->empty");
			}
			else {
				if (table.get(i).size() > 1){
					collisions++;
				}
				for (int j = 0;j < table.get(i).size();j++){
					System.out.print("-->"+table.get(i).get(j));
				}
				System.out.println();
			}
		}
		System.out.println("Statistics: ");
		System.out.println("Table size: "+ t);
		System.out.println("Number of keys: "+n);
		System.out.println("Load factor: "+(double)t/(double)n);
		System.out.println("Number of collisions: "+collisions);
		System.out.println("Longest list: "+max);
	}
	public static void test(){
		System.out.println("Table size\t\t#Keys\t\tLoad factor\t\t#Collisions\t\tLongest list");
		for (int i = 1;i < 10;i++){
			ArrayList<LinkedList<Integer>> table = createHashTable(10,i*10);
			int max = -1;
			int collision = 0;
			for (int j = 0;j < table.size();j++){
				max = (max < table.get(j).size()) ? table.get(j).size() : max;
				if (table.get(j).size() > 1){
					collision+=(table.get(j).size()-1);
				}
			}
			System.out.println(10+"\t\t\t\t"+i*10+"\t\t\t"+(double)i+"\t\t\t\t"+collision+"\t\t\t\t"+max);
		}
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What size hash table do you want to work with?\n" +
				"Enter a positive Integer:");
		int t = in.nextInt();
		System.out.print("How many keys do you want to generate?\n" +
				"Enter a positive Integer:");
		int n = in.nextInt();
		show(t,n);
		System.out.println("\n");
		test();

	}
}
