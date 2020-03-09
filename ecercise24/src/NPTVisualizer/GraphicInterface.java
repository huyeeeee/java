package NPTVisualizer;

/**
 * this program's main function is that shows users the graphic
 * interface , besides , it process the data from class LoadData
 * and shows them in a coordinate had two axises.
 *
 */


import org.math.plot.Plot2DPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public class GraphicInterface extends LoadData {

    private JFrame jFrame = new JFrame("Network Packet Transmission Visualizer");
    private JPanel jPanel1 = new JPanel();
    private JPanel jPanel2 = new JPanel();
    private JRadioButton jRadioButton1 = new JRadioButton("Source hosts");
    private JRadioButton jRadioButton2 = new JRadioButton("Destination hosts");
    private JMenuBar jMenuBar = new JMenuBar();
    private JMenu jMenu = new JMenu("File");
    private JMenuItem jMenuItem1 = new JMenuItem("Open Trace File");
    private JMenuItem jMenuItem2 = new JMenuItem("Quit");
    private ButtonGroup buttonGroup = new ButtonGroup();
    private JLabel jLabel1 = new JLabel("Volume [bytes]");
    private JLabel jLabel2 = new JLabel("Time [s]");
    private JComboBox stringJComboBox = new JComboBox();
    private Plot2DPanel plot2DPanel = new Plot2DPanel();



    /**
     * constructor method to initialize some components that will be used
     * in the design of the graphic interface .
     */
    public GraphicInterface(){
        jFrame.setSize(1000,500);
        jPanel1.setBounds(0,0,1000,100);
        jPanel2.setBounds(0,100,1000,400);
        jFrame.setLayout(null);
        jPanel1.setLayout(null);
        jPanel2.setLayout(null);

        stringJComboBox.setBounds(400,50,300,30);

        jRadioButton1.setBounds(10,20,200,50);
        jRadioButton2.setBounds(10,50,200,50);
        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        jPanel1.add(jRadioButton1);
        jPanel1.add(jRadioButton2);
        jRadioButton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                if (getSign() != 0) {
                                    stringJComboBox.removeAllItems();
                                    for (String str : getSourceIPAddress()){
                                        stringJComboBox.addItem(str);
                                    }
                                    jPanel1.add(stringJComboBox);
                                    setSign(1);
                                }
                            }
                        }).start();
                    }
                }

        );
        jRadioButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                if (getSign() != 0) {
                                    stringJComboBox.removeAllItems();
                                    for (String str : getDestinationIPAddress()){
                                        stringJComboBox.addItem(str);
                                    }
                                    jPanel1.add(stringJComboBox);
                                    setSign(2);
                                }
                            }
                        }).start();
                    }
                }
        );

        jLabel1.setBounds(100,40,200,20);
        jLabel2.setBounds(500,330,200,20);
        plot2DPanel.setBounds(0,0,990,350);
        jPanel2.add(jLabel1);
        jPanel2.add(jLabel2);
        stringJComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent e) {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                ArrayList<Integer> time = new ArrayList<>();
                                ArrayList<Integer> size = new ArrayList<>();
                                ArrayList<Integer> sum = new ArrayList<>();
                                double[] time1;
                                double[] size1;
                                time.add(0);
                                size.add(0);
                                ArrayList<String> temp = new ArrayList<>();
                                if(e.getStateChange() == ItemEvent.SELECTED){
                                    plot2DPanel.removeAllPlots();
                                    String text = (String)stringJComboBox.getSelectedItem();
                                    if (getSign() == 1)
                                        temp = getSaddr();
                                    else if (getSign() == 2)
                                        temp = getDaddr();
                                    for (int i = 0;i < temp.size();i++) {
                                        if (text.trim().equals(temp.get(i).trim())) {
                                            time.add(getTimeStamp().get(i));
                                            size.add(getiPPacketSize().get(i));
                                        }
                                    }
                                    int sum1 = 0;
                                    for (int i = 0;i < time.size()-1;i++){
                                        if (!time.get(i).equals(time.get(i + 1))){
                                            sum.add(sum1);
                                            sum1 = 0;
                                        }
                                        else {
                                            sum1 += size.get(i);
                                        }
                                    }
                                    sum.add(size.get(size.size()-1));
                                    time = new ArrayList<>(new HashSet<>(time));
                                    time1 = time.stream().mapToDouble(Integer::doubleValue).toArray();
                                    size1 = sum.stream().mapToDouble(Integer::doubleValue).toArray();
                                    plot2DPanel.addStaircasePlot("1",time1,size1);
                                }
                            }
                        }).start();
                    }
                }
        );
        jPanel2.add(plot2DPanel);
        jMenuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run(){
                        JFileChooser jFileChooser = new JFileChooser("./");
                        jFileChooser.showOpenDialog(null);
                        jFileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
                        try {
                            readFile(jFileChooser.getSelectedFile().getAbsolutePath());
                        }catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }).start();

            }
        });
        jMenuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jMenu.add(jMenuItem1);
        jMenu.add(jMenuItem2);
        jMenuBar.setBounds(0,0,1000,20);
        jMenuBar.add(jMenu);

        jFrame.add(jMenuBar);
        jFrame.add(jPanel1);
        jFrame.add(jPanel2);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);

    }

    public static void main(String[] args)throws IOException {
        GraphicInterface graphicInterface = new GraphicInterface();

    }
}
