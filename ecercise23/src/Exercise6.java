import java.util.Scanner;

public class Exercise6 {
    /**
     *
     * @param n
     * @return the sum of the squares of the numbers from 1 to n
     */
    public static int squares(int n){
        if (n == 1){
            return 1;
        }
        return n*n + squares(n-1);
    }

    public static void main(String[] args){
        System.out.println("input a number: ");
        int n = new Scanner(System.in).nextInt();
        System.out.println("squares result is: "+squares(n));
    }
}
