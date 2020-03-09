package bookTest;

import java.util.*;

public class java_13_04 {
    /*
    * the basic methods of hashMap
    * */
    public static void main(String[] args){
        Map<String,Integer> m = new HashMap<>();
        m.put("huJP",100);
        m.put("DengY",99);
        m.put("ShiZY",98);
        m.put("huJP",10);
        int temp = m.get("DengY");
        System.out.println(temp);
        Set<String> tempS = m.keySet();
        System.out.println(tempS);

        Collection<Integer> tempI = m.values();
        Iterator<Integer> iter = tempI.iterator();
        System.out.println(tempI);
        System.out.println(m);
    }
}
