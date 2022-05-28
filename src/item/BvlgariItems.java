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

public class BvlgariItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/bvlgari01.jpg"),
			new ImageIcon("itemImages/bvlgari02.jpg"),
			new ImageIcon("itemImages/bvlgari03.jpg"),
			new ImageIcon("itemImages/bvlgari04.jpg"),
			new ImageIcon("itemImages/bvlgari05.jpg"),
			new ImageIcon("itemImages/bvlgari06.jpg"),
			new ImageIcon("itemImages/bvlgari07.jpg")
			};
	
	
	public BvlgariItems(String title, int width, int height) {
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
	        
	        
	        JLabel textLabel = new JLabel("               Bvlgari               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
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
	        
	        JPanel bvlgari2 = new JPanel();
	        bvlgari2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari2.setBackground(Color.white);
	        bvlgari2.setLayout(new BorderLayout());
	        JButton bvlgari02 = new JButton(imgs[1]);
	        bvlgari02.setBorderPainted(false);
	        bvlgari02.setContentAreaFilled(false);
	        bvlgari02.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        bvlgari2.add(bvlgari02,BorderLayout.NORTH);
	        bvlgari2.add(name2,BorderLayout.CENTER);
	        bvlgari2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel bvlgari3 = new JPanel();
	        bvlgari3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari3.setBackground(Color.white);
	        bvlgari3.setLayout(new BorderLayout());
	        JButton bvlgari03 = new JButton(imgs[2]);
	        bvlgari03.setBorderPainted(false);
	        bvlgari03.setContentAreaFilled(false);
	        bvlgari03.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        bvlgari3.add(bvlgari03,BorderLayout.NORTH);
	        bvlgari3.add(name3,BorderLayout.CENTER);
	        bvlgari3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel bvlgari4 = new JPanel();
	        bvlgari4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari4.setBackground(Color.white);
	        bvlgari4.setLayout(new BorderLayout());
	        JButton bvlgari04 = new JButton(imgs[3]);
	        bvlgari04.setBorderPainted(false);
	        bvlgari04.setContentAreaFilled(false);
	        bvlgari04.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        bvlgari4.add(bvlgari04,BorderLayout.NORTH);
	        bvlgari4.add(name4,BorderLayout.CENTER);
	        bvlgari4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel bvlgari5 = new JPanel();
	        bvlgari5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari5.setBackground(Color.white);
	        bvlgari5.setLayout(new BorderLayout());
	        JButton bvlgari05 = new JButton(imgs[4]);
	        bvlgari05.setBorderPainted(false);
	        bvlgari05.setContentAreaFilled(false);
	        bvlgari05.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        bvlgari5.add(bvlgari05,BorderLayout.NORTH);
	        bvlgari5.add(name5,BorderLayout.CENTER);
	        bvlgari5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel bvlgari6 = new JPanel();
	        bvlgari6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari6.setBackground(Color.white);
	        bvlgari6.setLayout(new BorderLayout());
	        JButton bvlgari06 = new JButton(imgs[5]);
	        bvlgari06.setBorderPainted(false);
	        bvlgari06.setContentAreaFilled(false);
	        bvlgari06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        bvlgari6.add(bvlgari06,BorderLayout.NORTH);
	        bvlgari6.add(name6,BorderLayout.CENTER);
	        bvlgari6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel bvlgari7 = new JPanel();
	        bvlgari7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        bvlgari7.setBackground(Color.white);
	        bvlgari7.setLayout(new BorderLayout());
	        JButton bvlgari07 = new JButton(imgs[6]);
	        bvlgari07.setBorderPainted(false);
	        bvlgari07.setContentAreaFilled(false);
	        bvlgari07.setFocusPainted(false);
	        JLabel name7 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("119,200원");
	        bvlgari7.add(bvlgari07,BorderLayout.NORTH);
	        bvlgari7.add(name7,BorderLayout.CENTER);
	        bvlgari7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        

	        
	        panel01.add(bvlgari1);
	        panel01.add(bvlgari2);
	        panel01.add(bvlgari3);
	        panel01.add(bvlgari4);
	        panel01.add(bvlgari5);
	        panel01.add(bvlgari6);
	        panel01.add(bvlgari7);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new BvlgariItems("JavaCoCo", 1000, 500);

      }
}