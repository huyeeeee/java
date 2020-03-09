package niuke;


public class spaceReplace {
    public static String replaceSpace(StringBuffer str) {
        String string = str.toString();
        String str1 = string.replace(" ","%20");
        return str1;
    }

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("we are happy");
        System.out.println(replaceSpace(stringBuffer));
    }
}
