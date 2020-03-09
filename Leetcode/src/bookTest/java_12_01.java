package bookTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class java_12_01 {
    public static void main(String[] args) throws Exception{
        File f = new File("./a.txt");
        OutputStream out = null;
//        out = new FileOutputStream(f);
        out = new FileOutputStream(f,true);//true代表追加内容
        String str = "helloWorld!";
        byte []b = str.getBytes();
        for (byte temp:b){
            System.out.println(temp);
        }
        out.write(b);
        out.close();
    }
}
