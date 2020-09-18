package Project;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class reservation extends JFrame {

   public reservation(){
	   
      JPanel panel = new JPanel();
      
      panel.setLayout(null);
      
      
  		JLabel label1 = new JLabel("원하는 시간을 클릭해주세요.");
  		label1.setLocation(140,10);
  		label1.setSize(300,20);
  		
  		JLabel label2 = new JLabel("선택한 시간 후에 자동종료 됩니다.");
  		label2.setLocation(125,40);
  		label2.setSize(300,20);
      
      
      
       JButton Btn1 = new JButton("10분후 종료");
	   JButton Btn2 = new JButton("20분후 종료");
	   JButton Btn3 = new JButton("30분후 종료");
	   JButton Btn4 = new JButton("40분후 종료");
	   JButton Btn5 = new JButton("50분후 종료");
	   JButton Btn6 = new JButton("1시간후 종료");
	   
	    Btn1.setBounds(20, 165, 122, 30);
    	Btn2.setBounds(160, 165, 122, 30);
    	Btn3.setBounds(300, 165, 122, 30);
    	Btn4.setBounds(20, 200, 122, 30);
    	Btn5.setBounds(160, 200, 122, 30);
    	Btn6.setBounds(300, 200, 122, 30);
    
    	Btn1.setBackground(Color.white);
    	Btn2.setBackground(Color.white);
    	Btn3.setBackground(Color.white);
    	Btn4.setBackground(Color.white);
    	Btn5.setBackground(Color.white);
    	Btn6.setBackground(Color.white);
	   
	   
    	panel.setBackground(Color.white);
     
    	panel.add(label1);
    	panel.add(label2);
    	
      panel.add(Btn1);
      panel.add(Btn2);
      panel.add(Btn3);
      panel.add(Btn4);
      panel.add(Btn5);
      panel.add(Btn6);
      
      
      Btn1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
              Runtime runtime = Runtime.getRuntime();
              try {
               Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
               OutputStream os = process.getOutputStream();
               os.write("shutdown -s -f -t 600 \n\r".getBytes());
               os.close();
               process.waitFor();
              } catch (IOException e1) {
               e1.printStackTrace();
              } catch (InterruptedException e1) {
               e1.printStackTrace();
            }
         }
      });
      
      Btn2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               Runtime runtime = Runtime.getRuntime();
               try {
                Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
                OutputStream os = process.getOutputStream();
                os.write("shutdown -s -f -t 1200 \n\r".getBytes());
                os.close();
                process.waitFor();
               } catch (IOException e1) {
                e1.printStackTrace();
               } catch (InterruptedException e1) {
                e1.printStackTrace();
             }
          }
       });
      
      Btn3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               Runtime runtime = Runtime.getRuntime();
               try {
                Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
                OutputStream os = process.getOutputStream();
                os.write("shutdown -s -f -t 1800 \n\r".getBytes());
                os.close();
                process.waitFor();
               } catch (IOException e1) {
                e1.printStackTrace();
               } catch (InterruptedException e1) {
                e1.printStackTrace();
             }
          }
       });
      
      Btn4.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               Runtime runtime = Runtime.getRuntime();
               try {
                Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
                OutputStream os = process.getOutputStream();
                os.write("shutdown -s -f -t 2400 \n\r".getBytes());
                os.close();
                process.waitFor();
               } catch (IOException e1) {
                e1.printStackTrace();
               } catch (InterruptedException e1) {
                e1.printStackTrace();
             }
          }
       });
      
      Btn5.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               Runtime runtime = Runtime.getRuntime();
               try {
                Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
                OutputStream os = process.getOutputStream();
                os.write("shutdown -s -f -t 3000 \n\r".getBytes());
                os.close();
                process.waitFor();
               } catch (IOException e1) {
                e1.printStackTrace();
               } catch (InterruptedException e1) {
                e1.printStackTrace();
             }
          }
       });
      
      Btn6.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
               Runtime runtime = Runtime.getRuntime();
               try {
                Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
                OutputStream os = process.getOutputStream();
                os.write("shutdown -s -f -t 3600 \n\r".getBytes());
                os.close();
                process.waitFor();
               } catch (IOException e1) {
                e1.printStackTrace();
               } catch (InterruptedException e1) {
                e1.printStackTrace();
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
	
   frame.add(panel);
   }


public static void main(String[] args) {
   new reservation();
   }
}