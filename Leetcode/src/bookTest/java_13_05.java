package bookTest;

import java.util.Map;
import java.util.TreeMap;

public class java_13_05 {
    public static void main(String[] args){
        //treeMap 按照key排序
        Map<String,Integer> m = new TreeMap<>();
        m.put("hu",100);
        m.put("li",89);
        m.put("deng",94);
        m.put("deng",11);
        System.out.println(m);
    }
}
