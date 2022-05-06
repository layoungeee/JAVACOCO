package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Main extends JFrame {
private static JMenuBar mb;
private static JLabel lbl,logoLabel,imageLabel1,imageLabel2,imageLabel3;
private static JMenu menu,menuCategory,menuSearch,menuMyPage,menuCart;
private static JMenuItem menuItemLogIn,menuItemJoinUs,menuItemMyPage;
private static ImageIcon logo,newitem1,newitem2,newitem3;
private static JFrame jf;
private static JPanel container;

   public Main(String title, int width, int height) {
      jf = new JFrame();
      jf.setTitle(title);
      jf.setSize(width,height);
      jf.setLocationRelativeTo(this);
      jf.setLayout(new BorderLayout());
      jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jf.setVisible(true);
      
       container = new JPanel();
       container.setLayout(new FlowLayout());
       container.setBackground(Color.WHITE);
       
       //JScrollPane sp = new JScrollPane(container,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
		//		JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       //jf.add(sp);
       JScrollBar scroll = new JScrollBar();
       
       
       makeMenu();
       
       jf.add(scroll,BorderLayout.EAST);
       jf.add(container);
       jf.setPreferredSize(new Dimension(800,500));
       jf.setLocation(400, 200);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
       jf.pack();
       
       
       //Container c = getContentPane();
       //c.setLayout(new GridLayout(1,3));
       
       newItem();
       
       }
   

   private void newItem() {
	   newitem1 = new ImageIcon("images/pf1.jpg");
       imageLabel1 = new JLabel(newitem1);
       imageLabel1.setPreferredSize(new Dimension(100,100));
       newitem2 = new ImageIcon("images/pf2.jpg");
       imageLabel2 = new JLabel(newitem2);
       imageLabel2.setPreferredSize(new Dimension(100,100));
       newitem3 = new ImageIcon("images/pf3.jpg");
       imageLabel3 = new JLabel(newitem3);
       imageLabel3.setPreferredSize(new Dimension(100,100));
       
       container.add(imageLabel1);
       container.add(imageLabel2);
       container.add(imageLabel3);
}


   private static void makeMenu() {
	  logo = new ImageIcon("images/javacoco.png");
      logoLabel = new JLabel(logo);
      logoLabel.setHorizontalAlignment(JLabel.CENTER);
      //lbl = new JLabel("JAVA COCO");
      //lbl.setFont(new Font("Gramond", Font.BOLD, 100));
      //lbl.setHorizontalAlignment(JLabel.CENTER);
      
      mb = new JMenuBar();
      mb.setLayout(new FlowLayout(FlowLayout.CENTER, 265, 20));
      mb.setBackground(Color.WHITE);
      
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
       
       container.add(logoLabel);
       container.add(mb);
   }
   
   public static void main(String[] args) {
      Main mp = new Main("JavaCoco",500,500);
   }

}

class JPanel011 extends JPanel{
	
}