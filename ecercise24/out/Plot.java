package NPTVisualizer;
//import org.math.*;
import org.math.plot.Plot2DPanel;

import javax.swing.*;

public class Plot {
    public static void main(String[] args){
        double[] y ={2.0, 4.0, 6.0, 8.0, 10.0, 12.0, 14.0, 16.0, 18.0, 20.0, 22.0, 24.0, 26.0, 28.0, 30.0, 32.0, 34.0, 36.0, 38.0, 40.0, 42.0};
        double[] x = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 60.0, 1500.0, 643.0, 643.0, 0.0};
        Plot2DPanel plot2DPanel = new Plot2DPanel();
//        plot2DPanel.addScatterPlot("myPlot",x,y);
//        plot2DPanel.addBarPlot("1",x,y);
        plot2DPanel.addLinePlot("2",x,y);
        plot2DPanel.setBounds(0,0,1000,400);
        JFrame jFrame = new JFrame();
        JPanel jPanel = new JPanel();
        jFrame.setBounds(200,200,1000,500);
        jFrame.setLayout(null);
        jPanel.add(plot2DPanel);
        jPanel.setLayout(null);
        jPanel.setBounds(0,0,1000,400);
        jFrame.add(jPanel);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
