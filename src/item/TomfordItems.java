package item;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import frame.MainFrame;

public class TomfordItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/tomford01.jpg"),
			new ImageIcon("itemImages/tomford02.jpg"),
			new ImageIcon("itemImages/tomford03.jpg"),
			new ImageIcon("itemImages/tomford04.jpg"),
			new ImageIcon("itemImages/tomford05.jpg"),
			new ImageIcon("itemImages/tomford06.jpg"),
			new ImageIcon("itemImages/tomford07.jpg"),
			new ImageIcon("itemImages/tomford08.jpg"),
			new ImageIcon("itemImages/tomford09.jpg"),
			};
	
	public TomfordItems(String title, int width, int height) {
		setTitle(title);
	    setSize(width, height);
	    setLocationRelativeTo(null);
	    setExtendedState(JFrame.MAXIMIZED_BOTH);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setLayout(new BorderLayout());
	    
	    setScrollPanel();
	    
	    setVisible(true);
	}
	
	private void setScrollPanel() {
	        JPanel panel = new JPanel();      
	        panel.setPreferredSize(new Dimension(400, 1400));   // 패널에 사이즈 설정 
	        panel.setBackground(Color.WHITE);
	        panel.setLayout(new FlowLayout());
	        
	        JScrollPane sp = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
	         
	        add(sp);
	        
	        JPanel container = new JPanel();
	        container.setLayout(new BorderLayout());
	        container.setBackground(Color.WHITE);
	        
	        //로고이미지,메뉴바----------------
	        ImageIcon logo = new ImageIcon("images/javacoco.png");
	        JLabel logoLabel = new JLabel(logo);
	        logoLabel.setHorizontalAlignment(JLabel.CENTER);
	        JMenuBar mb = new JMenuBar();
	        mb.setLayout(new FlowLayout(FlowLayout.CENTER, 235, 50));
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
	        
	        
	        
	        
	        JLabel textLabel = new JLabel("               Tomford               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel tomford1 = new JPanel();
	        tomford1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford1.setBackground(Color.white);
	        tomford1.setLayout(new BorderLayout());
	        JButton tomford01 = new JButton(imgs[0]);
	        tomford01.setBorderPainted(false);
	        tomford01.setContentAreaFilled(false);
	        tomford01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[톰포드] 로즈 드 시네 EAU 드 퍼퓸");
	        JLabel price1 = new JLabel("149,000원");
	        tomford1.add(tomford01,BorderLayout.NORTH);
	        tomford1.add(name1,BorderLayout.CENTER);
	        tomford1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford2 = new JPanel();
	        tomford2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford2.setBackground(Color.white);
	        tomford2.setLayout(new BorderLayout());
	        JButton tomford02 = new JButton(imgs[1]);
	        tomford02.setBorderPainted(false);
	        tomford02.setContentAreaFilled(false);
	        tomford02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[톰포드] 로즈 디 아말피 EAU 드 퍼퓸");
	        JLabel price2 = new JLabel("244,000원");
	        tomford2.add(tomford02,BorderLayout.NORTH);
	        tomford2.add(name2,BorderLayout.CENTER);
	        tomford2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford3 = new JPanel();
	        tomford3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford3.setBackground(Color.white);
	        tomford3.setLayout(new BorderLayout());
	        JButton tomford03 = new JButton(imgs[2]);
	        tomford03.setBorderPainted(false);
	        tomford03.setContentAreaFilled(false);
	        tomford03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[톰포드] 로즈 프릭 EAU 드 퍼퓸");
	        JLabel price3 = new JLabel("310,000원");
	        tomford3.add(tomford03,BorderLayout.NORTH);
	        tomford3.add(name3,BorderLayout.CENTER);
	        tomford3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford4 = new JPanel();
	        tomford4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford4.setBackground(Color.white);
	        tomford4.setLayout(new BorderLayout());
	        JButton tomford04 = new JButton(imgs[3]);
	        tomford04.setBorderPainted(false);
	        tomford04.setContentAreaFilled(false);
	        tomford04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[톰포드] 튜베르즈 뉘 EAU 드 퍼퓸");
	        JLabel price4 = new JLabel("329,000원");
	        tomford4.add(tomford04,BorderLayout.NORTH);
	        tomford4.add(name4,BorderLayout.CENTER);
	        tomford4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford5 = new JPanel();
	        tomford5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford5.setBackground(Color.white);
	        tomford5.setLayout(new BorderLayout());
	        JButton tomford05 = new JButton(imgs[4]);
	        tomford05.setBorderPainted(false);
	        tomford05.setContentAreaFilled(false);
	        tomford05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[톰포드] 로스트 체리 EAU 드 퍼퓸");
	        JLabel price5 = new JLabel("253,000원");
	        tomford5.add(tomford05,BorderLayout.NORTH);
	        tomford5.add(name5,BorderLayout.CENTER);
	        tomford5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford6 = new JPanel();
	        tomford6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford6.setBackground(Color.white);
	        tomford6.setLayout(new BorderLayout());
	        JButton tomford06 = new JButton(imgs[5]);
	        tomford06.setBorderPainted(false);
	        tomford06.setContentAreaFilled(false);
	        tomford06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[톰포드] 비터피치 EAU 드 퍼퓸");
	        JLabel price6 = new JLabel("160,000원");
	        tomford6.add(tomford06,BorderLayout.NORTH);
	        tomford6.add(name6,BorderLayout.CENTER);
	        tomford6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford7 = new JPanel();
	        tomford7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford7.setBackground(Color.white);
	        tomford7.setLayout(new BorderLayout());
	        JButton tomford07 = new JButton(imgs[6]);
	        tomford07.setBorderPainted(false);
	        tomford07.setContentAreaFilled(false);
	        tomford07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[톰포드] 솔레일 브루란트 EAU 드 퍼퓸");
	        JLabel price7 = new JLabel("248,700원");
	        tomford7.add(tomford07,BorderLayout.NORTH);
	        tomford7.add(name7,BorderLayout.CENTER);
	        tomford7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford8 = new JPanel();
	        tomford8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford8.setBackground(Color.white);
	        tomford8.setLayout(new BorderLayout());
	        JButton tomford08 = new JButton(imgs[7]);
	        tomford08.setBorderPainted(false);
	        tomford08.setContentAreaFilled(false);
	        tomford08.setFocusPainted(false);
	        JLabel name8 = new JLabel("[톰포드] EAU 드 솔레일 블랑");
	        JLabel price8 = new JLabel("230,800원");
	        tomford8.add(tomford08,BorderLayout.NORTH);
	        tomford8.add(name8,BorderLayout.CENTER);
	        tomford8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford9 = new JPanel();
	        tomford9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford9.setBackground(Color.white);
	        tomford9.setLayout(new BorderLayout());
	        JButton tomford09 = new JButton(imgs[8]);
	        tomford09.setBorderPainted(false);
	        tomford09.setContentAreaFilled(false);
	        tomford09.setFocusPainted(false);
	        JLabel name9 = new JLabel("[톰포드] 화이트 슈드 EAU 드 퍼퓸");
	        JLabel price9 = new JLabel("125,000원");
	        tomford9.add(tomford09,BorderLayout.NORTH);
	        tomford9.add(name9,BorderLayout.CENTER);
	        tomford9.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(tomford1);
	        panel01.add(tomford2);
	        panel01.add(tomford3);
	        panel01.add(tomford4);
	        panel01.add(tomford5);
	        panel01.add(tomford6);
	        panel01.add(tomford7);
	        panel01.add(tomford8);
	        panel01.add(tomford9);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
  
}
