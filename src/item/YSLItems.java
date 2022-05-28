package item;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
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

public class YSLItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/ysl01.jpg"),
			new ImageIcon("itemImages/ysl02.jpg"),
			new ImageIcon("itemImages/ysl03.jpg"),
			new ImageIcon("itemImages/ysl04.jpg"),
			new ImageIcon("itemImages/ysl05.jpg"),
			new ImageIcon("itemImages/ysl06.jpg"),
			new ImageIcon("itemImages/ysl07.jpg"),
			new ImageIcon("itemImages/ysl08.jpg"),
			};
	
	public YSLItems(String title, int width, int height) {
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
	        
	        
	        
	        
	        JLabel textLabel = new JLabel("          Yves Saint Laurant          ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        
	        JPanel ysl1 = new JPanel();
	        ysl1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl1.setBackground(Color.white);
	        ysl1.setLayout(new BorderLayout());
	        JButton ysl01 = new JButton(imgs[0]);
	        ysl01.setBorderPainted(false);
	        ysl01.setContentAreaFilled(false);
	        ysl01.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        ysl1.add(ysl01,BorderLayout.NORTH);
	        ysl1.add(name1,BorderLayout.CENTER);
	        ysl1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl2 = new JPanel();
	        ysl2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl2.setBackground(Color.white);
	        ysl2.setLayout(new BorderLayout());
	        JButton ysl02 = new JButton(imgs[1]);
	        ysl02.setBorderPainted(false);
	        ysl02.setContentAreaFilled(false);
	        ysl02.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        ysl2.add(ysl02,BorderLayout.NORTH);
	        ysl2.add(name2,BorderLayout.CENTER);
	        ysl2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl3 = new JPanel();
	        ysl3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl3.setBackground(Color.white);
	        ysl3.setLayout(new BorderLayout());
	        JButton ysl03 = new JButton(imgs[2]);
	        ysl03.setBorderPainted(false);
	        ysl03.setContentAreaFilled(false);
	        ysl03.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        ysl3.add(ysl03,BorderLayout.NORTH);
	        ysl3.add(name3,BorderLayout.CENTER);
	        ysl3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl4 = new JPanel();
	        ysl4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl4.setBackground(Color.white);
	        ysl4.setLayout(new BorderLayout());
	        JButton ysl04 = new JButton(imgs[3]);
	        ysl04.setBorderPainted(false);
	        ysl04.setContentAreaFilled(false);
	        ysl04.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        ysl4.add(ysl04,BorderLayout.NORTH);
	        ysl4.add(name4,BorderLayout.CENTER);
	        ysl4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl5 = new JPanel();
	        ysl5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl5.setBackground(Color.white);
	        ysl5.setLayout(new BorderLayout());
	        JButton ysl05 = new JButton(imgs[4]);
	        ysl05.setBorderPainted(false);
	        ysl05.setContentAreaFilled(false);
	        ysl05.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        ysl5.add(ysl05,BorderLayout.NORTH);
	        ysl5.add(name5,BorderLayout.CENTER);
	        ysl5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl6 = new JPanel();
	        ysl6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl6.setBackground(Color.white);
	        ysl6.setLayout(new BorderLayout());
	        JButton ysl06 = new JButton(imgs[5]);
	        ysl06.setBorderPainted(false);
	        ysl06.setContentAreaFilled(false);
	        ysl06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        ysl6.add(ysl06,BorderLayout.NORTH);
	        ysl6.add(name6,BorderLayout.CENTER);
	        ysl6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl7 = new JPanel();
	        ysl7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl7.setBackground(Color.white);
	        ysl7.setLayout(new BorderLayout());
	        JButton ysl07 = new JButton(imgs[6]);
	        ysl07.setBorderPainted(false);
	        ysl07.setContentAreaFilled(false);
	        ysl07.setFocusPainted(false);
	        JLabel name7 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("119,200원");
	        ysl7.add(ysl07,BorderLayout.NORTH);
	        ysl7.add(name7,BorderLayout.CENTER);
	        ysl7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl8 = new JPanel();
	        ysl8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl8.setBackground(Color.white);
	        ysl8.setLayout(new BorderLayout());
	        JButton ysl08 = new JButton(imgs[7]);
	        ysl08.setBorderPainted(false);
	        ysl08.setContentAreaFilled(false);
	        ysl08.setFocusPainted(false);
	        JLabel name8 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("119,200원");
	        ysl8.add(ysl08,BorderLayout.NORTH);
	        ysl8.add(name8,BorderLayout.CENTER);
	        ysl8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(ysl1);
	        panel01.add(ysl2);
	        panel01.add(ysl3);
	        panel01.add(ysl4);
	        panel01.add(ysl5);
	        panel01.add(ysl6);
	        panel01.add(ysl7);
	        panel01.add(ysl8);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new YSLItems("JavaCoCo", 1000, 500);
    	
      }
}