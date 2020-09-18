package Project;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reboot extends JFrame{
	public Reboot() {
   
     
     JPanel startPanel = new JPanel();
     
     	
     	startPanel.setLayout(null);
     	
     	JButton btn1 = new JButton("바로 종료");
     	JButton btn2 = new JButton("예약 종료");
     	JButton btn3 = new JButton("프로그램 종료");

     	JLabel label = new JLabel("본인인증을 해야 프로그램 사용이 가능합니다.");
     	label.setLocation(95,10);
     	label.setSize(300,20);
     
     	btn1.setBounds(20, 200, 122, 30);
     	btn2.setBounds(160, 200, 122, 30);
     	btn3.setBounds(300, 200, 122, 30);
     
     	btn1.setBackground(Color.white);
     	btn2.setBackground(Color.white);
     	btn3.setBackground(Color.white);
     
     	startPanel.setBackground(Color.white);
     
     btn1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             new Login();
         }
      });
     	
     
     btn2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             new Login();
         }
      });
     
     
     btn3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             new Login();
         }
      });
     
     
     startPanel.add(label);
     startPanel.add(btn1);
     startPanel.add(btn2);
     startPanel.add(btn3);

     JFrame frame = new JFrame();
  		frame.setTitle("컴퓨터 자동,예약종료 프로그램");
  		frame.setVisible(true);
  		frame.setResizable(false);
  		frame.setSize(450,300);
  		frame.setLocationRelativeTo(null);
  		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	
     frame.add(startPanel);
     
	}
		
	public static void main (String [] args) {
		new Reboot();
	}
}
 


	 