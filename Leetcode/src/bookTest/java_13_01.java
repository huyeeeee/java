package bookTest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class java_13_01 {
    public static void main(String[] args){
//        Set<String> allSet = new TreeSet<>();
        Set<String> allSet = new HashSet<>();
        allSet.add("A");
        allSet.add("B");
        allSet.add("E");
        allSet.add("F");
        allSet.add("C");
        allSet.add("D");
        System.out.println(allSet);
    }
}
