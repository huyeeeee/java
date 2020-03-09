package com.company;

/**
 * Final project 2,8.17 on page 311
 */

import java.io.*;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinancialTsunami extends JFrame{
    public static double[] stringToDouble(String str){
        //transfers string to double array,use this function,transfer the string data to a double array
        int len = str.split(" ").length;//array's length
        double[] res = new double[len];
        for(int i = 0;i < len;i++)
            res[i] = Double.parseDouble(str.split(" ")[i]);
        return res;
    }

    public static String[] readFile(String filepath) throws IOException {
        //reads the file and return in a string
        FileReader fr = new FileReader(filepath);

        BufferedReader br = new BufferedReader(fr);
        String str = "";
        String str1 = "";
        while ((str1 = br.readLine()) != null){
            str = str + str1 + ",";//put all data in the file in a string,the substring divided by using ","
        }
        String[] str2 = str.split(",");//split str ,and put the result in a string array
        br.close();
        fr.close();
        return str2;
    }
    public static String judgeUnsafeBank(String filepath) throws IOException{//you filepath should be an absolute path,not a relative path
        //judge the banks in the file is unsafe or not
        String[] input = readFile(filepath);
        double limit = stringToDouble(input[0])[1];//get the unsafe bank limit
        double[] sum = new double[(int)stringToDouble(input[0])[0]];//get the number of the banks
        int[] mark = new int[sum.length];
        for (int i = 0;i < sum.length;i++){
            mark[i] = 0;
            double[] temp = stringToDouble(input[i+1]);
            sum[i] = temp[0];//the asset in the bank
            int sign = 3;
            for (int j = 0;j < (int)temp[1];j++){//the asset in other banks,and temp[1] is the number of banks that you lend to
                sum[i] += temp[sign];
                sign += 2;
            }
        }
        for (int i = 0;i < sum.length;i ++){
            if (sum[i] < limit){
                mark[i] = 1;
            }
        }
        for (int i = 0;i < sum.length;i++){
            double[] temp = stringToDouble(input[i+1]);
            int sign = 2;
            for (int j = 0;j < (int)temp[1];j++){//the asset in other banks,and temp[1] is the number of banks that you lend to
                if (mark[(int) temp[sign]] == 1)
                    sum[i] -= temp[sign+1];
                sign += 2;
            }

        }

        String str1 = "Unsafe bank(s) (are)is:";
        for (int i = 0;i < sum.length;i++){
            if (sum[i] < limit)
                str1 += (" " + (i+1));
        }
        return str1;
    }

    FinancialTsunami(){//graphic user interface
        JFrame jf = new JFrame();
        jf.setTitle("this is a window");
        jf.setSize(400,500);
        jf.setDefaultCloseOperation(3);
        jf.setLocationRelativeTo(null);

        FlowLayout flow = new FlowLayout();
        jf.setLayout(flow);
        JButton jb = new JButton("reload your file");
        jb.setBounds(200,200,80,40);


        JTextField jtf = new JTextField("input your file path");
        jtf.setBounds(300,300,100,40);
        jtf.setColumns(20);

        JTextPane jtp = new JTextPane();
        jtp.setBounds(300,300,300,400);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String str = jtf.getText().trim();
                Document docs = jtp.getDocument();
                try {
                    docs.insertString(docs.getLength(),judgeUnsafeBank(str),null);
                }catch (IOException e1){
                    e1.printStackTrace();
                }catch (BadLocationException e2){
                    e2.printStackTrace();
                }
            }
        });

        jf.add(jtf);
        jf.add(jb);
        jf.add(jtp);
        jf.setVisible(true);
    }
}


