/**
 * in this java file, read the data from text file "Exercise2.txt",
 * and then print the data
 *
 * hint: the command in this file should be shown as follow:
 * 1: javac GenericStackTest.java
 * 2: java GenericStackTest <Exercise2.txt> Exercise2Output.txt
 */

import java.io.*;
import java.util.*;

public class GenericStackTest {
    public static void main(String[] args) throws IOException {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Integer> stack2 = new GenericStack<>();
        Scanner in = new Scanner(System.in);

        // the two temporary variables to store data that users input
        String s;
        int temp;

        // input data
        while (!(s = in.next()).equals("quit")){
            stack1.push(s);
        }
        while ((temp = Integer.parseInt(in.next())) != -1) {
            stack2.push(temp);
        }

        System.out.println("String Stack Content: ");
        while (!stack1.isEmpty()){
            System.out.println(stack1.pop());
        }
        System.out.println("Integer Stack Content: ");
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }

}
