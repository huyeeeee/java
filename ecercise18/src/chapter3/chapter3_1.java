package chapter3;

public class chapter3_1 {
    public boolean isTrue(int num){
        String s = num  + "";
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = 0;i < chars.length;i++){
            sum += Math.pow(chars[i] - '0',3);
        }
        if (sum == num)
            return true;
        else
            return false;
    }
    public static void main(String[] args){
        chapter3_1 chapter3_1 = new chapter3_1();
        for (int i = 1;i < 10000;i++){
            if (chapter3_1.isTrue(i))
                System.out.println(i);
        }
    }
}
