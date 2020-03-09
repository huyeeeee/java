package bookTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class java_13_02 {
    public static void main(String[]args){
        List<String> all = new ArrayList<>();
        all.add("hello");
        all.add("_");
        all.add("world");
        Iterator<String> iter = all.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next()+"、");
            iter.remove();
        }
        System.out.println(all);
    }
}
