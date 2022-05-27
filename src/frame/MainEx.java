package frame;

import java.awt.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MainEx extends JFrame {
   private static JMenuBar mb;
   private static JLabel imageLabel;
   private static JMenu menu,menuCategory,menuSearch,menuMyPage,menuCart;
   private static JMenuItem menuItemLogIn,menuItemJoinUs,menuItemMyPage;

   public MainEx(String title, int width, int height) {
      JFrame jf = new JFrame();
      
      jf.setTitle(title);
      jf.setSize(width,height);
      jf.setLocationRelativeTo(this);
      jf.setLayout(new BorderLayout());
      jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jf.setVisible(true);

       JPanel container = new JPanel();
       container.setLayout(new BorderLayout());
        container.setBackground(Color.WHITE);

       ImageIcon img = new ImageIcon("images/javacoco.png");
       imageLabel = new JLabel(img);
          
       makeMenu();

       container.add(imageLabel,BorderLayout.NORTH);
       mb.setBounds(500, 500, 100, 20);
       container.add(mb);
       

       jf.add(container);
       jf.setPreferredSize(new Dimension(800,500));
       jf.setLocation(400, 200);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
       jf.pack();
       
       }


   private static void makeMenu() {
      mb = new JMenuBar();
          
       menuCategory = new JMenu("category");
          
       menuSearch = new JMenu("search");
          
       menuMyPage = new JMenu("MyPage");
       menuItemLogIn = new JMenuItem("Log In");
       menuMyPage.add(menuItemLogIn);
       menuItemJoinUs = new JMenuItem("Join Us");
       menuMyPage.add(menuItemJoinUs);
       menuItemMyPage = new JMenuItem("My Page");
       menuMyPage.add(menuItemMyPage);
          
       menuCart = new JMenu("cart");

       mb.add(menuCategory);
       mb.add(menuSearch);
       mb.add(menuMyPage);
       mb.add(menuCart);

       
   }
   
   public static void main(String[] args) {
      MainEx mp = new MainEx("JavaCoco",500,500);
   }

}
