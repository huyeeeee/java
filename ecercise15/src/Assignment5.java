import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Assignment5 {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the filename to read from: ");
		String str = in.nextLine();
		File f = new File(str);
		Scanner input = new Scanner(f);
		int n = Integer.parseInt(input.nextLine());
		int[][] adj = new int[n][n];
		String[] s;
		int v1,v2;
		while (input.hasNext()){
			s = input.nextLine().split("\t");
			v1 = s[0].charAt(0)-65;
			v2 = s[1].charAt(0)-65;
			adj[v1][v2] = adj[v2][v1] = 1;
		}
		showing_matrix(adj);
		breadFirstSearch(adj);
	}
	public static void showing_matrix(int[][] adj){
		System.out.println("Adjacency Matrix:\n\n\tA\tB\tC\tD\tE");
		for (int i = 0;i < adj.length;i++){
			System.out.print((char)(i+65)+"\t");
			for (int j = 0;j < adj.length;j++){
				System.out.print(adj[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void breadFirstSearch(int[][] adj) {
		boolean[] visited = new boolean[adj.length];
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(0);
		visited[0] = true;
		int temp;
		System.out.println("Vertices Visited:\n");
		while (!queue.isEmpty()) {
			temp = queue.poll();
			System.out.println((char)(temp+65)+"\tvisited");
			for (int i = 0; i < adj.length; i++) {

				if ((adj[temp][i] != 0 && adj[temp][i] != Integer.MAX_VALUE)
						&& !visited[i]) {
					queue.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
