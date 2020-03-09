package leetcode;

public class reverseString_344 {
    public static void reverseString(char[] s){
        for (int i = 0;i < s.length/2;i++){
            char temp = s[i];
            s[i] = s[s.length-i-1];
            s[s.length-i-1] = temp;
        }
    }

    public static void main(String[] args){
        char[] s = new char[]{'h','o','v','b'};
        reverseString(s);
        for (int i = 0;i < s.length;i++){
            System.out.println(s[i]);
        }
    }
}
