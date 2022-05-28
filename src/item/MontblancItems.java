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

public class MontblancItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/montblanc01.jpg"),
			new ImageIcon("itemImages/montblanc02.jpg"),
			new ImageIcon("itemImages/montblanc03.jpg"),
			new ImageIcon("itemImages/montblanc04.jpg"),
			new ImageIcon("itemImages/montblanc05.jpg"),
			new ImageIcon("itemImages/montblanc06.jpg"),
			new ImageIcon("itemImages/montblanc07.jpg"),
			new ImageIcon("itemImages/montblanc08.jpg"),
			new ImageIcon("itemImages/montblanc09.jpg"),
			};
	
	public MontblancItems(String title, int width, int height) {
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
	        
	        
	        JLabel textLabel = new JLabel("               Mont Blanc               ");
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
	        panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel montblanc1 = new JPanel();
	        montblanc1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc1.setBackground(Color.white);
	        montblanc1.setLayout(new BorderLayout());
	        JButton montblanc01 = new JButton(imgs[0]);
	        montblanc01.setBorderPainted(false);
	        montblanc01.setContentAreaFilled(false);
	        montblanc01.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        montblanc1.add(montblanc01,BorderLayout.NORTH);
	        montblanc1.add(name1,BorderLayout.CENTER);
	        montblanc1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc2 = new JPanel();
	        montblanc2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc2.setBackground(Color.white);
	        montblanc2.setLayout(new BorderLayout());
	        JButton montblanc02 = new JButton(imgs[1]);
	        montblanc02.setBorderPainted(false);
	        montblanc02.setContentAreaFilled(false);
	        montblanc02.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        montblanc2.add(montblanc02,BorderLayout.NORTH);
	        montblanc2.add(name2,BorderLayout.CENTER);
	        montblanc2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc3 = new JPanel();
	        montblanc3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc3.setBackground(Color.white);
	        montblanc3.setLayout(new BorderLayout());
	        JButton montblanc03 = new JButton(imgs[2]);
	        montblanc03.setBorderPainted(false);
	        montblanc03.setContentAreaFilled(false);
	        montblanc03.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        montblanc3.add(montblanc03,BorderLayout.NORTH);
	        montblanc3.add(name3,BorderLayout.CENTER);
	        montblanc3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc4 = new JPanel();
	        montblanc4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc4.setBackground(Color.white);
	        montblanc4.setLayout(new BorderLayout());
	        JButton montblanc04 = new JButton(imgs[3]);
	        montblanc04.setBorderPainted(false);
	        montblanc04.setContentAreaFilled(false);
	        montblanc04.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        montblanc4.add(montblanc04,BorderLayout.NORTH);
	        montblanc4.add(name4,BorderLayout.CENTER);
	        montblanc4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc5 = new JPanel();
	        montblanc5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc5.setBackground(Color.white);
	        montblanc5.setLayout(new BorderLayout());
	        JButton montblanc05 = new JButton(imgs[4]);
	        montblanc05.setBorderPainted(false);
	        montblanc05.setContentAreaFilled(false);
	        montblanc05.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        montblanc5.add(montblanc05,BorderLayout.NORTH);
	        montblanc5.add(name5,BorderLayout.CENTER);
	        montblanc5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc6 = new JPanel();
	        montblanc6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc6.setBackground(Color.white);
	        montblanc6.setLayout(new BorderLayout());
	        JButton montblanc06 = new JButton(imgs[5]);
	        montblanc06.setBorderPainted(false);
	        montblanc06.setContentAreaFilled(false);
	        montblanc06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        montblanc6.add(montblanc06,BorderLayout.NORTH);
	        montblanc6.add(name6,BorderLayout.CENTER);
	        montblanc6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc7 = new JPanel();
	        montblanc7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc7.setBackground(Color.white);
	        montblanc7.setLayout(new BorderLayout());
	        JButton montblanc07 = new JButton(imgs[6]);
	        montblanc07.setBorderPainted(false);
	        montblanc07.setContentAreaFilled(false);
	        montblanc07.setFocusPainted(false);
	        JLabel name7 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("119,200원");
	        montblanc7.add(montblanc07,BorderLayout.NORTH);
	        montblanc7.add(name7,BorderLayout.CENTER);
	        montblanc7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc8 = new JPanel();
	        montblanc8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc8.setBackground(Color.white);
	        montblanc8.setLayout(new BorderLayout());
	        JButton montblanc08 = new JButton(imgs[7]);
	        montblanc08.setBorderPainted(false);
	        montblanc08.setContentAreaFilled(false);
	        montblanc08.setFocusPainted(false);
	        JLabel name8 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("119,200원");
	        montblanc8.add(montblanc08,BorderLayout.NORTH);
	        montblanc8.add(name8,BorderLayout.CENTER);
	        montblanc8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc9 = new JPanel();
	        montblanc9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc9.setBackground(Color.white);
	        montblanc9.setLayout(new BorderLayout());
	        JButton montblanc09 = new JButton(imgs[8]);
	        montblanc09.setBorderPainted(false);
	        montblanc09.setContentAreaFilled(false);
	        montblanc09.setFocusPainted(false);
	        JLabel name9 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price9 = new JLabel("119,200원");
	        montblanc9.add(montblanc09,BorderLayout.NORTH);
	        montblanc9.add(name9,BorderLayout.CENTER);
	        montblanc9.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(montblanc1);
	        panel01.add(montblanc2);
	        panel01.add(montblanc3);
	        panel01.add(montblanc4);
	        panel01.add(montblanc5);
	        panel01.add(montblanc6);
	        panel01.add(montblanc7);
	        panel01.add(montblanc8);
	        panel01.add(montblanc9);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new MontblancItems("JavaCoCo", 1000, 500);

      }
}