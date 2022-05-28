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

public class CKItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/ck01.jpg"),
			new ImageIcon("itemImages/ck02.jpg"),
			new ImageIcon("itemImages/ck03.jpg"),
			new ImageIcon("itemImages/ck04.jpg"),
			new ImageIcon("itemImages/ck05.jpg"),
			new ImageIcon("itemImages/ck06.jpg"),
			new ImageIcon("itemImages/ck07.jpg"),
			new ImageIcon("itemImages/ck08.jpg"),
			};
	
	public CKItems(String title, int width, int height) {
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
	        panel.setPreferredSize(new Dimension(400, 1500));   // 패널에 사이즈 설정 
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
	        
	        
	        JLabel textLabel = new JLabel("               Calvin Klein               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
		    panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        JPanel ck1 = new JPanel();
	        ck1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck1.setBackground(Color.white);
	        ck1.setLayout(new BorderLayout());
	        JButton ck01 = new JButton(imgs[0]);
	        ck01.setBorderPainted(false);
	        ck01.setContentAreaFilled(false);
	        ck01.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        ck1.add(ck01,BorderLayout.NORTH);
	        ck1.add(name1,BorderLayout.CENTER);
	        ck1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck2 = new JPanel();
	        ck2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck2.setBackground(Color.white);
	        ck2.setLayout(new BorderLayout());
	        JButton ck02 = new JButton(imgs[1]);
	        ck02.setBorderPainted(false);
	        ck02.setContentAreaFilled(false);
	        ck02.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        ck2.add(ck02,BorderLayout.NORTH);
	        ck2.add(name2,BorderLayout.CENTER);
	        ck2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck3 = new JPanel();
	        ck3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck3.setBackground(Color.white);
	        ck3.setLayout(new BorderLayout());
	        JButton ck03 = new JButton(imgs[2]);
	        ck03.setBorderPainted(false);
	        ck03.setContentAreaFilled(false);
	        ck03.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        ck3.add(ck03,BorderLayout.NORTH);
	        ck3.add(name3,BorderLayout.CENTER);
	        ck3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck4 = new JPanel();
	        ck4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck4.setBackground(Color.white);
	        ck4.setLayout(new BorderLayout());
	        JButton ck04 = new JButton(imgs[3]);
	        ck04.setBorderPainted(false);
	        ck04.setContentAreaFilled(false);
	        ck04.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        ck4.add(ck04,BorderLayout.NORTH);
	        ck4.add(name4,BorderLayout.CENTER);
	        ck4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck5 = new JPanel();
	        ck5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck5.setBackground(Color.white);
	        ck5.setLayout(new BorderLayout());
	        JButton ck05 = new JButton(imgs[4]);
	        ck05.setBorderPainted(false);
	        ck05.setContentAreaFilled(false);
	        ck05.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        ck5.add(ck05,BorderLayout.NORTH);
	        ck5.add(name5,BorderLayout.CENTER);
	        ck5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck6 = new JPanel();
	        ck6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck6.setBackground(Color.white);
	        ck6.setLayout(new BorderLayout());
	        JButton ck06 = new JButton(imgs[5]);
	        ck06.setBorderPainted(false);
	        ck06.setContentAreaFilled(false);
	        ck06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        ck6.add(ck06,BorderLayout.NORTH);
	        ck6.add(name6,BorderLayout.CENTER);
	        ck6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck7 = new JPanel();
	        ck7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck7.setBackground(Color.white);
	        ck7.setLayout(new BorderLayout());
	        JButton ck07 = new JButton(imgs[6]);
	        ck07.setBorderPainted(false);
	        ck07.setContentAreaFilled(false);
	        ck07.setFocusPainted(false);
	        JLabel name7 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("119,200원");
	        ck7.add(ck07,BorderLayout.NORTH);
	        ck7.add(name7,BorderLayout.CENTER);
	        ck7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck8 = new JPanel();
	        ck8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck8.setBackground(Color.white);
	        ck8.setLayout(new BorderLayout());
	        JButton ck08 = new JButton(imgs[7]);
	        ck08.setBorderPainted(false);
	        ck08.setContentAreaFilled(false);
	        ck08.setFocusPainted(false);
	        JLabel name8 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("119,200원");
	        ck8.add(ck08,BorderLayout.NORTH);
	        ck8.add(name8,BorderLayout.CENTER);
	        ck8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(ck1);
	        panel01.add(ck2);
	        panel01.add(ck3);
	        panel01.add(ck4);
	        panel01.add(ck5);
	        panel01.add(ck6);
	        panel01.add(ck7);
	        panel01.add(ck8);
	        
	        
	        panel.add(container);	        
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new CKItems("JavaCoCo", 1000, 500);

      }
}