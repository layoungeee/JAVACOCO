package frame;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class ManagerFrame extends JFrame{
    public ManagerFrame() {
         setTitle("관리자 로그인");
         setSize(500, 400);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setResizable(false);
         
         
         
         
         JPanel p = new JPanel();         
         p.setBackground(Color.WHITE);
     	p.setLayout(null);
     	Font font3 = new Font("함초롬돋움", Font.BOLD, 30);
     	Font font4 = new Font("함초롬돋움", Font.PLAIN, 15);
     	JLabel nl = new JLabel("JAVA COCO 관리자 로그인");
     	nl.setBounds(50, 50, 400, 100);
        
        nl.setFont(font3);
        nl.setHorizontalAlignment(JLabel.CENTER);
        p.add(nl);
     	JLabel id = new JLabel("아이디", JLabel.LEFT);
     	id.setFont(font4);
     	id.setBounds(100, 180, 60, 25);
         p.add(id);
         TextField t1 = new TextField(25);
         t1.setBounds(200, 180, 200, 25);
         
         p.add(t1);
         JLabel pw = new JLabel("비밀번호", JLabel.LEFT);
         pw.setFont(font4);
         pw.setBounds(100, 220, 60, 25);
         p.add(pw);
         TextField t2 = new TextField(25);
         t2.setBounds(200, 220, 200, 25);
         t2.setEchoChar('*');
         p.add(t2);
         
         
         
         JButton login = new JButton("관리자 로그인");
         login.setFont(font4);
         login.setBorderPainted(true);
         login.setContentAreaFilled(false);
         login.setFocusPainted(false);
         login.setBounds(100, 260, 300, 30);
         login.addActionListener(new ActionListener() {

       		@Override
       		public void actionPerformed(ActionEvent e) {
       		//아이디 비번 확인 테스트 코드~

       			String idt = t1.getText().trim();
       			String pwt = t2.getText().trim();

       			if(idt.length()==0 || pwt.length()==0) {
       			JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력 하셔야 됩니다.", "아이디나 비번을 입력!", JOptionPane.DEFAULT_OPTION);
       			return;
       			}
       			if(idt.equals("manager") && pwt.equals("manager2022")) {
       			JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
       			new MainFrame("JavaCoCo", 1000, 500);
       			dispose();
       			}
       			else {
       			JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
       			}
       		}
       		
           	  
             });
         p.add(login);
         
         add(p);
         setVisible(true);
    }
   
}
