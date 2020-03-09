/**
 * in this file, read file from the text file "Exercise5.txt"
 * and save it in file "Exercise5Output.txt"
 *
 * hint: the command should be shown as follows:
 * 1: javac Exercise5.java
 * 2: java Exercise5
 * 3: Exercise5.txt (file that store the data)
 */

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise5 {
    public static void main(String[] args) throws IOException {
        PrintQueue pq = new PrintQueue();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename to read from:");
        String filename = in.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        StringTokenizer token;
        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            token = new StringTokenizer(line, " ");
            String owner = token.nextToken();
            int jobID = Integer.parseInt(token.nextToken());
            pq.lpr(owner,jobID);
        }
        System.setOut(new PrintStream(new File("Exercise5Output.txt")));
        pq.lpq();
    }
}
