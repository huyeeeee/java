//Code for Exercise 2
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTest = input.nextInt();
        for (int i = 0;i < numberOfTest;i++){
            double fxpos = input.nextDouble();
            double fypos = input.nextDouble();
            double fradius = input.nextDouble();
            double sxpos = input.nextDouble();
            double sypos = input.nextDouble();
            double sradius = input.nextDouble();
            Circle c1 = new Circle(fxpos,fypos,fradius);
            Circle c2 = new Circle(sxpos,sypos,sradius);
            System.out.println("The first Circle's centre is: "+fxpos+", "+fypos+"\nIt's radius is: "+fradius);
            System.out.println("The second Circle's centre is: "+sxpos+", "+sypos+"\nIt's radius is: "+sradius);
            System.out.println("The 'contains' method returns: "+c1.contains(c2));
            System.out.println("The 'touches' method returns: "+c1.touches(c2));
        }
    }
}
