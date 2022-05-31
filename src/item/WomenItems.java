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
import javax.swing.JTextArea;
import javax.swing.JTextPane;

import frame.MainFrame;

public class WomenItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/bvlgari01.jpg"),
			new ImageIcon("itemImages/bvlgari03.jpg"),
			new ImageIcon("itemImages/chanel01.jpg"),
			new ImageIcon("itemImages/chanel03.jpg"),
			new ImageIcon("itemImages/chanel04.jpg"),
			new ImageIcon("itemImages/chanel05.jpg"),
			new ImageIcon("itemImages/dior01.jpg"),
			new ImageIcon("itemImages/dior02.jpg"),
			new ImageIcon("itemImages/dior03.jpg"),
			new ImageIcon("itemImages/dior06.jpg"),
			new ImageIcon("itemImages/dior07.jpg"),
			new ImageIcon("itemImages/dior08.jpg"),
			new ImageIcon("itemImages/diptyque01.jpg"),
			new ImageIcon("itemImages/diptyque03.jpg"),
			new ImageIcon("itemImages/diptyque05.jpg"),
			new ImageIcon("itemImages/diptyque07.jpg"),
			new ImageIcon("itemImages/diptyque09.jpg"),
			new ImageIcon("itemImages/forment04.jpg"),
			new ImageIcon("itemImages/forment08.jpg"),
			new ImageIcon("itemImages/gucci01.jpg"),
			new ImageIcon("itemImages/gucci03.jpg"),
			new ImageIcon("itemImages/gucci06.jpg"),
			new ImageIcon("itemImages/gucci08.jpg"),
			new ImageIcon("itemImages/jv02.jpg"),
			new ImageIcon("itemImages/jv03.jpg"),
			new ImageIcon("itemImages/lanvin01.jpg"),
			new ImageIcon("itemImages/lanvin02.jpg"),
			new ImageIcon("itemImages/lanvin03.jpg"),
			new ImageIcon("itemImages/lanvin04.jpg"),
			new ImageIcon("itemImages/lanvin05.jpg"),
			new ImageIcon("itemImages/lanvin06.jpg"),
			new ImageIcon("itemImages/lanvin07.jpg"),
			new ImageIcon("itemImages/lanvin08.jpg"),
			new ImageIcon("itemImages/montblanc03.jpg"),
			new ImageIcon("itemImages/montblanc08.jpg"),
			new ImageIcon("itemImages/tomford01.jpg"),
			new ImageIcon("itemImages/tomford02.jpg"),
			new ImageIcon("itemImages/tomford03.jpg"),
			new ImageIcon("itemImages/tomford05.jpg"),
			new ImageIcon("itemImages/tomford08.jpg"),
			new ImageIcon("itemImages/ysl01.jpg"),
			new ImageIcon("itemImages/ysl02.jpg"),
			new ImageIcon("itemImages/ysl05.jpg"),
			new ImageIcon("itemImages/ysl06.jpg"),
			new ImageIcon("itemImages/ysl07.jpg"),
			};
	
	
	public WomenItems(String title, int width, int height) {
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
	        panel.setPreferredSize(new Dimension(400, 2300));   // 패널에 사이즈 설정 
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
	        
	        
	        JLabel textLabel = new JLabel("               WOMEN               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1600));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(6,3));
	        
	        
	        JPanel bvlgari1 = new JPanel();
	        bvlgari1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari1.setBackground(Color.white);
	        bvlgari1.setLayout(new BorderLayout());
	        JButton bvlgari01 = new JButton(imgs[0]);
	        bvlgari01.setBorderPainted(false);
	        bvlgari01.setContentAreaFilled(false);
	        bvlgari01.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        bvlgari1.add(bvlgari01,BorderLayout.NORTH);
	        bvlgari1.add(name1,BorderLayout.CENTER);
	        bvlgari1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        JPanel bvlgari3 = new JPanel();
	        bvlgari3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari3.setBackground(Color.white);
	        bvlgari3.setLayout(new BorderLayout());
	        JButton bvlgari03 = new JButton(imgs[1]);
	        bvlgari03.setBorderPainted(false);
	        bvlgari03.setContentAreaFilled(false);
	        bvlgari03.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        bvlgari3.add(bvlgari03,BorderLayout.NORTH);
	        bvlgari3.add(name2,BorderLayout.CENTER);
	        bvlgari3.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel1 = new JPanel();
	        chanel1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel1.setBackground(Color.white);
	        chanel1.setLayout(new BorderLayout());
	        JButton chanel01 = new JButton(imgs[2]);
	        chanel01.setBorderPainted(false);
	        chanel01.setContentAreaFilled(false);
	        chanel01.setFocusPainted(false);
	        JLabel name3 = new JLabel("[샤넬] 샹스 오 땅드르 오 드 빠르펭");
	        JLabel price3 = new JLabel("119,200원");
	        chanel1.add(chanel01,BorderLayout.NORTH);
	        chanel1.add(name3,BorderLayout.CENTER);
	        chanel1.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel3 = new JPanel();
	        chanel3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel3.setBackground(Color.white);
	        chanel3.setLayout(new BorderLayout());
	        JButton chanel03 = new JButton(imgs[3]);
	        chanel03.setBorderPainted(false);
	        chanel03.setContentAreaFilled(false);
	        chanel03.setFocusPainted(false);
	        JLabel name4 = new JLabel("[샤넬] N°5 오 드 빠르펭");
	        JLabel price4 = new JLabel("123,000원");
	        chanel3.add(chanel03,BorderLayout.NORTH);
	        chanel3.add(name4,BorderLayout.CENTER);
	        chanel3.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel4 = new JPanel();
	        chanel4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel4.setBackground(Color.white);
	        chanel4.setLayout(new BorderLayout());
	        JButton chanel04 = new JButton(imgs[4]);
	        chanel04.setBorderPainted(false);
	        chanel04.setContentAreaFilled(false);
	        chanel04.setFocusPainted(false);
	        JLabel name5 = new JLabel("[샤넬] 가브리엘 샤넬 에센스 오 드 빠르펭");
	        JLabel price5 = new JLabel("113,100원");
	        chanel4.add(chanel04,BorderLayout.NORTH);
	        chanel4.add(name5,BorderLayout.CENTER);
	        chanel4.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel5 = new JPanel();
	        chanel5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel5.setBackground(Color.white);
	        chanel5.setLayout(new BorderLayout());
	        JButton chanel05 = new JButton(imgs[5]);
	        chanel05.setBorderPainted(false);
	        chanel05.setContentAreaFilled(false);
	        chanel05.setFocusPainted(false);
	        JLabel name6 = new JLabel("[샤넬] 파리 리비에라 레 조 드 샤넬 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("98,100원");
	        chanel5.add(chanel05,BorderLayout.NORTH);
	        chanel5.add(name6,BorderLayout.CENTER);
	        chanel5.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        JPanel dior1 = new JPanel();
	        dior1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior1.setBackground(Color.white);
	        dior1.setLayout(new BorderLayout());
	        JButton dior01 = new JButton(imgs[6]);
	        dior01.setBorderPainted(false);
	        dior01.setContentAreaFilled(false);
	        dior01.setFocusPainted(false);
	        JLabel name7 = new JLabel("[디올] 조이 바이 디올");
	        JLabel price7 = new JLabel("93,200원");
	        dior1.add(dior01,BorderLayout.NORTH);
	        dior1.add(name7,BorderLayout.CENTER);
	        dior1.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior2 = new JPanel();
	        dior2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior2.setBackground(Color.white);
	        dior2.setLayout(new BorderLayout());
	        JButton dior02 = new JButton(imgs[7]);
	        dior02.setBorderPainted(false);
	        dior02.setContentAreaFilled(false);
	        dior02.setFocusPainted(false);
	        JLabel name8 = new JLabel("[디올] 미스 디올 블루밍 부케");
	        JLabel price8 = new JLabel("76,400원");
	        dior2.add(dior02,BorderLayout.NORTH);
	        dior2.add(name8,BorderLayout.CENTER);
	        dior2.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior3 = new JPanel();
	        dior3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior3.setBackground(Color.white);
	        dior3.setLayout(new BorderLayout());
	        JButton dior03 = new JButton(imgs[8]);
	        dior03.setBorderPainted(false);
	        dior03.setContentAreaFilled(false);
	        dior03.setFocusPainted(false);
	        JLabel name9 = new JLabel("[디올] 쟈도르 오 드 퍼퓸 인피니심");
	        JLabel price9 = new JLabel("158,000원");
	        dior3.add(dior03,BorderLayout.NORTH);
	        dior3.add(name9,BorderLayout.CENTER);
	        dior3.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior6 = new JPanel();
	        dior6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior6.setBackground(Color.white);
	        dior6.setLayout(new BorderLayout());
	        JButton dior06 = new JButton(imgs[9]);
	        dior06.setBorderPainted(false);
	        dior06.setContentAreaFilled(false);
	        dior06.setFocusPainted(false);
	        JLabel name10 = new JLabel("[디올] 미스 디올 오리지날");
	        JLabel price10 = new JLabel("119,200원");
	        dior6.add(dior06,BorderLayout.NORTH);
	        dior6.add(name10,BorderLayout.CENTER);
	        dior6.add(price10,BorderLayout.SOUTH);
	        name10.setHorizontalAlignment(JLabel.CENTER);
	        price10.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior7 = new JPanel();
	        dior7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior7.setBackground(Color.white);
	        dior7.setLayout(new BorderLayout());
	        JButton dior07 = new JButton(imgs[10]);
	        dior07.setBorderPainted(false);
	        dior07.setContentAreaFilled(false);
	        dior07.setFocusPainted(false);
	        JLabel name11 = new JLabel("[디올] 에스까네 포토피노");
	        JLabel price11 = new JLabel("102,600원");
	        dior7.add(dior07,BorderLayout.NORTH);
	        dior7.add(name11,BorderLayout.CENTER);
	        dior7.add(price11,BorderLayout.SOUTH);
	        name11.setHorizontalAlignment(JLabel.CENTER);
	        price11.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior8 = new JPanel();
	        dior8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior8.setBackground(Color.white);
	        dior8.setLayout(new BorderLayout());
	        JButton dior08 = new JButton(imgs[11]);
	        dior08.setBorderPainted(false);
	        dior08.setContentAreaFilled(false);
	        dior08.setFocusPainted(false);
	        JLabel name12 = new JLabel("[디올] 돌체비타");
	        JLabel price12 = new JLabel("89,500원");
	        dior8.add(dior08,BorderLayout.NORTH);
	        dior8.add(name12,BorderLayout.CENTER);
	        dior8.add(price12,BorderLayout.SOUTH);
	        name12.setHorizontalAlignment(JLabel.CENTER);
	        price12.setHorizontalAlignment(JLabel.CENTER);
	        

	        JPanel diptyque1 = new JPanel();
	        diptyque1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque1.setBackground(Color.white);
	        diptyque1.setLayout(new BorderLayout());
	        JButton diptyque01 = new JButton(imgs[12]);
	        diptyque01.setBorderPainted(false);
	        diptyque01.setContentAreaFilled(false);
	        diptyque01.setFocusPainted(false);
	        JLabel name13 = new JLabel("[딥디크] 오드 뚜왈렛");
	        JLabel price13 = new JLabel("128,000원");
	        diptyque1.add(diptyque01,BorderLayout.NORTH);
	        diptyque1.add(name13,BorderLayout.CENTER);
	        diptyque1.add(price13,BorderLayout.SOUTH);
	        name13.setHorizontalAlignment(JLabel.CENTER);
	        price13.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        JPanel diptyque3 = new JPanel();
	        diptyque3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque3.setBackground(Color.white);
	        diptyque3.setLayout(new BorderLayout());
	        JButton diptyque03 = new JButton(imgs[13]);
	        diptyque03.setBorderPainted(false);
	        diptyque03.setContentAreaFilled(false);
	        diptyque03.setFocusPainted(false);
	        JLabel name14 = new JLabel("[딥디크] 베티베리오 오드 뚜왈렛");
	        JLabel price14 = new JLabel("119,200원");
	        diptyque3.add(diptyque03,BorderLayout.NORTH);
	        diptyque3.add(name14,BorderLayout.CENTER);
	        diptyque3.add(price14,BorderLayout.SOUTH);
	        name14.setHorizontalAlignment(JLabel.CENTER);
	        price14.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque5 = new JPanel();
	        diptyque5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque5.setBackground(Color.white);
	        diptyque5.setLayout(new BorderLayout());
	        JButton diptyque05 = new JButton(imgs[14]);
	        diptyque05.setBorderPainted(false);
	        diptyque05.setContentAreaFilled(false);
	        diptyque05.setFocusPainted(false);
	        JLabel name15 = new JLabel("[딥디크] 필로시코스 오 드 뚜왈렛");
	        JLabel price15 = new JLabel("194,800원");
	        diptyque5.add(diptyque05,BorderLayout.NORTH);
	        diptyque5.add(name15,BorderLayout.CENTER);
	        diptyque5.add(price15,BorderLayout.SOUTH);
	        name15.setHorizontalAlignment(JLabel.CENTER);
	        price15.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque7 = new JPanel();
	        diptyque7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque7.setBackground(Color.white);
	        diptyque7.setLayout(new BorderLayout());
	        JButton diptyque07 = new JButton(imgs[15]);
	        diptyque07.setBorderPainted(false);
	        diptyque07.setContentAreaFilled(false);
	        diptyque07.setFocusPainted(false);
	        JLabel name16 = new JLabel("[딥디크] 오 드 뚜왈렛 오에도");
	        JLabel price16 = new JLabel("113,900원");
	        diptyque7.add(diptyque07,BorderLayout.NORTH);
	        diptyque7.add(name16,BorderLayout.CENTER);
	        diptyque7.add(price16,BorderLayout.SOUTH);
	        name16.setHorizontalAlignment(JLabel.CENTER);
	        price16.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque9 = new JPanel();
	        diptyque9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque9.setBackground(Color.white);
	        diptyque9.setLayout(new BorderLayout());
	        JButton diptyque09 = new JButton(imgs[16]);
	        diptyque09.setBorderPainted(false);
	        diptyque09.setContentAreaFilled(false);
	        diptyque09.setFocusPainted(false);
	        JLabel name17 = new JLabel("[딥디크] 도손");
	        JLabel price17 = new JLabel("129,000원");
	        diptyque9.add(diptyque09,BorderLayout.NORTH);
	        diptyque9.add(name17,BorderLayout.CENTER);
	        diptyque9.add(price17,BorderLayout.SOUTH);
	        name17.setHorizontalAlignment(JLabel.CENTER);
	        price17.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        
	        
	        
	        panel01.add(bvlgari1);
	        panel01.add(bvlgari3);
	        panel01.add(chanel1);
	        panel01.add(chanel3);
	        panel01.add(chanel4);
	        panel01.add(chanel5);
	        panel01.add(dior1);
	        panel01.add(dior2);
	        panel01.add(dior3);
	        panel01.add(dior6);
	        panel01.add(dior7);
	        panel01.add(dior8);
	        panel01.add(diptyque1);
	        panel01.add(diptyque3);
	        panel01.add(diptyque5);
	        panel01.add(diptyque7);
	        panel01.add(diptyque9);
//	        panel01.add(forment04);
//	        panel01.add(forment08);
//	        panel01.add(gucci01);
//	        panel01.add(gucci03);
//	        panel01.add(gucci06);
//	        panel01.add(gucci08);
//	        panel01.add(jv02);
//	        panel01.add(jv03);
//	        panel01.add(lanvin01);
//	        panel01.add(lanvin02);
//	        panel01.add(lanvin03);
//	        panel01.add(lanvin04);
//	        panel01.add(lanvin05);
//	        panel01.add(lanvin06);
//	        panel01.add(lanvin07);
//	        panel01.add(lanvin08);
//	        panel01.add(montblanc03);
//	        panel01.add(montblanc08);
//	        panel01.add(tomford01);
//	        panel01.add(tomford02);
//	        panel01.add(tomford03);
//	        panel01.add(tomford05);
//	        panel01.add(tomford08);
//	        panel01.add(ysl01);
//	        panel01.add(ysl02);
//	        panel01.add(ysl05);
//	        panel01.add(ysl06);
//	        panel01.add(ysl07);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new WomenItems("JavaCoCo", 1000, 500);

      }
}