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
 * Description : This program defines the JFrame
 */

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame
{

    private InitialPanel ip;

    public MainFrame()
    {
        super("A04A - Basic Graphics");
        setupLayoutForMacs();
        ip = new InitialPanel();
        add(ip, "Center");
        //------------------------------------------------------
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(720, 280);
        setVisible(true);
    }

    private void setupLayoutForMacs()
    {
        // On some MACs it might be necessary to have the statement below 
        //for the background color of the button to appear    
        try
        {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        //------------------------------------------------------
    }

    /**
     * @return the ip
     */
    public InitialPanel getIp()
    {
        return ip;
    }

    /**
     * @param ip the ip to set
     */
    public void setIp(InitialPanel ip)
    {
        this.ip = ip;
    }
}
