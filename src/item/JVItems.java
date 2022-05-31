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

public class JVItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/jv01.jpg"),
			new ImageIcon("itemImages/jv02.jpg"),
			new ImageIcon("itemImages/jv03.jpg"),
			new ImageIcon("itemImages/jv04.jpg"),
			new ImageIcon("itemImages/jv05.jpg"),
			new ImageIcon("itemImages/jv06.jpg"),
			new ImageIcon("itemImages/jv07.jpg"),
			};
	
	public JVItems(String title, int width, int height) {
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
	        
	        
	        
	        
	        JLabel textLabel = new JLabel("          John Varvatos          ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel jv1 = new JPanel();
	        jv1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv1.setBackground(Color.white);
	        jv1.setLayout(new BorderLayout());
	        JButton jv01 = new JButton(imgs[0]);
	        jv01.setBorderPainted(false);
	        jv01.setContentAreaFilled(false);
	        jv01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[존바바토스] 아티 산 EDT");
	        JLabel price1 = new JLabel("36,000원");
	        jv1.add(jv01,BorderLayout.NORTH);
	        jv1.add(name1,BorderLayout.CENTER);
	        jv1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        JPanel jv2 = new JPanel();
	        jv2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv2.setBackground(Color.white);
	        jv2.setLayout(new BorderLayout());
	        JButton jv02 = new JButton(imgs[1]);
	        jv02.setBorderPainted(false);
	        jv02.setContentAreaFilled(false);
	        jv02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[존바바토스] 아티 산 마일드 EDT");
	        JLabel price2 = new JLabel("37,900원");
	        jv2.add(jv02,BorderLayout.NORTH);
	        jv2.add(name2,BorderLayout.CENTER);
	        jv2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel jv3 = new JPanel();
	        jv3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv3.setBackground(Color.white);
	        jv3.setLayout(new BorderLayout());
	        JButton jv03 = new JButton(imgs[2]);
	        jv03.setBorderPainted(false);
	        jv03.setContentAreaFilled(false);
	        jv03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[존바바토스] 아티 산 퓨어 EDT");
	        JLabel price3 = new JLabel("31,900원");
	        jv3.add(jv03,BorderLayout.NORTH);
	        jv3.add(name3,BorderLayout.CENTER);
	        jv3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel jv4 = new JPanel();
	        jv4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv4.setBackground(Color.white);
	        jv4.setLayout(new BorderLayout());
	        JButton jv04 = new JButton(imgs[3]);
	        jv04.setBorderPainted(false);
	        jv04.setContentAreaFilled(false);
	        jv04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[존바바토스] 아티 산 블랙 EDT");
	        JLabel price4 = new JLabel("47,900원");
	        jv4.add(jv04,BorderLayout.NORTH);
	        jv4.add(name4,BorderLayout.CENTER);
	        jv4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel jv5 = new JPanel();
	        jv5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv5.setBackground(Color.white);
	        jv5.setLayout(new BorderLayout());
	        JButton jv05 = new JButton(imgs[4]);
	        jv05.setBorderPainted(false);
	        jv05.setContentAreaFilled(false);
	        jv05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[존바바토스] 아티 산 아쿠아");
	        JLabel price5 = new JLabel("31,400원");
	        jv5.add(jv05,BorderLayout.NORTH);
	        jv5.add(name5,BorderLayout.CENTER);
	        jv5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel jv6 = new JPanel();
	        jv6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv6.setBackground(Color.white);
	        jv6.setLayout(new BorderLayout());
	        JButton jv06 = new JButton(imgs[5]);
	        jv06.setBorderPainted(false);
	        jv06.setContentAreaFilled(false);
	        jv06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[존바바토스] 닉 조나스 레드");
	        JLabel price6 = new JLabel("90,300원");
	        jv6.add(jv06,BorderLayout.NORTH);
	        jv6.add(name6,BorderLayout.CENTER);
	        jv6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel jv7 = new JPanel();
	        jv7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv7.setBackground(Color.white);
	        jv7.setLayout(new BorderLayout());
	        JButton jv07 = new JButton(imgs[6]);
	        jv07.setBorderPainted(false);
	        jv07.setContentAreaFilled(false);
	        jv07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[존바바토스] 닉 조나스 블루");
	        JLabel price7 = new JLabel("90,300원");
	        jv7.add(jv07,BorderLayout.NORTH);
	        jv7.add(name7,BorderLayout.CENTER);
	        jv7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        

	        
	        panel01.add(jv1);
	        panel01.add(jv2);
	        panel01.add(jv3);
	        panel01.add(jv4);
	        panel01.add(jv5);
	        panel01.add(jv6);
	        panel01.add(jv7);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    
}