import java.util.Scanner;

public class Exercise4 {
    /**
     * print n*m, n*(m-1), ... n*2, n*1
     * @param n
     * @param m
     */
    public static void multiples(int n, int m){
        if (m > 1){
            System.out.print(n*m+", ");
            multiples(n,m-1);
        }
        if (m == 1){
            System.out.println(n*m);
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input n and m: ");
        int n = in.nextInt();
        int m = in.nextInt();
        multiples(n,m);
    }

}
