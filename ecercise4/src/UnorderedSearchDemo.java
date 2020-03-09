/**
 * do some tests about the complexity of search in an UnorderedList
 *
 * command hint:
 * 1. javac UnorderedSearchDemo.java
 * 2. java UnorderedSearchDemo <exercise0B.in> UnOrderedSearchResult.txt
 *
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UnorderedSearchDemo {
    private static List<String> names = new List<>();
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the file name to read from:");
        String fileName = in.nextLine();
        File f = new File(fileName);
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

    /**
     * search if the name is in the UnOrderedList or not
     * @param name
     * @return true if the name in the list, or return false
     */
    public static Boolean search(String name){
        String s = names.first();
        while (s != null){
            if (s.equals(name)){
                return true;
            }
            s = names.next();
        }
        return false;
    }
}
