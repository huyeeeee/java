package leetcode;

public class addBinary_67 {
    public static String addBinary(String a,String b){
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int sign = 0;
        int sign1 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (al >= 0 || bl >= 0){
            int c = 0;
            if (al >= 0 && bl >= 0){
                c = (a.charAt(al) - '0') + (b.charAt(bl) - '0') + sign;
                if (al == 0 && bl == 0 && c >= 2){
                    sign1 = 1;
                }
            }
            else if (al >= 0 && bl < 0 ){
                c = a.charAt(al) - '0' + sign;
                if (al == 0 && c == 2){
                    sign1 = 1;
                }
            }
            else if (bl >= 0 && al < 0){
                c = b.charAt(bl) - '0' + sign;
                if (bl == 0 && c == 2){
                    sign1 = 1;
                }
            }

            if (c >= 2){
                sign = 1;
                stringBuilder.append(c - 2);
            }
            else{
                stringBuilder.append(c);
                sign = 0;
            }
            if (sign1 == 1){
                stringBuilder.append(sign1);
            }
            al--;
            bl--;
        }

        return stringBuilder.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(addBinary("1010","1011"));
    }
}
