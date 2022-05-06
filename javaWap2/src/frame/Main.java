package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class Main extends JFrame {
private static JMenuBar mb;
private static JLabel lbl,imageLabel,imageLabel1,imageLabel2,imageLabel3;
private static JMenu menu,menuCategory,menuSearch,menuMyPage,menuCart;
private static JMenuItem menuItemLogIn,menuItemJoinUs,menuItemMyPage;
private ImageIcon logo,newitem1,newitem2,newitem3, left, right;
private JFrame jf;
private JPanel container;
private JButton leftbt, rightbt;



   public Main(String title, int width, int height) {
      jf = new JFrame();
      jf.setTitle(title);
      jf.setSize(width,height);
      jf.setLocationRelativeTo(this);
      jf.setLayout(new BorderLayout());
      jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jf.setVisible(true);
      

      
      
      JScrollPane scroll = new JScrollPane();
      scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
      scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
      

       container = new JPanel();
       container.setLayout(new FlowLayout());
       container.setBackground(Color.WHITE);
       
       
       logo = new ImageIcon("images/javacoco.png");
       imageLabel = new JLabel(logo);
       imageLabel.setHorizontalAlignment(JLabel.CENTER);
       //lbl = new JLabel("JAVA COCO");
       //lbl.setFont(new Font("Gramond", Font.BOLD, 100));
       //lbl.setHorizontalAlignment(JLabel.CENTER);
       
       
       makeMenu();
      
       container.add(imageLabel);
       container.add(mb);
       
       
       jf.add(container);
       jf.setPreferredSize(new Dimension(500,500));
       jf.setLocation(400, 200);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setVisible(true);
       jf.pack();
       jf.add(scroll, BorderLayout.EAST);
       
       
       //Container c = getContentPane();
       //c.setLayout(new GridLayout(1,3));
       newitem1 = new ImageIcon("images/pf1.jpg");
       imageLabel1 = new JLabel(newitem1);
       imageLabel1.setPreferredSize(new Dimension(800, 1000));
       newitem2 = new ImageIcon("images/pf2.jpg");
       imageLabel2 = new JLabel(newitem2);
       
       newitem3 = new ImageIcon("images/pf3.jpg");
       imageLabel3 = new JLabel(newitem3);
       
       
       ImageIcon leftimg = new ImageIcon("images/왼쪾.png");
       leftbt = new JButton(leftimg);
       leftbt.setContentAreaFilled(false);
       leftbt.setBorderPainted(false);
       leftbt.setFocusPainted(false);
       leftbt.setPreferredSize(new Dimension(500, 500));
      
       
       ImageIcon rightimg = new ImageIcon("images/오른쪾.png");
       rightbt = new JButton(rightimg);
       rightbt.setContentAreaFilled(false);
       rightbt.setBorderPainted(false);
       rightbt.setFocusPainted(false);
       rightbt.setPreferredSize(new Dimension(500, 500));
       
       container.setLayout(new FlowLayout());
       container.add(leftbt);
       container.add(imageLabel1);
       container.add(rightbt);
       container.add(imageLabel2);
       container.add(imageLabel3);
      
       
       }


   private Object imageSetSize(ImageIcon newitem12, int i, int j) {
	// TODO Auto-generated method stub
	return null;
}


private static void makeMenu() {
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
       
   }
   
   public static void main(String[] args) {
      Main mp = new Main("JavaCoco", 500 , 500);
   }

}