package item;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.TextComponent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

import frame.MainFrame;

public class ChanelItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/chanel01.jpg"),
			new ImageIcon("itemImages/chanel02.jpg"),
			new ImageIcon("itemImages/chanel03.jpg"),
			new ImageIcon("itemImages/chanel04.jpg"),
			new ImageIcon("itemImages/chanel05.jpg"),
			new ImageIcon("itemImages/chanel06.jpg"),
			new ImageIcon("itemImages/chanel07.jpg"),
			};

	
	public ChanelItems(String title, int width, int height) {
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
	        
	        JLabel textLabel = new JLabel("                          Chanel                          ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        JPanel chanel1 = new JPanel();
	        chanel1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel1.setBackground(Color.white);
	        chanel1.setLayout(new BorderLayout());
	        JButton chanel01 = new JButton(imgs[0]);
	        chanel01.setBorderPainted(false);
	        chanel01.setContentAreaFilled(false);
	        chanel01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[샤넬] 샹스 오 땅드르 오 드 빠르펭");
	        JLabel price1 = new JLabel("119,200원");
	        chanel1.add(chanel01,BorderLayout.NORTH);
	        chanel1.add(name1,BorderLayout.CENTER);
	        chanel1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel2 = new JPanel();
	        chanel2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel2.setBackground(Color.white);
	        chanel2.setLayout(new BorderLayout());
	        JButton chanel02 = new JButton(imgs[1]);
	        chanel02.setBorderPainted(false);
	        chanel02.setContentAreaFilled(false);
	        chanel02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[샤넬] N°1 DE CHANEL 레드 까멜리아 향수 리바이탈라이징 프래그런스");
	        JLabel price2 = new JLabel("133,000원");
	        chanel2.add(chanel02,BorderLayout.NORTH);
	        chanel2.add(name2,BorderLayout.CENTER);
	        chanel2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel3 = new JPanel();
	        chanel3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel3.setBackground(Color.white);
	        chanel3.setLayout(new BorderLayout());
	        JButton chanel03 = new JButton(imgs[2]);
	        chanel03.setBorderPainted(false);
	        chanel03.setContentAreaFilled(false);
	        chanel03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[샤넬] N°5 오 드 빠르펭");
	        JLabel price3 = new JLabel("123,000원");
	        chanel3.add(chanel03,BorderLayout.NORTH);
	        chanel3.add(name3,BorderLayout.CENTER);
	        chanel3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel4 = new JPanel();
	        chanel4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel4.setBackground(Color.white);
	        chanel4.setLayout(new BorderLayout());
	        JButton chanel04 = new JButton(imgs[3]);
	        chanel04.setBorderPainted(false);
	        chanel04.setContentAreaFilled(false);
	        chanel04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[샤넬] 가브리엘 샤넬 에센스 오 드 빠르펭");
	        JLabel price4 = new JLabel("113,100원");
	        chanel4.add(chanel04,BorderLayout.NORTH);
	        chanel4.add(name4,BorderLayout.CENTER);
	        chanel4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel5 = new JPanel();
	        chanel5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel5.setBackground(Color.white);
	        chanel5.setLayout(new BorderLayout());
	        JButton chanel05 = new JButton(imgs[4]);
	        chanel05.setBorderPainted(false);
	        chanel05.setContentAreaFilled(false);
	        chanel05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[샤넬] 파리 리비에라 레 조 드 샤넬 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("98,100원");
	        chanel5.add(chanel05,BorderLayout.NORTH);
	        chanel5.add(name5,BorderLayout.CENTER);
	        chanel5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel6 = new JPanel();
	        chanel6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel6.setBackground(Color.white);
	        chanel6.setLayout(new BorderLayout());
	        JButton chanel06 = new JButton(imgs[5]);
	        chanel06.setBorderPainted(false);
	        chanel06.setContentAreaFilled(false);
	        chanel06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[샤넬] 알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("109,900원");
	        chanel6.add(chanel06,BorderLayout.NORTH);
	        chanel6.add(name6,BorderLayout.CENTER);
	        chanel6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel chanel7 = new JPanel();
	        chanel7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel7.setBackground(Color.white);
	        chanel7.setLayout(new BorderLayout());
	        JButton chanel07 = new JButton(imgs[6]);
	        chanel07.setBorderPainted(false);
	        chanel07.setContentAreaFilled(false);
	        chanel07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[샤넬] 블루 드 샤넬 빠르펭");
	        JLabel price7 = new JLabel("156,700원");
	        chanel7.add(chanel07,BorderLayout.NORTH);
	        chanel7.add(name7,BorderLayout.CENTER);
	        chanel7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	       
	        
	        
	        panel01.add(chanel1);
	        panel01.add(chanel2);
	        panel01.add(chanel3);
	        panel01.add(chanel4);
	        panel01.add(chanel5);
	        panel01.add(chanel6);
	        panel01.add(chanel7);
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        
	        setVisible(true);
	        
	}

	
    
}