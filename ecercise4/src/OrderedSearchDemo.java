/**
 * do some tests about the complexity of search in an OrderedList
 *
 * command hint:
 * 1. javac OrderedSearchDemo.java
 * 2. java OrderedSearchDemo <exercise0B.in> OrderedSearchResult.txt
 *
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class OrderedSearchDemo {
    private static OrderedList<String> names = new OrderedList<>();
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name to read from:");
        String fn = in.nextLine();
        File f = new File(fn);
        Scanner inputFile = new Scanner(f);
        while (inputFile.hasNext()){
            names.add(inputFile.next());
        }

        long startTime,endTime,executionTime;
        int count = 0;
        String s;
        while (count++ < 10){
            startTime = System.currentTimeMillis();
            System.out.println("please input the name you want to search: ");
            s = in.next();
            if (search(s)){
                System.out.println(s+" found");
            }
            else {
                System.out.println("No such element");
            }
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println(executionTime/1000.0 + "s");
        }
    }

    public static Boolean search(String name){
        return names.binarySearch(name) >= 0;
    }
}
