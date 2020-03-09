package Controller;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L04B : Assignment - Basic Listening with MVC
 * Due Date : 2019-6-30:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : This program has two methods,the first one retrieve students' data from Model
 *              about each student to be displayed , and the second method add buttons in the JPanel
 *              and when you click the button ,the text will be changed immediately.
 */

import Model.Model;
import View.View;
import View.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller
{

    Model model;
    View view;
    MainFrame mainFrame = new MainFrame();

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    /**
     * retrieve from Model (using the model object) data
     * about each student to be displayed
     * @return the students' information
     */
    public ArrayList<String> getData(){
        return model.getSts();
    }

    /**
     * add buttons one by one in the JPanel ,and if you click the button ,
     * the text shows in the button will be changed by this method .because
     * the changed text is credit ,so I write two methods separate basic information
     * except credit and credit respectively ,every time when you click the button,
     * the changing part is method model.getCredit()
     */
    public void passData(){

        mainFrame.getIp().addButton(model.getSts());
        for (int i = 0;i < mainFrame.getIp().getjButtons().size();i++){
            int j = i;
            mainFrame.getIp().getjButtons().get(i).addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    mainFrame.getIp().getjButtons().get(j).setText(
                            model.getInfo_01(j) + model.getCredit(j)
                    );
                }
            });
        }
    }


}
