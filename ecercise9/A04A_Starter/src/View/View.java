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
 * Description : This program has one method that display information in a specific button
 *              based on parameter "number"
 */

import javax.swing.*;
import java.util.ArrayList;

public class View
{

    private MainFrame mf;

    public View()
    {
        mf = new MainFrame();
    }

    /**
     * @return the mf
     */
    public MainFrame getMf()
    {
        return mf;
    }

    /**
     * @param mf the mf to set
     */
    public void setMf(MainFrame mf)
    {
        this.mf = mf;
    }

    /**
     *
     * @param string is the text that all Buttons display
     */
    public void addButton(ArrayList<String> string){
        mf.getIp().addButton(string);
    }
}
