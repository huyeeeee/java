package bookTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class java_12_02 {
    public static void main(String[] args) throws Exception{
        File f = new File("./a.txt");
        InputStream input = null;
        input = new FileInputStream(f);
        byte[] b = new byte[1024];
        int len = input.read(b);
        input.close();
        System.out.println(len);
        System.out.println(new String(b,0,len));
    }
}
