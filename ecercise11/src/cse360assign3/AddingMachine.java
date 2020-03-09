/**
 * in this java file, change the two private variables to protected
 *
 */
package cse360assign3;

public class AddingMachine {

    protected int total;
    protected String history;//use to record the history
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     *
     * @return the current total
     */
    public int getTotal () {
        return total;
    }

    /**
     *
     * @param value is the value that should be added to the current total
     */
    public void add (int value) {
        total += value;
        history = history + " + " + value;
    }

    /**
     *
     * @param value is the value that should be added to the current total
     */
    public void subtract (int value) {
        total -= value;
        history = history + " - " + value;
    }

    /**
     *
     * @return the current history
     */
    public String toString () {
        return history;
    }

    /**
     * clean the current state, set history and total to the initial value
     */
    public void clear() {
        total = 0;
        history = "0";
    }

    public static void main(String[] args){
        //test demo
        AddingMachine myCalculator = new AddingMachine();
        myCalculator.add(4);
        myCalculator.subtract(2);
        myCalculator.add(5);
        System.out.println(myCalculator.getTotal());
        System.out.println(myCalculator.toString());
        myCalculator.clear();
        System.out.println(myCalculator.toString());
    }
}
