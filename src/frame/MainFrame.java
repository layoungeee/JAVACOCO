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

import item.NewItems;
import item.BestItems;
import item.CKItems;
import item.ChanelItems;
import item.DiorItems;
import item.DiptyqueItems;
import item.FormentItems;
import item.GucciItems;
import item.JVItems;
import item.LanvinItems;
import item.MenItems;
import item.MontblancItems;
import item.TomfordItems;
import item.WomenItems;
import item.YSLItems;

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
         menuItemNEW.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new NewItems("JavaCoCo", 1000, 500);
				
			}
		});
         menuItemNEW.setFont(font2);
         menuCategory.add(menuItemNEW);
         JMenuItem menuItemBEST = new JMenuItem("BEST");
         menuItemBEST.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				new BestItems("JavaCoCo", 1000, 500);
 				
 			}
 		});
         menuItemBEST.setFont(font2);
         menuCategory.add(menuItemBEST);
         JMenuItem menuItemMEN = new JMenuItem("MEN");
         menuItemMEN.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				new MenItems("JavaCoCo", 1000, 500);
 				
 			}
 		});
         menuItemMEN.setFont(font2);
         menuCategory.add(menuItemMEN);
         JMenuItem menuItemWOMEN = new JMenuItem("WOMEN");
         menuItemWOMEN.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				new WomenItems("JavaCoCo", 1000, 500);
 				
 			}
 		});
         menuItemWOMEN.setFont(font2);
         menuCategory.add(menuItemWOMEN);
         
         JMenu menu = new JMenu("BRAND");
         menu.setFont(font2);
         
         JMenuItem menuItemBvlgari = new JMenuItem("Bvlgari");
         menuItemBvlgari.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new NewItems("JavaCoCo", 1000, 500);
			}
		});
         menuItemBvlgari.setFont(font2);
         menuCategory.add(menuItemBvlgari);
         JMenuItem menuItemChanel = new JMenuItem("Chanel");
         menuItemChanel.addActionListener(new ActionListener() {
 			
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				new ChanelItems("JavaCoCo", 1000, 500);
 			}
 		});
         menuItemChanel.setFont(font2);
         menuCategory.add(menuItemChanel);
         JMenuItem menuItemCK = new JMenuItem("Calvin Klein");
         menuItemCK.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new CKItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemCK.setFont(font2);
         menuCategory.add(menuItemCK);
         JMenuItem menuItemDior = new JMenuItem("Dior");
         menuItemDior.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new DiorItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemDior.setFont(font2);
         menuCategory.add(menuItemDior);
         JMenuItem menuItemDiptyque = new JMenuItem("Diptyque");
         menuItemDiptyque.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new DiptyqueItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemDiptyque.setFont(font2);
         menuCategory.add(menuItemDiptyque);
         JMenuItem menuItemForment = new JMenuItem("Forment");
         menuItemForment.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new FormentItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemForment.setFont(font2);
         menuCategory.add(menuItemForment);
         JMenuItem menuItemGucci = new JMenuItem("Gucci");
         menuItemGucci.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new GucciItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemGucci.setFont(font2);
         menuCategory.add(menuItemGucci);
         JMenuItem menuItemJV = new JMenuItem("John Varvatos");
         menuItemJV.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new JVItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemJV.setFont(font2);
         menuCategory.add(menuItemJV);
         JMenuItem menuItemLanvin = new JMenuItem("Lanvin");
         menuItemLanvin.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new LanvinItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemLanvin.setFont(font2);
         menuCategory.add(menuItemLanvin);
         JMenuItem menuItemMontblanc = new JMenuItem("Montblanc");
         menuItemMontblanc.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new MontblancItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemMontblanc.setFont(font2);
         menuCategory.add(menuItemMontblanc);
         JMenuItem menuItemTomford = new JMenuItem("Tomford");
         menuItemTomford.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new TomfordItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemTomford.setFont(font2);
         menuCategory.add(menuItemTomford);
         JMenuItem menuItemYSL = new JMenuItem("Yves Saint Laurant");
         menuItemYSL.addActionListener(new ActionListener() {
  			
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				new YSLItems("JavaCoCo", 1000, 500);
  			}
  		});
         menuItemYSL.setFont(font2);
         menuCategory.add(menuItemYSL);
       
         menuCategory.setFont(font);
         
         menuCategory.add(menu);
         menu.add(menuItemBvlgari);
         menu.add(menuItemChanel);
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