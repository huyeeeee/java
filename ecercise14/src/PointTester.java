/**
 * in this file, read data from a text file called "Exercise1.txt",
 * then using the data to create object point, after that,
 * write the information of object point in file "Exercise1Output.txt"
 *
 * hint: the command of this java file should be:
 * 1: javac PointTester.java
 * 2: java PointTester
 * 3: Exercise1.txt(the file that store the data)
 */

import java.io.*;
import java.util.*;

public class PointTester {
    public static void main(String[] args) throws IOException {
        // an arrayList to store points
        ArrayList<Point> points = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the filename to read from:");

        // the filename that store data
        String filename = in.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        StringTokenizer token;
        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            token = new StringTokenizer(line, " ");
            String xpos = token.nextToken();
            String ypos = token.nextToken();
            points.add(new Point(xpos,ypos));
        }
        File output = new File("Exercise1Output.txt");
        OutputStream outputStream = new FileOutputStream(output);
        for (int i = 0;i < points.size();i++){
            outputStream.write((points.get(i).toString()+"\n").getBytes());
        }
        inputFile.close();
    }
}
