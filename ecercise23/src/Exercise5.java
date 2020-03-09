import java.util.Scanner;

public class Exercise5 {
    /**
     * print number vertically
     * @param n
     */
    public static void writeVertical(int n){
        if (n > 0){
            writeVertical((n - n % 10) / 10);
            System.out.println(n % 10);
        }
    }

    public static void main(String[] args){
        System.out.println("input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        writeVertical(n);
    }
}
