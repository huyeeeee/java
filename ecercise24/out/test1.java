package NPTVisualizer;

import org.math.plot.Plot2DPanel;

import javax.swing.*;

public class test1 {
    private JFrame jFrame = new JFrame();
    private JPanel jPanel = new JPanel();
    private Plot2DPanel plot2DPanel = new Plot2DPanel();
    private JLabel jLabel1 = new JLabel("test1");
    private JLabel jLabel2 = new JLabel("test2");

    public void graph(){
        jFrame.setBounds(0,0,1000,500);
        jPanel.setBounds(0,0,1000,500);
        jLabel1.setBounds(0,0,200,30);
        jLabel2.setBounds(500,400,200,30);
        plot2DPanel.setBounds(0,0,1000,500);

    }

}
