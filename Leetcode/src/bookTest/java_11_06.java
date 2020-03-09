package bookTest;

import java.util.regex.Pattern;

public class java_11_06 {
    public static void main(String[] args){
        String str = "ASEGDHJAGD12S32HHH22312JJJ123";
        String pat = "\\d";
        Pattern p = Pattern.compile(pat);
        String[] s = p.split(str);
        for (String tmp : s){
            System.out.print(tmp+"\t");
        }
    }
}
