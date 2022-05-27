package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class LoginFrame extends JFrame{
    public LoginFrame(String title, int width, int height) {
         setTitle(title);
         setSize(width, height);
//         setLocation(1800, 300);
         setLocationRelativeTo(null);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         // 레이아웃
         setLayout(new BorderLayout());   
               
         setScrollPanel();
         
         
         
         setVisible(true);
    }
    
    private void setScrollPanel() {
       JPanel panel = new JPanel();      
        panel.setPreferredSize(new Dimension(400, 800));   
        panel.setBackground(Color.WHITE);
        panel.setLayout(new FlowLayout());
        
        JScrollPane sp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
         
        add(sp);
        
       
       
       JPanel container = new JPanel();
       container.setLayout(new BorderLayout());
        container.setBackground(Color.WHITE);
       
       ImageIcon logo = new ImageIcon("images/javacoco.png");
        JLabel logoLabel = new JLabel(logo);
         logoLabel.setHorizontalAlignment(JLabel.CENTER);
         //lbl = new JLabel("JAVA COCO");
         //lbl.setFont(new Font("Gramond", Font.BOLD, 100));
         //lbl.setHorizontalAlignment(JLabel.CENTER);
         
         JMenuBar mb = new JMenuBar();
         mb.setLayout(new FlowLayout(FlowLayout.CENTER, 270, 20));
         mb.setBackground(Color.WHITE);

         Font font = new Font("HY견명조", Font.BOLD, 25);
         Font font2 = new Font("HY견명조", Font.PLAIN, 18);
         JMenu menuCategory = new JMenu("category");
         JMenuItem menuItemNEW = new JMenuItem("NEW");
         menuItemNEW.setFont(font2);
         menuCategory.add(menuItemNEW);
         JMenuItem menuItemBEST = new JMenuItem("BEST");
         menuItemBEST.setFont(font2);
         menuCategory.add(menuItemBEST);
         JMenuItem menuItemMEN = new JMenuItem("MEN");
         menuItemMEN.setFont(font2);
         menuCategory.add(menuItemMEN);
         JMenuItem menuItemWOMEN = new JMenuItem("WOMEN");
         menuItemWOMEN.setFont(font2);
         menuCategory.add(menuItemWOMEN);
         
         menuCategory.setFont(font);
        
            
         JMenu menuSearch = new JMenu("search");
         menuSearch.setFont(font);
            
         JMenu menuMyPage = new JMenu("MyPage");
         menuMyPage.setFont(font);
         JMenuItem menuItemLogIn = new JMenuItem("Log In");
         menuItemLogIn.setFont(font2);
         menuMyPage.add(menuItemLogIn);
         JMenuItem menuItemJoinUs = new JMenuItem("Join Us");
         menuItemJoinUs.setFont(font2);
         menuMyPage.add(menuItemJoinUs);
         JMenuItem menuItemMyPage = new JMenuItem("My Page");
         menuItemMyPage.setFont(font2);
         menuMyPage.add(menuItemMyPage);
            
         JMenu menuCart = new JMenu("cart");
         menuCart.setFont(font);

          mb.add(menuCategory);
          mb.add(menuSearch);
          mb.add(menuMyPage);
          mb.add(menuCart);
          
          container.add(logoLabel, BorderLayout.NORTH);
          container.add(mb, BorderLayout.CENTER);
          
          JPanel p = new JPanel();
          p.setLayout(new GridLayout(0,2,50, 30));
          p.setBackground(Color.WHITE);
          JLabel id = new JLabel("  아이디  ");
          TextField t1 = new TextField(20);
          JLabel pw = new JLabel("  비밀번호  ");
          TextField t2 = new TextField(20);
      
      
          p.add(id);
          p.add(t1);
          p.add(pw);
          p.add(t2);
     
     
      
      
      t2.setEchoChar('*');
      JButton ok = new JButton("로그인");
      JButton no = new JButton("취소");
      p.add(ok);
      p.add(no);
      
      JPanel J = new JPanel();
      J.setBackground(Color.WHITE);
      Font f = new Font("HY견명조", Font.PLAIN, 50);
      JLabel Login = new JLabel("                                                Login                                             ");
      Login.setFont(f); 
      J.add(Login);
      
      
      panel.add(container);
      panel.add(J);
      panel.add(p);
      
      
      

   }
    public static void main(String[] args)
    {
       new LoginFrame("JavaCoCo", 500, 500);

    }

}
