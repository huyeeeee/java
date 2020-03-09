import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StringParser {
    public static void main(String[] args){
        System.out.println(wordValue("ELEPHANTS"));
        System.out.println(cleanup("aaas11abdsds"));
        System.out.println(isPalindrome("abcba"));
        File in = new File("J:\\JavaProject\\StringActions\\src\\in.txt");
        File out = new File("J:\\JavaProject\\StringActions\\src\\out.txt");
        rawOutput(in,out);

    }

    public static void rawOutput(File in, File out){
        try {
            FileInputStream fis= new FileInputStream(in);
            int size = fis.available();
            byte[] temp = new byte[size];
            fis.read(temp);
            String str = new String(temp,0,size);
            System.out.println(str);

        }catch (IOException e1){
            e1.printStackTrace();
        }
    }

    public static void palindromeOutput(File in,File out){

    }

    public static void hundredDollarWordOutput(File in,File out){

    }

    public static boolean isPalindrome(String word){
        StringBuilder temp = new StringBuilder(word).reverse();
        if (word.equals(temp.toString()))
            return true;
        else return false;
    }

    public static String cleanup(String word){
        String reg = "[^a-z|A-Z]";
        String result = word.replaceAll(reg,"");
        return result;
    }

    public static int wordValue(String word){
        int value = 0;
        char []temp = word.toCharArray();
        for (char ch : temp){
            value += (ch - 'A' + 1);
        }
        return value;
    }
}
