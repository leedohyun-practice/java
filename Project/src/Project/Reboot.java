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
     	
     	JButton btn1 = new JButton("�ٷ� ����");
     	JButton btn2 = new JButton("���� ����");
     	JButton btn3 = new JButton("���α׷� ����");

     	JLabel label = new JLabel("���������� �ؾ� ���α׷� ����� �����մϴ�.");
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
  		frame.setTitle("��ǻ�� �ڵ�,�������� ���α׷�");
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
 


	 