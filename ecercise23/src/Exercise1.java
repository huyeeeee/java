/**
 * simple tests of recursive method
 */

import java.util.Scanner;

public class Exercise1 {
    /**
     *
     * @param n
     * @return n!
     */
    public static int factorial(int n){
        if (n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }

    /**
     *
     * @param n
     * @return n+(n-1)+...+2+1
     */
    public static int fib(int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n-2) + fib(n-1);
    }

    /**
     *
     * @param x
     * @param n
     * @return x^n
     */
    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        return power(x,n-1) * x;
    }

    public static void main(String[] args){
        System.out.println("factorial result is: "+factorial(3));
        System.out.println("fib result is: "+fib(10));
        System.out.println("please input x and n for power calculation:");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        System.out.println("power result is: "+power(x,n));
    }
}
