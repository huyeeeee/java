/**
 *in this version, I define a private variable String to store
 * the history of the calculation, while using method add or subtract
 * ,this variable will be added, and the toString() method return this variable,
 * and the variable total is also changed when method add() or subtract() is called,
 * the getTotal() return the current total number.And the clear() method set
 * all variables to the 0 to integer and "" to string.
 *  */
package cse360assign2;

public class AddingMachine2 {

    private int total;
    private String history;//use to record the history
    public AddingMachine2 () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    public int getTotal () {
        return total;
    }

    public void add (int value) {
        total += value;
        history = history + " + " + value;
    }

    public void subtract (int value) {
        total -= value;
        history = history + " - " + value;
    }

    public String toString () {
        return history;
    }


    public void clear() {
        total = 0;
        history = "0";
    }

    /*public static void main(String[] args){
        //test demo
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator.toString());
        myCalculator.clear();
        System.out.println(myCalculator.toString());
    }*/
}
