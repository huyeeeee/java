package chapter3;

public class chapter3_11 {
    public int calculate(int n){
        if (n == 0)
            return 1;

        return calculate(n-1) * n;
    }
    public static void main(String[] args){
        chapter3_11 chapter3_11 = new chapter3_11();
        int sum = 0;
        for (int i = 1;i < 21;i++){
            sum += chapter3_11.calculate(i);
        }
        System.out.println(sum);
    }
}
