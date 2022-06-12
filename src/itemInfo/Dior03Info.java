package itemInfo;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

import frame.JoinFrame;
import frame.LoginFrame;
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
import item.NewItems;
import item.TomfordItems;
import item.WomenItems;
import item.YSLItems;


public class Dior03Info extends JFrame{
	

	public Dior03Info(String title, int width, int height) {
         setTitle(title);
         setSize(width, height);
//         setLocation(1800, 300);
         setLocationRelativeTo(null);
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         // 레이아웃
         setLayout(new BorderLayout());   
               
         setScrollPanel();
       
         
         setVisible(true);
    }
    
    private void setScrollPanel() {
    	JPanel panel = new JPanel();      
        panel.setPreferredSize(new Dimension(400, 1300));   
        panel.setBackground(Color.white);
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
          
         
          
         //상품정보---------------------------------------------------------------------------------

          
          ImageIcon itemImage = new ImageIcon("itemImages2/dior03.jpg");
          JLabel imageLabel = new JLabel(itemImage);
          
          
          JPanel jp = new JPanel();
          jp.setPreferredSize(new Dimension(2000, 500));
          jp.setBackground(Color.white);
          
          JPanel itemInfo = new JPanel();
          itemInfo.setPreferredSize(new Dimension(400, 400));   
          itemInfo.setBackground(Color.white);
          //itemInfo.setLayout(new FlowLayout());
          itemInfo.setLayout(null);
          
          Font f = new Font("굴림", Font.BOLD, 20);
	      JLabel name = new JLabel("[디올] 쟈도르 오 드 퍼퓸 인피니심");
	      JLabel price = new JLabel("158,000원");
	      SpinnerModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
	      JSpinner spinner = new JSpinner(numberModel);
	      
	      JPanel btn = new JPanel();
	      btn.setBackground(Color.white);
	      JButton buy = new JButton(new ImageIcon("images/buy.jpg"));
	      buy.setBorderPainted(false);
	      buy.setContentAreaFilled(false);
	      buy.setFocusPainted(false);
	      buy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 EventQueue.invokeLater(new Runnable() {
			         public void run() {
			            try {
			               payment window = new payment();
			               window.getFrame().setVisible(true);
			            } catch (Exception e) {
			               e.printStackTrace();
			            }
			         }
			      });
				
			}
		});
	      JButton cart = new JButton(new ImageIcon("images/cart.jpg"));
	      cart.setBorderPainted(false);
	      cart.setContentAreaFilled(false);
	      cart.setFocusPainted(false);
	      btn.add(buy);
	      btn.add(cart);
	      
	      name.setBounds(imageLabel.getX()-100, imageLabel.getY()+120, 500, 20);
	      price.setBounds(name.getX()+400, name.getY()+50, 100, 20);
	      spinner.setBounds(name.getX()+450, price.getY()+50, 50, 25);
	      btn.setBounds(name.getX()+108, spinner.getY()+50, 500, 100);
	      
	      JPanel imgPanel = new JPanel();
	      imgPanel.setLayout(new GridLayout(1,3,20,20));
	      imgPanel.setBackground(Color.white);
	      
	      JLabel ch01 = new JLabel(new ImageIcon("images/dior31.jpg"));
	      JLabel ch02 = new JLabel(new ImageIcon("images/dior32.jpg"));
	      JLabel ch03 = new JLabel(new ImageIcon("images/dior33.jpg"));
	      
	      
	      imgPanel.add(ch01);
	      imgPanel.add(ch02);
	      imgPanel.add(ch03);
	     
	      
	      
	     
	      
	      itemInfo.add(name);
	      itemInfo.add(price);
	      itemInfo.add(spinner);
	      itemInfo.add(btn);
	      name.setHorizontalAlignment(JLabel.RIGHT);
	      name.setFont(f);
	      price.setHorizontalAlignment(JLabel.RIGHT);
	      price.setFont(f);
	      
	      
	      jp.add(imageLabel);
	      jp.add(itemInfo);
	      
	      panel.add(container);
	      panel.add(jp);
	      panel.add(imgPanel);
	      
          setVisible(true);
        
        
    }

   
   

    public static void main(String[] args)
      {
         new Dior03Info("JavaCoCo", 1680, 1080);

      }

}