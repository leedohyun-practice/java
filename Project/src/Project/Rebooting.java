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


public class Rebooting extends JFrame {

   public Rebooting(){

      JButton bootBtn = new JButton("바로종료");
      JPanel panel = new JPanel();
      
   		panel.setLayout(null);
   		
   		JLabel label = new JLabel("사용종료 버튼을 누르면 강제종료 됩니다.");
     	label.setLocation(115,10);
     	label.setSize(300,20);
   		
   		bootBtn.setBounds(160, 200, 122, 30);
   	
   		
   		panel.add(label);
        panel.add(bootBtn);
      
        bootBtn.setBackground(Color.white);
     	panel.setBackground(Color.white);
        
        
        
      bootBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
              Runtime runtime = Runtime.getRuntime();
              try {
               Process process = runtime.exec("C:\\WINDOWS\\system32\\cmd.exe");
               OutputStream os = process.getOutputStream();
               os.write("shutdown -s -f -t 0 \n\r".getBytes());
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
   new Rebooting();
   }
}
