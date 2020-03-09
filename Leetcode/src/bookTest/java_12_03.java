package bookTest;

import java.io.*;

public class java_12_03 {
    public static void main(String[] args) throws Exception{
        File f = new File("./b.txt");
        /*OutputStream out = null;
        out = new FileOutputStream(f);
        String str = "this is a Problem1";
        byte[] b = str.getBytes();
        out.write(b);
        out.close();*/
        Writer out = null;
        out = new FileWriter(f);
        String str = "this is a Problem1";
        out.write(str);
        out.flush();
        //out.close();
    }
}
