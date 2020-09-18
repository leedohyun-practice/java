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
			JLabel label = new JLabel("학번: ");
			JLabel pswrd = new JLabel("비밀번호: ");
			JTextField txtID = new JTextField(8);
			JPasswordField txtPass = new JPasswordField(8);
			JButton logBtn = new JButton("로그인");
		
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
						JOptionPane.showMessageDialog(null,"인증 실패! 재입력 하세요.");
					}
				}
				
			});
			
			
			 JFrame frame = new JFrame();
		     frame.setTitle("컴퓨터 자동,예약종료 프로그램");
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
