import javax.swing.*;
import java.util.ArrayList;

public class HomeAutoBot {
    /**
     * in this method, first, judge if the appliance s in the appliance or not, if
     * not ,return -1, or return the index the appliance s in the appliances array.
     * @param arrayList is the array that store the appliances
     * @param s is the specified appliance that we want to find if in the array or not
     * @return the index of the specified appliance in the array
     */
    public static int findElement(ArrayList<String> arrayList,String s){
        int index = -1;
        for (int i = 0;i < arrayList.size();i++){
            if (arrayList.get(i).equals(s)){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args){
        int number = 0;
        // the parameter "number" is the number of the appliance(s) we want to operate
        ArrayList<String> appliance = new ArrayList<>();
        // the parameter appliance is the array that store the name of the appliances
        // first I want to use a array that has a fixed length, but then I found using
        // ArrayList is better, the array has fixed length is better in Stage 1 or Stage 2.

        JOptionPane.showMessageDialog(null,
                "Hello, I'm Fraizr, Your personal Home Bot");
        JOptionPane.showMessageDialog(null,
                "Starting appliance input mode...");

        while (number <= 0) {
            // judge the number if is a negative integer number or not, if not,
            // repeat until the input number is a positive number
            String intValue = JOptionPane.showInputDialog(null
                    ,"How many appliances (1 or more)?"
                    , "Input", JOptionPane.PLAIN_MESSAGE);
            number = Integer.parseInt(intValue);
        }

        for (int i = 0;i < number;i++){
            // input the appliances one by one and store them
            appliance.add(JOptionPane.showInputDialog(null
            ,"Enter appliance " + i,"Input",JOptionPane.PLAIN_MESSAGE).trim());
        }

        Boolean[] state = new Boolean[appliance.size()];
        // the parameter state is defined to store the state the appliances are on or off
        // if on, the value is true, or is the false

        for (int i = 0;i < state.length;i++){
            //the initialization of the parameter state,default is false(off)
            state[i] = false;
        }

        JOptionPane.showMessageDialog(null,
                "Starting listening mode...");

        while (true){
            StringBuilder currentState = new StringBuilder();
            // shows current state
            // firstly, I want to use a simple String object, and using "+" operation as well,
            // but then I thought StringBuilder is much more convenient then String, you do not
            // have to create String object one by one, just create a StringBuilder object and its
            // method append() to add information.

            for (int i = 0;i < state.length;i++){
                // add appliances' current state one by one
                currentState.append(appliance.get(i) + " ("
                        + (state[i].toString().equals("true") ? "on" : "off") + ") ");
            }

            // the order that user inputs to control the appliance
            String str = JOptionPane.showInputDialog(null,
                    "Available appliance :" + currentState,"Input",JOptionPane.PLAIN_MESSAGE);

            if (str == null){
                // when clicking the cancel button, the parameter is a null object, so jump the while loop
                break;
            }

            String[] strings = str.split(" ");
            // parameter strings is an array that store the order.

            if (strings.length != 3){
                // first, split the string you input using space,if the order is right,
                // it should be three parts, if it is not three parts, then the order is
                // a wrong order, and you should input the order again.

                JOptionPane.showMessageDialog(null,
                        "Please say turn on or off for the following:" + currentState);
                continue;
            }

            if (strings[0].equals("turn") && (strings[1].equals("on") || strings[1].equals("off"))){
                // if the split order is an array that its length equals 3,then judge its every part,
                // the first part should be "turn", and the second part should be "on" or "off", and the
                // last part should be the appliance's name in the parameter appliance.

                if (findElement(appliance,strings[2]) == -1)
                    // after using the method findElement(), if returns -1, that means the appliance
                    // you want to control is not in the appliance list we created.
                    JOptionPane.showMessageDialog(null,"I can only control :" + currentState);

                else if (strings[1].equals("on")){
                    // if the second part is "on" and method findElement() returns a positive number,
                    // then change the corresponding appliance's state to true state(on).
                    state[findElement(appliance,strings[2])] = true;
                    JOptionPane.showMessageDialog(null,appliance.get(findElement(appliance,strings[2])) + " turned on");
                }
                else if (strings[1].equals("off")){
                    // if the second part is "off" and method findElement() returns a positive number,
                    // then change the corresponding appliance's state to false state(off).
                    state[findElement(appliance,strings[2])] = false;
                    JOptionPane.showMessageDialog(null,appliance.get(findElement(appliance,strings[2])) + " turned off");
                }
            }
        }
        JOptionPane.showMessageDialog(null,"See you next time!");
    }
}
