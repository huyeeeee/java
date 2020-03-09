//Code for Exercise 3
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
        while (true){
            Scanner input = new Scanner(System.in);
            int length = input.nextInt();
            if (length == 0)
                System.exit(0);
            double[][] points = new double[length][2];
            for (int i = 0; i < points.length; i++) {
                points[i][0] = input.nextDouble();
                points[i][1] = input.nextDouble();
            }

            Rectangle boundingRectangle = getRectangle(points);
            //TODO: Display its center, width and height
            System.out.println("The bounding rectangle's center ("+
                    (boundingRectangle.getXpos()+boundingRectangle.getWidth()/2.0)+", "+
                    (boundingRectangle.getYpos()+boundingRectangle.getHeight()/2.0)+"), width "+
                    boundingRectangle.getWidth()+", height "+boundingRectangle.getHeight());
        }
    }

    public static Rectangle getRectangle(double[][] points) {
        //TODO – Complete this method
        //This method finds the xpos, ypos, width and height of the bounding rectangle
        //constructs it and returns it

        double xmin = Double.MAX_VALUE;
        double xmax = -1;
        double ymin = Double.MAX_VALUE;
        double ymax = -1;
        for (int i = 0;i < points.length;i++){
            if (points[i][0] < xmin){
                xmin = points[i][0];
            }
            if (points[i][0] > xmax){
                xmax = points[i][0];
            }
            if (points[i][1] < ymin){
                ymin = points[i][1];
            }
            if (points[i][1] > ymax){
                ymax = points[i][1];
            }
        }
        Rectangle r = new Rectangle(xmin,ymin,xmax-xmin,ymax-ymin);
        return r;
    }
}