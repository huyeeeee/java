/**
 * in this file, read students' data from the text file "Exercise3.txt"
 * and save students' last name to the file "Exercise3Output.txt" one by one
 *
 * hint: the command in this java file should be shown as follow:
 * 1: javac Exercise3.java
 * 2: java Exercise3
 * 3: Exercise3.txt(the file that store the students' information)
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise3 {
    public static void main(String[] args) throws IOException {
        GenericStack<StudentRecord> stack1 = new GenericStack<>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the filename to read from:");
        String filename = keyboard.nextLine();
        File file = new File(filename);
        Scanner inputFile = new Scanner(file);
        StringTokenizer token;
        while (inputFile.hasNext()){
            String line = inputFile.nextLine();
            token = new StringTokenizer(line, " ");
            String firstName = token.nextToken();
            String lastName = token.nextToken();
            String IDString = token.nextToken();
            //convert String IDString to an Integer Object IDNum
            Integer IDNum = Integer.valueOf(IDString);


            /*
            * Create a StudentRecord Object with the first name, last name
            * and ID number, push it into stack1
            * */
            stack1.push(new StudentRecord(firstName,lastName,IDNum));
        }

        /*
        * save the student's last name to a text file
        * */
        File output = new File("Exercise3Output.txt");
        OutputStream outputStream = new FileOutputStream(output);

        // use a arrayList to reverse the stack
        ArrayList<StudentRecord> temp = new ArrayList<>();
        while (!stack1.isEmpty()){
            temp.add(stack1.pop());
        }

        for (int i = temp.size()-1;i >= 0;i--){
            outputStream.write((temp.get(i).getLastName()+"\n").getBytes());
        }
        inputFile.close();
    }
}
