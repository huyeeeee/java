/**
 * in the java file, add three method as three new calculations
 */
package cse360assign3;

public class Calculator extends AddingMachine{
    public Calculator(){
        super();
    }

    /**
     *
     * @param value is the value that should be multiplied to the current total
     */
    public void mult(int value){
        total *= value;
        history = history + " * " + value;
    }

    /**
     *
     * @param value is the value that should be divided by the current total
     */
    public void div(int value){
        if (value == 0) {
            total = 0;
        }
        else{
            total /= value;
            history = history + " / " + value;
        }
    }

    /**
     * calculation as total^value
     * @param value
     */
    public void power(int value){
        if (value < 0) {
            total = 0;
        }
        else {
            total = (int)Math.pow(total,value);
            history = history + " ^ " + value;
        }
    }

    public static void main(String[] args){
        Calculator c = new Calculator();
        c.add(1);
        c.subtract(10);
        c.mult(-10);
        System.out.println(c.total);
        System.out.println(c.history);
        c.div(0);
        c.power(2);
        System.out.println(c.total);
        System.out.println(c.history);
    }
}
