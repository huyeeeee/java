package bookTest;

import java.io.*;

public class java_12_04 {
    public static void main(String[] args){
        BufferedReader b = null;
        b = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        System.out.println("input something:");
        try{
            str = b.readLine();
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(str);
    }
}
