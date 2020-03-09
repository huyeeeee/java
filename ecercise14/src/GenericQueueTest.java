/**
 * in this java file, read data from the text file "Exercise4.txt",
 * and then store the data in the file "Exercise4Output.txt"
 *
 * hint: the command should be shown as follow:
 * 1: javac GenericQueueTest.java
 * 2: java GenericQueueTest <Exercise4.txt> Exercise4Output.txt
 */

import java.io.*;
import java.util.*;

public class GenericQueueTest {
    public static void main(String[] args) throws IOException {
        GenericQueue<String> queue1 = new GenericQueue<>();
        GenericQueue<Integer> queue2 = new GenericQueue<>();
        Scanner in = new Scanner(System.in);

        String str;
        while (!(str = in.next()).equals("quit")){
            queue1.enqueue(str);
        }

        int temp;
        while ((temp = Integer.parseInt(in.next())) != -1){
            queue2.enqueue(temp);
        }

        System.out.println("String Queue Content:");
        while (!queue1.isEmpty()){
            System.out.println(queue1.dequeue());
        }
        System.out.println("Integer Queue Content: ");
        while (!queue2.isEmpty()){
            System.out.println(queue2.dequeue());
        }
    }
}
