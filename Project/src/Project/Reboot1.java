package Project;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import java.io.IOException;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Reboot1 extends JFrame{
	public Reboot1() {
		
     	
     JPanel startPanel = new JPanel();
     
     	startPanel.setLayout(null);
     
     	JButton btn1 = new JButton("바로 종료");
     	JButton btn2 = new JButton("예약 종료");
     	JButton btn3 = new JButton("프로그램 종료");
  
     	JLabel label1 = new JLabel("인증이 완료되었습니다.");
     	label1.setLocation(155,10);
     	label1.setSize(300,20);
     	

     	JLabel label2 = new JLabel("원하시는 버튼은 클릭해주세요.");
     	label2.setLocation(135,40);
     	label2.setSize(300,20);
     	
     	
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
             new Rebooting();
         }
      });	
     	
     
     btn2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             new reservation();
         }
      });
     
     
     btn3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             System.exit(0);
         }
      });
     
     
     startPanel.add(label1);
     startPanel.add(label2);
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
		
		new Reboot1();
	}
}

		
		
	
