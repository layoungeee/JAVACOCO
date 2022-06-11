package frame;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;


public class ManagerFrame extends JFrame{
    public ManagerFrame() {
         setTitle("관리자 로그인");
         setSize(500, 500);
         setLocationRelativeTo(null);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
         
         
     
         
       
         
         
         JPanel p = new JPanel();
     
         
         p.setBackground(Color.WHITE);
     	p.setLayout(null);
     	JLabel id = new JLabel("아이디", JLabel.LEFT);
     	id.setBounds(100, 180, 60, 20);
         p.add(id);
         TextField t1 = new TextField(30);
         t1.setBounds(200, 180, 200, 20);
         p.add(t1);
         JLabel pw = new JLabel("비밀번호", JLabel.LEFT);
         pw.setBounds(100, 220, 60, 20);
         p.add(pw);
         TextField t2 = new TextField(30);
         t2.setBounds(200, 220, 200, 20);
         t2.setEchoChar('*');
         p.add(t2);
         
         
         
         JButton login = new JButton("관리자 로그인");
         login.setBorderPainted(true);
         login.setContentAreaFilled(false);
         login.setFocusPainted(false);
         login.setBounds(100, 260, 300, 30);
         p.add(login);
         
        
         add(p);
         setVisible(true);
    }
   











public static void main(String[] args) {

new ManagerFrame();

}

}