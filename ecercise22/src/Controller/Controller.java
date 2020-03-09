package Controller;

/**
 * Name : Meishuai Li
 * Class : IST 242 WC
 * Program : L03C : Assignment - MVC
 * Due Date : 2019-6-16-23:59
 * Honor Pledge: On my honor as a student of Penn State University,
 *              I have neither given nor received unauthorized help on this homework assignment.
 * Name : Meishuai Li
 * Email : mxl465@psu.edu
 * Description : This program has two attributes and one method (except get and set methods) to
 *              show the data from model.findStudent
 */


import Model.Model;
import View.View;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;

public class Controller
{

    Model model;
    View view;

    public Controller(Model model, View view)
    {
        this.model = model;
        this.view = view;
    }

    /**
     * use a for loop to print the information from model
     */
    public void showData(){
        for (int i = 0;i < model.getSts().size();i++){
            view.displayData(model.findStudent(i));
        }
    }

}
