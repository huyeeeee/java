import java.util.Scanner;

public class Exercise3 {
    /**
     * print even numbers if n is an even number up to zero,
     * print odd numbers if n is an odd number up to zero,
     * then print "BlastOff!"
     * @param n
     */
    public static void countDown(int n){
        if (n <= 0){
            System.out.println("BlastOff!");
        }
        else {
            System.out.print(n+"\t");
            countDown(n-2);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input an even number:");
        int e = in.nextInt();
        System.out.println("input an odd number");
        int o = in.nextInt();
        countDown(e);
        countDown(o);
    }
}
