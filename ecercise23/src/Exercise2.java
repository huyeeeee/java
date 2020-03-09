import java.util.Scanner;

public class Exercise2 {
    /**
     * print number from n to 1,then print "BlastOff!"
     * @param n
     */
    public static void countDown(int n){
        if (n == 0){
            System.out.println("BlastOff!");
        }
        else {
            System.out.print(n+"\t");
            countDown(n-1);
        }
    }

    public static void main(String[] args){
        System.out.println("input a number to calculation: ");
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        countDown(c);
    }
}
