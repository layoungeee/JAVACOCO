package frame;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Main extends JFrame {
   private static JMenuBar mb;
   private static JLabel lbl;
   private static JMenu menu,menuCategory,menuSearch,menuMyPage,menuCart;
   private static JMenuItem menuItemLogIn,menuItemJoinUs,menuItemMyPage;

   public Main(String title, int width, int height) {
      JFrame jf = new JFrame();
      
      jf.setTitle(title);
      jf.setSize(width,height);
      jf.setLocationRelativeTo(this);
      jf.setLayout(new BorderLayout());
      jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
      jf.setVisible(true);

       JPanel container = new JPanel();
       container.setLayout(new FlowLayout());
       container.setBackground(Color.WHITE);
       
       
       lbl = new JLabel("JAVA COCO");
       lbl.setFont(new Font("Gramond", Font.BOLD, 100));
       lbl.setHorizontalAlignment(JLabel.CENTER);
       
       
       makeMenu();

       container.add(lbl);
     
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
      Main mp = new Main("JavaCoco",500,500);
   }

}
