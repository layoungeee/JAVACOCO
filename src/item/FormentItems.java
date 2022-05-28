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

public class FormentItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/forment01.jpg"),
			new ImageIcon("itemImages/forment02.jpg"),
			new ImageIcon("itemImages/forment03.jpg"),
			new ImageIcon("itemImages/forment04.jpg"),
			new ImageIcon("itemImages/forment05.jpg"),
			new ImageIcon("itemImages/forment06.jpg"),
			new ImageIcon("itemImages/forment07.jpg"),
			new ImageIcon("itemImages/forment08.jpg"),
			};
	
	public FormentItems(String title, int width, int height) {
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
	        
	        
	        
	        JLabel textLabel = new JLabel("               Forment               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel forment1 = new JPanel();
	        forment1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment1.setBackground(Color.white);
	        forment1.setLayout(new BorderLayout());
	        JButton forment01 = new JButton(imgs[0]);
	        forment01.setBorderPainted(false);
	        forment01.setContentAreaFilled(false);
	        forment01.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        forment1.add(forment01,BorderLayout.NORTH);
	        forment1.add(name1,BorderLayout.CENTER);
	        forment1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment2 = new JPanel();
	        forment2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment2.setBackground(Color.white);
	        forment2.setLayout(new BorderLayout());
	        JButton forment02 = new JButton(imgs[1]);
	        forment02.setBorderPainted(false);
	        forment02.setContentAreaFilled(false);
	        forment02.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        forment2.add(forment02,BorderLayout.NORTH);
	        forment2.add(name2,BorderLayout.CENTER);
	        forment2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment3 = new JPanel();
	        forment3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment3.setBackground(Color.white);
	        forment3.setLayout(new BorderLayout());
	        JButton forment03 = new JButton(imgs[2]);
	        forment03.setBorderPainted(false);
	        forment03.setContentAreaFilled(false);
	        forment03.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        forment3.add(forment03,BorderLayout.NORTH);
	        forment3.add(name3,BorderLayout.CENTER);
	        forment3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment4 = new JPanel();
	        forment4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment4.setBackground(Color.white);
	        forment4.setLayout(new BorderLayout());
	        JButton forment04 = new JButton(imgs[3]);
	        forment04.setBorderPainted(false);
	        forment04.setContentAreaFilled(false);
	        forment04.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        forment4.add(forment04,BorderLayout.NORTH);
	        forment4.add(name4,BorderLayout.CENTER);
	        forment4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment5 = new JPanel();
	        forment5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment5.setBackground(Color.white);
	        forment5.setLayout(new BorderLayout());
	        JButton forment05 = new JButton(imgs[4]);
	        forment05.setBorderPainted(false);
	        forment05.setContentAreaFilled(false);
	        forment05.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        forment5.add(forment05,BorderLayout.NORTH);
	        forment5.add(name5,BorderLayout.CENTER);
	        forment5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment6 = new JPanel();
	        forment6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment6.setBackground(Color.white);
	        forment6.setLayout(new BorderLayout());
	        JButton forment06 = new JButton(imgs[5]);
	        forment06.setBorderPainted(false);
	        forment06.setContentAreaFilled(false);
	        forment06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        forment6.add(forment06,BorderLayout.NORTH);
	        forment6.add(name6,BorderLayout.CENTER);
	        forment6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment7 = new JPanel();
	        forment7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment7.setBackground(Color.white);
	        forment7.setLayout(new BorderLayout());
	        JButton forment07 = new JButton(imgs[6]);
	        forment07.setBorderPainted(false);
	        forment07.setContentAreaFilled(false);
	        forment07.setFocusPainted(false);
	        JLabel name7 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("119,200원");
	        forment7.add(forment07,BorderLayout.NORTH);
	        forment7.add(name7,BorderLayout.CENTER);
	        forment7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel forment8 = new JPanel();
	        forment8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment8.setBackground(Color.white);
	        forment8.setLayout(new BorderLayout());
	        JButton forment08 = new JButton(imgs[7]);
	        forment08.setBorderPainted(false);
	        forment08.setContentAreaFilled(false);
	        forment08.setFocusPainted(false);
	        JLabel name8 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("119,200원");
	        forment8.add(forment08,BorderLayout.NORTH);
	        forment8.add(name8,BorderLayout.CENTER);
	        forment8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(forment1);
	        panel01.add(forment2);
	        panel01.add(forment3);
	        panel01.add(forment4);
	        panel01.add(forment5);
	        panel01.add(forment6);
	        panel01.add(forment7);
	        panel01.add(forment8);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new FormentItems("JavaCoCo", 1000, 500);

      }
}