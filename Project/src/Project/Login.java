package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame{
	
	public Login() {
		
		
	     
	     JPanel logPanel = new JPanel();
			JLabel label = new JLabel("�й�: ");
			JLabel pswrd = new JLabel("��й�ȣ: ");
			JTextField txtID = new JTextField(8);
			JPasswordField txtPass = new JPasswordField(8);
			JButton logBtn = new JButton("�α���");
		
			logPanel.add(label);
			logPanel.add(txtID);
			logPanel.add(pswrd);
			logPanel.add(txtPass);
			logPanel.add(logBtn);
			
			logPanel.setBackground(Color.white);
			
			logBtn.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					String id = "2016212044";
					String pass = "1234";
					
					if(id.equals(txtID.getText())&&pass.equals(txtPass.getText())) {
						new Reboot1();
					}
				             
						
					else {
						JOptionPane.showMessageDialog(null,"���� ����! ���Է� �ϼ���.");
					}
				}
				
			});
			
			
			 JFrame frame = new JFrame();
		     frame.setTitle("��ǻ�� �ڵ�,�������� ���α׷�");
		     frame.setVisible(true);
		     frame.setResizable(false);
		     frame.setSize(450,300);
		     frame.setLocationRelativeTo(null);
		     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     
		     
			 frame.add(logPanel);
	}
	public static void main(String []args) {
		new Login();
	}
}
