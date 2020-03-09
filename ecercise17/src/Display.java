import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Display implements Gui{
    private Controller controller;
    private JButton coinSlot = new JButton("Coin Slot");
    private JButton goOrStop = new JButton("Go/Stop");
    private JPanel jPanel = new JPanel();
    private JFrame jFrame = new JFrame("SimpleGame");
    private JTextField jTextField = new JTextField();

    public Display(){

    }

    @Override
    public void init() {
        jFrame.setBounds(100,100,1000,1000);
        jPanel.setBounds(0,0,1000,1000);
        jPanel.setLayout(null);
        jFrame.add(jPanel);

        jTextField.setBounds(300,100,500,600);
        jTextField.setEnabled(false);
        jTextField.setForeground(Color.BLACK);
        jPanel.add(jTextField);

        coinSlot.setBounds(100,200,100,50);
        goOrStop.setBounds(100,300,100,50);

        coinSlot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        controller.coinInserted();
                    }
                }).start();
            }
        });
        goOrStop.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                controller.goStopPressed();
            }
        });
        jPanel.add(coinSlot);
        jPanel.add(goOrStop);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    @Override
    public void connect(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void setDisplay(String s) {
        jTextField.setText(s);
    }


}
