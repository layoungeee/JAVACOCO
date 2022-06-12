package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


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
import frame.LoginFrame;


public class JoinFrame extends JFrame{
    public JoinFrame(String title, int width, int height) {
         setTitle(title);
         setSize(width, height);

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
        
            
         JMenuItem menuSearch = new JMenuItem("search");
         menuSearch.setFont(font);
         menuSearch.setBackground(Color.WHITE);
         menuSearch.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new SearchFrame("JavaCoCo", 1680, 1080);
				
			}
        	 
         });
         
            
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
          
          
          
         
          
          JPanel p = new JPanel();
          Font font3 = new Font("함초롬돋움", Font.BOLD, 15);
          p.setLayout(new GridLayout(0,2,20, 30));
	      p.setBackground(Color.WHITE);
	      JLabel name = new JLabel("이름");
	      name.setFont(font3);
	      TextField t1 = new TextField(30);
	      t1.setFont(font3);
	      JLabel id = new JLabel("아이디");
	      id.setFont(font3);
	      TextField t2 = new TextField(30);
	      t2.setFont(font3);
	      JLabel pw = new JLabel("패스워드");
	      pw.setFont(font3);
	      TextField t3 = new TextField(30);
	      t3.setFont(font3);
	      JLabel ad = new JLabel("주소");
	      ad.setFont(font3);
	      TextField t4 = new TextField(30);
	      t4.setFont(font3);
	      JLabel phone = new JLabel("전화번호");
	      phone.setFont(font3);
	      TextField t5 = new TextField(30);
	      t5.setFont(font3);
	      
	      p.add(name);
	      p.add(t1);
	      p.add(id);
	      p.add(t2);
	      p.add(pw);
	      p.add(t3);
	      p.add(phone);
	      p.add(t4);
	      p.add(ad);
	      p.add(t5);
     
      
      
	      t3.setEchoChar('*');
	      JButton ok = new JButton("가입");
	      ok.setFont(font3);
	      ok.setBorderPainted(true);
	      ok.setContentAreaFilled(false);
	      ok.setFocusPainted(false);
	      JButton no = new JButton("취소");
	      no.setFont(font3);
	      no.setBorderPainted(true);
	      no.setContentAreaFilled(false);
	      no.setFocusPainted(false);
	      p.add(ok);
	      p.add(no);
	      
	      JPanel J = new JPanel();
	      J.setBackground(Color.WHITE);
	      Font f = new Font("HY견명조", Font.PLAIN, 50);
	      J.setPreferredSize(new Dimension(1100, 120));
	      JLabel Join = new JLabel("Join");
	      
	      Join.setFont(f); 
	      J.add(Join);
	      
	      panel.add(container);
	      panel.add(J);
	      panel.add(p);
	      
	      ok.addActionListener(new ActionListener() {
	
	  		@Override
	  		public void actionPerformed(ActionEvent e) {
	  			String id = t1.getText();
	  			String pw = t2.getText();
	  			
	  			JOptionPane.showMessageDialog(null, "회원가입 완료");
	  			
	  		}
	      	  
	        });
	        no.addActionListener(new ActionListener() {
	
	  		@Override
	  		public void actionPerformed(ActionEvent e) {
	  			new MainFrame("JavaCoCo", 1000, 500);
	  			dispose();
	  		}
	      	  
	        });
	        ok.addActionListener(new ActionListener() {
	
	    		@Override
	    		public void actionPerformed(ActionEvent e) {
	    			new MainFrame("JavaCoCo", 1000, 500);
	    			dispose();
	    		}
	        	  
	          });
	
	   }
	
	 
	
	}
