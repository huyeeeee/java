package chapter3;

public class chapter3_6 {
    public static void main(String[] args){
        int i = 13;
        int sum = 0;
        while (i < 1004){
            if (i / 10 % 2 == 1)
                sum += i;
            else if (i / 10 % 2 == 0)
                sum -= i;
            i += 10;
        }
        System.out.println(sum);
    }
}
