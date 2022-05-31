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

public class BestItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/dior02.jpg"),
			new ImageIcon("itemImages/lanvin04.jpg"),
			new ImageIcon("itemImages/montblanc05.jpg"),
			new ImageIcon("itemImages/tomford09.jpg"),
			new ImageIcon("itemImages/diptyque07.jpg"),
			new ImageIcon("itemImages/ck05.jpg")
			};
	
	
	public BestItems(String title, int width, int height) {
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
	        panel.setPreferredSize(new Dimension(400, 1200));   // 패널에 사이즈 설정 
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
	        
	        
	        JLabel textLabel = new JLabel("               BEST ITEMS               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400,500));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(2,3));
	        
	        
	        JPanel dior2 = new JPanel();
	        dior2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior2.setBackground(Color.white);
	        dior2.setLayout(new BorderLayout());
	        JButton dior02 = new JButton(imgs[0]);
	        dior02.setBorderPainted(false);
	        dior02.setContentAreaFilled(false);
	        dior02.setFocusPainted(false);
	        JLabel name1 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("119,200원");
	        dior2.add(dior02,BorderLayout.NORTH);
	        dior2.add(name1,BorderLayout.CENTER);
	        dior2.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        JPanel lanvin4 = new JPanel();
	        lanvin4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin4.setBackground(Color.white);
	        lanvin4.setLayout(new BorderLayout());
	        JButton lanvin04 = new JButton(imgs[1]);
	        lanvin04.setBorderPainted(false);
	        lanvin04.setContentAreaFilled(false);
	        lanvin04.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        lanvin4.add(lanvin04,BorderLayout.NORTH);
	        lanvin4.add(name2,BorderLayout.CENTER);
	        lanvin4.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel montblanc5 = new JPanel();
	        montblanc5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        montblanc5.setBackground(Color.white);
	        montblanc5.setLayout(new BorderLayout());
	        JButton montblanc05 = new JButton(imgs[2]);
	        montblanc05.setBorderPainted(false);
	        montblanc05.setContentAreaFilled(false);
	        montblanc05.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        montblanc5.add(montblanc05,BorderLayout.NORTH);
	        montblanc5.add(name3,BorderLayout.CENTER);
	        montblanc5.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel tomford9 = new JPanel();
	        tomford9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford9.setBackground(Color.white);
	        tomford9.setLayout(new BorderLayout());
	        JButton tomford09 = new JButton(imgs[3]);
	        tomford09.setBorderPainted(false);
	        tomford09.setContentAreaFilled(false);
	        tomford09.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        tomford9.add(tomford09,BorderLayout.NORTH);
	        tomford9.add(name4,BorderLayout.CENTER);
	        tomford9.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque7 = new JPanel();
	        diptyque7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque7.setBackground(Color.white);
	        diptyque7.setLayout(new BorderLayout());
	        JButton diptyque07 = new JButton(imgs[4]);
	        diptyque07.setBorderPainted(false);
	        diptyque07.setContentAreaFilled(false);
	        diptyque07.setFocusPainted(false);
	        JLabel name5 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("119,200원");
	        diptyque7.add(diptyque07,BorderLayout.NORTH);
	        diptyque7.add(name5,BorderLayout.CENTER);
	        diptyque7.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck5 = new JPanel();
	        ck5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck5.setBackground(Color.white);
	        ck5.setLayout(new BorderLayout());
	        JButton ck05 = new JButton(imgs[5]);
	        ck05.setBorderPainted(false);
	        ck05.setContentAreaFilled(false);
	        ck05.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        ck5.add(ck05,BorderLayout.NORTH);
	        ck5.add(name6,BorderLayout.CENTER);
	        ck5.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        

	        
	        panel01.add(dior2);
	        panel01.add(lanvin4);
	        panel01.add(montblanc5);
	        panel01.add(tomford9);
	        panel01.add(diptyque7);
	        panel01.add(ck5);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new BestItems("JavaCoCo", 1000, 500);

      }
}