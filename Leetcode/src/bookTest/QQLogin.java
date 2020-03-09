/**
 * 陆大佬早啊
 */
package bookTest;

import javax.swing.*;

public class QQLogin {
	private JFrame jFrame = new JFrame("QQ登录");
	private JPanel jPanel = new JPanel();
	private JTextArea userName = new JTextArea();
	private JTextArea password = new JTextArea();
	private JButton login = new JButton("登录");

	public QQLogin(){
		//下面这一段是用来设置背景图片的，主要需要修改的地方是图片的地址，保险起见用绝对地址
		ImageIcon backGround = new ImageIcon("J:\\JavaProject\\Leetcode\\src\\bookTest\\qq.jpg");
		JLabel jLabel = new JLabel(backGround);
		jLabel.setBounds(0,0,backGround.getIconWidth(),backGround.getIconHeight());
		jFrame.getLayeredPane().add(jLabel,new Integer(Integer.MIN_VALUE));
		JPanel jp = (JPanel)jFrame.getContentPane();
		jp.setOpaque(false);
		jPanel.setOpaque(false);


		//设置组件的位置
		jPanel.setLayout(null);
		jPanel.setBounds(400,400,400,300);
		userName.setBounds(100,50,200,40);
		password.setBounds(100,100,200,40);
		login.setBounds(160,150,80,40);

		//添加组件
		jPanel.add(userName);
		jPanel.add(password);
		jPanel.add(login);
		jFrame.add(jPanel);

		jFrame.setBounds(100,100,400,300);
		jFrame.setVisible(true);
	}

	public static void main(String[] args){
		new QQLogin();
	}
}
