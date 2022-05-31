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

public class GucciItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/gucci01.jpg"),
			new ImageIcon("itemImages/gucci02.jpg"),
			new ImageIcon("itemImages/gucci03.jpg"),
			new ImageIcon("itemImages/gucci04.jpg"),
			new ImageIcon("itemImages/gucci05.jpg"),
			new ImageIcon("itemImages/gucci06.jpg"),
			new ImageIcon("itemImages/gucci07.jpg"),
			new ImageIcon("itemImages/gucci08.jpg"),
			new ImageIcon("itemImages/gucci09.jpg"),
			};
	
	public GucciItems(String title, int width, int height) {
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
	        
	        
	        
	        JLabel textLabel = new JLabel("                  Gucci                  ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel gucci1 = new JPanel();
	        gucci1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci1.setBackground(Color.white);
	        gucci1.setLayout(new BorderLayout());
	        JButton gucci01 = new JButton(imgs[0]);
	        gucci01.setBorderPainted(false);
	        gucci01.setContentAreaFilled(false);
	        gucci01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[구찌 블룸] 오 드 퍼퓸");
	        JLabel price1 = new JLabel("143,900원");
	        gucci1.add(gucci01,BorderLayout.NORTH);
	        gucci1.add(name1,BorderLayout.CENTER);
	        gucci1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci2 = new JPanel();
	        gucci2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci2.setBackground(Color.white);
	        gucci2.setLayout(new BorderLayout());
	        JButton gucci02 = new JButton(imgs[1]);
	        gucci02.setBorderPainted(false);
	        gucci02.setContentAreaFilled(false);
	        gucci02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[구찌 블룸] 암브로시아 디 피오리 오 드 퍼퓸");
	        JLabel price2 = new JLabel("112,000원");
	        gucci2.add(gucci02,BorderLayout.NORTH);
	        gucci2.add(name2,BorderLayout.CENTER);
	        gucci2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci3 = new JPanel();
	        gucci3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci3.setBackground(Color.white);
	        gucci3.setLayout(new BorderLayout());
	        JButton gucci03 = new JButton(imgs[2]);
	        gucci03.setBorderPainted(false);
	        gucci03.setContentAreaFilled(false);
	        gucci03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[구찌 블룸] 네타레 디 피오리 오 드 퍼퓸");
	        JLabel price3 = new JLabel("88,900원");
	        gucci3.add(gucci03,BorderLayout.NORTH);
	        gucci3.add(name3,BorderLayout.CENTER);
	        gucci3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci4 = new JPanel();
	        gucci4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci4.setBackground(Color.white);
	        gucci4.setLayout(new BorderLayout());
	        JButton gucci04 = new JButton(imgs[3]);
	        gucci04.setBorderPainted(false);
	        gucci04.setContentAreaFilled(false);
	        gucci04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[구찌 블룸] 아쿠아 디 피오리 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("109,000원");
	        gucci4.add(gucci04,BorderLayout.NORTH);
	        gucci4.add(name4,BorderLayout.CENTER);
	        gucci4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci5 = new JPanel();
	        gucci5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci5.setBackground(Color.white);
	        gucci5.setLayout(new BorderLayout());
	        JButton gucci05 = new JButton(imgs[4]);
	        gucci05.setBorderPainted(false);
	        gucci05.setContentAreaFilled(false);
	        gucci05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[구찌 알케미스트 가든] A Midnight Stroll");
	        JLabel price5 = new JLabel("450,000원");
	        gucci5.add(gucci05,BorderLayout.NORTH);
	        gucci5.add(name5,BorderLayout.CENTER);
	        gucci5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci6 = new JPanel();
	        gucci6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci6.setBackground(Color.white);
	        gucci6.setLayout(new BorderLayout());
	        JButton gucci06 = new JButton(imgs[5]);
	        gucci06.setBorderPainted(false);
	        gucci06.setContentAreaFilled(false);
	        gucci06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[구찌 플로라] 골저스 가드니아 오 드 퍼퓸");
	        JLabel price6 = new JLabel("145,000원");
	        gucci6.add(gucci06,BorderLayout.NORTH);
	        gucci6.add(name6,BorderLayout.CENTER);
	        gucci6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci7 = new JPanel();
	        gucci7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci7.setBackground(Color.white);
	        gucci7.setLayout(new BorderLayout());
	        JButton gucci07 = new JButton(imgs[6]);
	        gucci07.setBorderPainted(false);
	        gucci07.setContentAreaFilled(false);
	        gucci07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[구찌 블룸] 프로푸모 디 피오리 오 드 퍼퓸");
	        JLabel price7 = new JLabel("108,400원");
	        gucci7.add(gucci07,BorderLayout.NORTH);
	        gucci7.add(name7,BorderLayout.CENTER);
	        gucci7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci8 = new JPanel();
	        gucci8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci8.setBackground(Color.white);
	        gucci8.setLayout(new BorderLayout());
	        JButton gucci08 = new JButton(imgs[7]);
	        gucci08.setBorderPainted(false);
	        gucci08.setContentAreaFilled(false);
	        gucci08.setFocusPainted(false);
	        JLabel name8 = new JLabel("[구찌 알케미스트 가든] A Chant for the Nymph");
	        JLabel price8 = new JLabel("390,000원");
	        gucci8.add(gucci08,BorderLayout.NORTH);
	        gucci8.add(name8,BorderLayout.CENTER);
	        gucci8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci9 = new JPanel();
	        gucci9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci9.setBackground(Color.white);
	        gucci9.setLayout(new BorderLayout());
	        JButton gucci09 = new JButton(imgs[8]);
	        gucci09.setBorderPainted(false);
	        gucci09.setContentAreaFilled(false);
	        gucci09.setFocusPainted(false);
	        JLabel name9 = new JLabel("[구찌 알케미스트 가든] 1921");
	        JLabel price9 = new JLabel("399,000원");
	        gucci9.add(gucci09,BorderLayout.NORTH);
	        gucci9.add(name9,BorderLayout.CENTER);
	        gucci9.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(gucci1);
	        panel01.add(gucci2);
	        panel01.add(gucci3);
	        panel01.add(gucci4);
	        panel01.add(gucci5);
	        panel01.add(gucci6);
	        panel01.add(gucci7);
	        panel01.add(gucci8);
	        panel01.add(gucci9);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
}