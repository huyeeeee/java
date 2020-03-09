import java.util.Scanner;

public class TwoDimensionalArray {
    private Object[][] twoDimensionalArray;
    public TwoDimensionalArray(int rows,int columns){
        twoDimensionalArray = new Object[rows][columns];
    }

    /**
     * Using this method,it print all the element stored in the array
     */
    public void printAll(){
        for (int i = 0;i < twoDimensionalArray.length;i++){
            for (int j = 0;j < twoDimensionalArray[i].length;j++){
                System.out.print(twoDimensionalArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    /**
     * Using this method, it will print a specific element based on its
     * location(row and column in the array)
     */
    public void printSpecificElement(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please input the element's row and column you want to search");
        int row = in.nextInt();
        int col = in.nextInt();
        System.out.println("the element you search is : " + twoDimensionalArray[row-1][col-1]);
    }

    /**
     * This method will print the rows and columns of this method
     */
    public void showLength(){
        System.out.println("the rows and columns of this array is :[" +
                twoDimensionalArray.length + " , "+ twoDimensionalArray[0].length + "]");
    }

    /**
     * Using this method , it initializes the array.
     * Attention : this method should be used in the first place
     */
    public void setTwoDimensionalArray(){
        int count = twoDimensionalArray.length * twoDimensionalArray[0].length;
        for (int i = 0;i < twoDimensionalArray.length;i++){
            for (int j = 0;j < twoDimensionalArray[i].length;j++){
                System.out.println("Please input elements to initialize the array , "
                        + (count--) + " element(s) should be input");
                Scanner in = new Scanner(System.in);
                twoDimensionalArray[i][j] = in.next();
            }
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the row and column of this array");
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray(row,column);
        twoDimensionalArray.setTwoDimensionalArray();
        twoDimensionalArray.printAll();
        twoDimensionalArray.printSpecificElement();
        twoDimensionalArray.showLength();
    }
}
