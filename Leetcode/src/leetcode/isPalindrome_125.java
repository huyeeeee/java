package leetcode;

public class isPalindrome_125 {
    public static boolean isPalindrome(String s){
        StringBuilder str = new StringBuilder();
        if (s == null)
            return true;
        s = s.toLowerCase();
        for (char a : s.toCharArray()){
            if ((a >= 97 && a <= 122) || (a >= 48 && a <= 57)){
                str.append(a);
            }
        }
        if (str.toString().equals(str.reverse().toString()))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
}
