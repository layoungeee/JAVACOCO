package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame{
    public MainFrame(String title, int width, int height) {
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
        panel.setPreferredSize(new Dimension(400, 1100));   
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
         
         JMenu menu = new JMenu("BRAND");
         menu.setFont(font2);
         
         JMenuItem menuItemBvlgari = new JMenuItem("Bvlgari");
         menuItemBvlgari.setFont(font2);
         menuCategory.add(menuItemBvlgari);
         JMenuItem menuItemchanel = new JMenuItem("Chanel");
         menuItemchanel.setFont(font2);
         menuCategory.add(menuItemchanel);
         JMenuItem menuItemCK = new JMenuItem("Calvin Klein");
         menuItemCK.setFont(font2);
         menuCategory.add(menuItemCK);
         JMenuItem menuItemDior = new JMenuItem("Dior");
         menuItemDior.setFont(font2);
         menuCategory.add(menuItemDior);
         JMenuItem menuItemDiptyque = new JMenuItem("Diptyque");
         menuItemDiptyque.setFont(font2);
         menuCategory.add(menuItemDiptyque);
         JMenuItem menuItemForment = new JMenuItem("Forment");
         menuItemForment.setFont(font2);
         menuCategory.add(menuItemForment);
         JMenuItem menuItemGucci = new JMenuItem("Gucci");
         menuItemGucci.setFont(font2);
         menuCategory.add(menuItemGucci);
         JMenuItem menuItemJV = new JMenuItem("John Varvatos");
         menuItemJV.setFont(font2);
         menuCategory.add(menuItemJV);
         JMenuItem menuItemLanvin = new JMenuItem("Lanvin");
         menuItemLanvin.setFont(font2);
         menuCategory.add(menuItemLanvin);
         JMenuItem menuItemMontblanc = new JMenuItem("Montblanc");
         menuItemMontblanc.setFont(font2);
         menuCategory.add(menuItemMontblanc);
         JMenuItem menuItemTomford = new JMenuItem("Tomford");
         menuItemTomford.setFont(font2);
         menuCategory.add(menuItemTomford);
         JMenuItem menuItemYSL = new JMenuItem("Yves Saint Laurant");
         menuItemYSL.setFont(font2);
         menuCategory.add(menuItemYSL);
       
         menuCategory.setFont(font);
         
         menuCategory.add(menu);
         menu.add(menuItemBvlgari);
         menu.add(menuItemchanel);
         menu.add(menuItemCK);
         menu.add(menuItemDior);
         menu.add(menuItemDiptyque);
         menu.add(menuItemForment);
         menu.add(menuItemGucci);
         menu.add(menuItemJV);
         menu.add(menuItemLanvin);
         menu.add(menuItemMontblanc);
         menu.add(menuItemTomford);
         menu.add(menuItemYSL);
        
            
         JMenu menuSearch = new JMenu("search");
         menuSearch.setFont(font);
            
         JMenu menuMyPage = new JMenu("MyPage");
         menuMyPage.setFont(font);
         JMenuItem menuItemLogIn = new JMenuItem("Log In");
         menuItemLogIn.addActionListener(new ActionListener() {

  			@Override
  			public void actionPerformed(ActionEvent e) {
  			
  				new LoginFrame("JavaCoCo", 1680, 1080);
  				
  			}
          	  
            });
         menuItemLogIn.setFont(font2);
         menuMyPage.add(menuItemLogIn);
         JMenuItem menuItemJoinUs = new JMenuItem("Join Us");
         
         menuItemJoinUs.addActionListener(new ActionListener() {

 			@Override
 			public void actionPerformed(ActionEvent e) {
 				
 				new JoinFrame("JavaCoCo", 1680, 1080);
 				
 			}
         	  
           });
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
          
         
         
          
          
          
          
          
          
         JPanel newPanel = new JPanel();
         newPanel.setLayout(new BorderLayout());
         newPanel.setBackground(Color.white);
         newPanel.setPreferredSize(new Dimension(1000, 350));
         newPanel.setLocation(500, 300);
         newPanel.setVisible(true);
          
         Font font3 = new Font("HY견명조", Font.PLAIN, 20);
         JLabel newItemText = new JLabel("NEW ITEM");
         
        
         newItemText.setFont(font3);
         newItemText.setLayout(new BorderLayout());
         newItemText.setHorizontalAlignment(JLabel.CENTER);


            
         ImageIcon newitem1 = new ImageIcon("images/pf01.jpg");
          JLabel imageLabel1 = new JLabel(newitem1);
          imageLabel1.setPreferredSize(new Dimension(250,250));
             
          ImageIcon newitem2 = new ImageIcon("images/pf02.jpg");
          JLabel imageLabel2 = new JLabel(newitem2);
          imageLabel2.setPreferredSize(new Dimension(250,250));
             
          ImageIcon newitem3 = new ImageIcon("images/pf03.jpg");
          JLabel imageLabel3 = new JLabel(newitem3);
          imageLabel3.setPreferredSize(new Dimension(250,250));
             
          newPanel.add(newItemText,BorderLayout.NORTH);
          newPanel.add(imageLabel1,BorderLayout.WEST);
          newPanel.add(imageLabel2,BorderLayout.CENTER);
          newPanel.add(imageLabel3,BorderLayout.EAST);
           
           
           
           
           
           
           
          
          
           JPanel newPanel2 = new JPanel();
           newPanel2.setLayout(new BorderLayout());
           newPanel2.setBackground(Color.white);
           newPanel2.setPreferredSize(new Dimension(1000, 350));
           newPanel2.setLocation(500, 700);
           newPanel2.setVisible(true);
                
           JLabel rcmdItemText = new JLabel("BEST ITEM");
           rcmdItemText.setFont(font3);
           rcmdItemText.setLayout(new BorderLayout());
           rcmdItemText.setHorizontalAlignment(JLabel.CENTER);
            
           ImageIcon rcmdItem = new ImageIcon("images/향수추천.PNG");
           JLabel imageLabel01 = new JLabel(rcmdItem);
           imageLabel01.setPreferredSize(new Dimension(200,200));
                  
           newPanel2.add(rcmdItemText,BorderLayout.NORTH);
           newPanel2.add(imageLabel01,BorderLayout.CENTER);
          
          
          
           panel.add(container);
           panel.add(newPanel);
           panel.add(newPanel2);
       
       
        setVisible(true);
        
        
    }

   
   

    public static void main(String[] args)
      {
         new MainFrame("JavaCoCo", 1680, 1080);

      }

}