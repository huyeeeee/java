package View;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L04B : Assignment - Basic Listening with MVC
 * Due Date : 2019-6-30:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : This program defines a basic JPanel , and it has an ArrayList to store Buttons and
 *              a method that add button one by one by using another ArrayList<String> to set name
 */


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class InitialPanel extends JPanel
{
    private ArrayList<JButton> jButtons = new ArrayList<>();

    public InitialPanel()
    {
        super();
        setBackground(Color.darkGray);
        setLayout(new GridLayout(3,1));
    }

    /**
     *
     * @return the jButtons
     */
    public ArrayList<JButton> getjButtons() {
        return jButtons;
    }

    /**
     *
     * @param strings is the text that display in the button
     */
    public void addButton(ArrayList<String> strings){
        for (int i = 0;i < strings.size();i++){
            jButtons.add(new JButton(strings.get(i)));
            add(jButtons.get(i));

        }
    }
}
