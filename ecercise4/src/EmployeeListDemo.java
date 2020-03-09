/**
 * in this java file, do some tests about the EmployeeList class
 * command hint:
 * 1.javac EmployeeListDemo.java
 * 2.java EmployeeListDemo <exercise0A.in> exercise0AOutput.txt
 *
 * the txt file exercise0A.in is the input and the file
 * exercise0AOutput.txt is the output
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeListDemo {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file to read from:");
        String fileName = in.nextLine();
        File f = new File(fileName);
        Scanner inputFile = new Scanner(f);

        EmployeeList data = new EmployeeList();
        int id;
        String fn,ln,em,dp;
        Employee temp = null;
        while (inputFile.hasNext()){
            id = Integer.parseInt(inputFile.next());
            fn = inputFile.next();
            ln = inputFile.next();
            em = inputFile.next();
            dp = inputFile.nextLine();
            temp = new Employee(id,fn,ln,em,dp);
            data.addEmployee(temp);
        }
        inputFile.close();

        System.out.println("initial data are:");
        data.getData();

        System.out.println("please input the employee's information you want to add:");
        data.addEmployee(new Employee(in.nextInt(),in.next(),in.next(),in.next(),in.nextLine()));
        System.out.println("after add a new Employee:");
        data.getData();

        System.out.println("please input the employee's EmployeeID you want to delete:");
        data.deleteEmployee(in.nextInt());
        System.out.println("after delete a Employee:");
        data.getData();

    }
}
