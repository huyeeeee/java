package leetcode;

/**
 * 字符串相加，两个string存储的数字相加并返回数字的形式
 * leetcode 415
 */
public class addStrings_415 {
    public static String addStrings(String num1,String num2){


        int count = num1.length() > num2.length() ? num1.length()+1 : num2.length()+1;
        for (int i = 0;i < count;i++){
            if (num1.length() == count)
                break;
            num1 = "0" + num1;
        }
        for (int i = 0;i < count;i++){
            if (num2.length() == count)
                break;
            num2 = "0" + num2;
        }
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        int[] n3Temp = new int[count];
        for (int i = n3Temp.length-1;i > 0;i--){
            n3Temp[i] = n1[i] + n2[i] - '0' * 2 + n3Temp[i];
            if (n3Temp[i] >= 10){
                n3Temp[i-1] = 1;
                n3Temp[i] -= 10;
            }
        }
        String str = "";
        for (int i = 0;i < n3Temp.length;i++){
            str += n3Temp[i];
        }
        str = str.replaceFirst("^0*","");
        if (str.equals(""))
            str = "0";
        return str;
    }

    public static void main(String[] args){
        System.out.println(addStrings("0","0"));
    }
}
