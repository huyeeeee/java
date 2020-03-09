package bookTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class java_11_05 {
    public static void main(String[] args){
        String str = "2019-09-08";
        String pat = "\\d{4}-\\d{2}-\\d{2}";
        Pattern p = Pattern.compile(pat);
        Matcher m = p.matcher(str);
        if (m.matches()){
            System.out.println("legal");
        }
        else {
            System.out.println("illegal");
        }
    }
}
