package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
import javax.swing.JTextField;

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

public class LoginFrame extends JFrame{
    public LoginFrame(String title, int width, int height) {
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
          
          
          JPanel c = new JPanel();
          c.setLayout(new BorderLayout(30, 20));
          c.setBackground(Color.WHITE);
          
          JPanel p = new JPanel();
          p.setBackground(Color.WHITE);
          p.setLayout(new FlowLayout());
          JPanel cp = new JPanel();
          cp.setBackground(Color.WHITE);
          JPanel ep = new JPanel();
          ep.setBackground(Color.WHITE);
          cp.setLayout(new GridLayout(2, 2, 50, 30));
          ep.setLayout(new GridLayout(1, 2, 20, 0));
          
          
          Font font3 = new Font("함초롬돋움", Font.BOLD, 15);
          ImageIcon ji = new ImageIcon("images/join.png"); 
          JLabel jil = new JLabel(ji);
          JLabel join = new JLabel("  회원이 아니신가요?  ");
          join.setFont(font3);
         
          JButton jb = new JButton("회원가입하기");
          jb.setFont(font3);
          jb.setBorderPainted(true);
          jb.setContentAreaFilled(false);
          jb.setFocusPainted(false);
          jb.addActionListener(new ActionListener() {

      		@Override
      		public void actionPerformed(ActionEvent e) {
      			new JoinFrame("JavaCoCo", 1000, 500);
      			dispose();
      		}
          	  
            });
          p.add(jil);
          p.add(join);
          p.add(jb);
          
          
          JLabel id = new JLabel("아이디");
          cp.add(id);
          id.setFont(font3);
          TextField t1 = new TextField(20);
          cp.add(t1);
          JLabel pw = new JLabel("비밀번호");
          pw.setFont(font3);
          cp.add(pw);
          TextField t2 = new TextField(20);
          t2.setEchoChar('*');
          cp.add(t2);
          
          JButton login = new JButton("로그인");
          login.setFont(font3);
          login.setBorderPainted(true);
          login.setContentAreaFilled(false);
          login.setFocusPainted(false);
          login.setHorizontalAlignment(JLabel.CENTER);
          login.addActionListener(new ActionListener() {

      		@Override
      		public void actionPerformed(ActionEvent e) {
      			String id = t1.getText();
      			String pw = t2.getText();
      			
      			JOptionPane.showMessageDialog(null, "로그인 완료");
      			
      		}
          	  
            });
            
            login.addActionListener(new ActionListener() {

        		@Override
        		public void actionPerformed(ActionEvent e) {
        			new MainFrame("JavaCoCo", 1000, 500);
        			dispose();
        		}
            	  
              });
         JButton manager = new JButton("관리자");
         manager.setFont(font3);
         manager.setBorderPainted(true);
         manager.setContentAreaFilled(false);
         manager.setFocusPainted(false);
         manager.setHorizontalAlignment(JLabel.CENTER);
         manager.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ManagerFrame();
				
			}
        	 
         });
         
         ep.add(login);
         ep.add(manager);
         
         c.add(p, BorderLayout.SOUTH);
         c.add(cp, BorderLayout.CENTER);
         c.add(ep, BorderLayout.EAST);
     
      
      
      
      
     
      

   
    
      
      JPanel J = new JPanel();
      J.setBackground(Color.WHITE);
      Font f = new Font("HY견명조", Font.PLAIN, 50);
      J.setPreferredSize(new Dimension(1100, 150));
      JLabel Login = new JLabel("Login");
      Login.setFont(f); 
      J.add(Login);
      
      
      panel.add(container);
      panel.add(J);
      panel.add(c);
      
     
    }

	
      
    
	

}
