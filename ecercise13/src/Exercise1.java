//Code for Exercise1
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfTest = input.nextInt();
        for (int i = 0;i < numberOfTest;i++){
            double fxpos = input.nextDouble();
            double fypos = input.nextDouble();
            double fwidth = input.nextDouble();
            double fheight = input.nextDouble();
            double sxpos = input.nextDouble();
            double sypos = input.nextDouble();
            double swidth = input.nextDouble();
            double sheight = input.nextDouble();
            Rectangle r1 = new Rectangle(fxpos,fypos,fwidth,fheight);
            Rectangle r2 = new Rectangle(sxpos,sypos,swidth,sheight);
            System.out.println("The first Rectangle's top corner is: "+r1.getXpos()
                    +","+r1.getYpos()+"\nIt's width is: "+r1.getWidth()+
                    "\nIt's height is: "+r1.getHeight());
            System.out.println("The second Rectangle's top corner is: "+r2.getXpos()
                    +","+r2.getYpos()+"\nIt's width is: "+r2.getWidth()+
                    "\nIt's height is: "+r2.getHeight());
            System.out.println("The 'contains' method returns: "+r1.contains(r2));
            System.out.println("The 'touches' method returns: "+r1.touches(r2));
        }
    }
}
