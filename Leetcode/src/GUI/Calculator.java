package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
	private static int num1;
	private static int num2;
	private static String operator;
	public Calculator(){
		JFrame jFrame = new JFrame("Calculator");
		jFrame.setBounds(100,100,400,400);
		jFrame.setLayout(new GridLayout(2,1));
		JPanel jPanel = new JPanel();
		JPanel jPanel1 = new JPanel();
		JTextArea jTextPane = new JTextArea();
		jTextPane.setColumns(20);
		jTextPane.setEditable(false);
		jPanel.setLayout(new GridLayout(4,4));
		String[] strings = new String[]{"1","2","3","+",
				"4","5","6","-","7","8","9","*",
				"=","0","AC","/"};

		JButton[] jButtons = new JButton[16];
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0;i < 16;i++){
			jButtons[i] = new JButton(strings[i]);
			int a = i;

			jButtons[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {

					if (a == 0 || a == 1 || a == 2 ||
							a == 4 || a == 5 || a == 6 ||
							a == 8 || a == 9 || a == 10 ||
							a == 13){
						stringBuilder.append(strings[a]);
						jTextPane.append(strings[a]);

						System.out.println(stringBuilder.toString());
					}
					else if (a == 3 || a == 7 || a == 11 || a == 15){
						num1 = Integer.valueOf(stringBuilder.toString());
						stringBuilder.delete(0,stringBuilder.length());
						jTextPane.append(strings[a]);
						operator = strings[a];
					}
					else if (a == 12){
						double result;
						num2 = Integer.valueOf(stringBuilder.toString());
						if (operator.equals("+")){
							result = num1 + num2;
						}
						else if (operator.equals("-")){
							result = num1 - num2;
						}
						else if (operator.equals("*")){
							result = num1 * num2;
						}
						else {
							result = (double) num1 / (double)num2;
						}
						jTextPane.setText(String.valueOf(result));
					}
					else if (a == 14){
						// i = 14
						jTextPane.setText("");
						num2 = num1 = 0;
						stringBuilder.delete(0,stringBuilder.length());					}
				}
			});

			jPanel.add(jButtons[i]);
		}

		jPanel1.add(jTextPane);
		jFrame.add(jPanel1);
		jFrame.add(jPanel);

		jFrame.setVisible(true);
	}

	public static void main(String[] args){
		Calculator c = new Calculator();
	}
}
