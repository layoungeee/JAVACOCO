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

public class NewItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/chanel07.jpg"),
			new ImageIcon("itemImages/forment01.jpg"),
			new ImageIcon("itemImages/diptyque08.jpg"),
			new ImageIcon("itemImages/gucci06.jpg"),
			new ImageIcon("itemImages/ysl05.jpg"),
			new ImageIcon("itemImages/tomford06.jpg"),
			new ImageIcon("itemImages/bvlgari07.jpg"),
			new ImageIcon("itemImages/jv05.jpg"),
			new ImageIcon("itemImages/ysl07.jpg"),
			new ImageIcon("itemImages/ck03.jpg")
			};
	
	
	public NewItems(String title, int width, int height) {
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
	        
	        
	        JLabel textLabel = new JLabel("               NEW ITEMS               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 1000));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(4,3));
	        
	        
	        JPanel chanel7 = new JPanel();
	        chanel7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        chanel7.setBackground(Color.white);
	        chanel7.setLayout(new BorderLayout());
	        JButton chanel07 = new JButton(imgs[0]);
	        chanel07.setBorderPainted(false);
	        chanel07.setContentAreaFilled(false);
	        chanel07.setFocusPainted(false);
	        JLabel name1 = new JLabel("파리 리비에라 레 조 드 샤넬 오 드 뚜왈렛");
	        JLabel price1 = new JLabel("156,700원");
	        chanel7.add(chanel07,BorderLayout.NORTH);
	        chanel7.add(name1,BorderLayout.CENTER);
	        chanel7.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        JPanel forment1 = new JPanel();
	        forment1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        forment1.setBackground(Color.white);
	        forment1.setLayout(new BorderLayout());
	        JButton forment01 = new JButton(imgs[1]);
	        forment01.setBorderPainted(false);
	        forment01.setContentAreaFilled(false);
	        forment01.setFocusPainted(false);
	        JLabel name2 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price2 = new JLabel("119,200원");
	        forment1.add(forment01,BorderLayout.NORTH);
	        forment1.add(name2,BorderLayout.CENTER);
	        forment1.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque8 = new JPanel();
	        diptyque8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque8.setBackground(Color.white);
	        diptyque8.setLayout(new BorderLayout());
	        JButton diptyque08 = new JButton(imgs[2]);
	        diptyque08.setBorderPainted(false);
	        diptyque08.setContentAreaFilled(false);
	        diptyque08.setFocusPainted(false);
	        JLabel name3 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        diptyque8.add(diptyque08,BorderLayout.NORTH);
	        diptyque8.add(name3,BorderLayout.CENTER);
	        diptyque8.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel gucci6 = new JPanel();
	        gucci6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        gucci6.setBackground(Color.white);
	        gucci6.setLayout(new BorderLayout());
	        JButton gucci06 = new JButton(imgs[3]);
	        gucci06.setBorderPainted(false);
	        gucci06.setContentAreaFilled(false);
	        gucci06.setFocusPainted(false);
	        JLabel name4 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("119,200원");
	        gucci6.add(gucci06,BorderLayout.NORTH);
	        gucci6.add(name4,BorderLayout.CENTER);
	        gucci6.add(price4,BorderLayout.SOUTH);
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
	        
	        
	        JPanel tomford6 = new JPanel();
	        tomford6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        tomford6.setBackground(Color.white);
	        tomford6.setLayout(new BorderLayout());
	        JButton tomford06 = new JButton(imgs[5]);
	        tomford06.setBorderPainted(false);
	        tomford06.setContentAreaFilled(false);
	        tomford06.setFocusPainted(false);
	        JLabel name6 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("119,200원");
	        tomford6.add(tomford06,BorderLayout.NORTH);
	        tomford6.add(name6,BorderLayout.CENTER);
	        tomford6.add(price6,BorderLayout.SOUTH);
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
	        
	        
	        JPanel jv5 = new JPanel();
	        jv5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        jv5.setBackground(Color.white);
	        jv5.setLayout(new BorderLayout());
	        JButton jv05 = new JButton(imgs[7]);
	        jv05.setBorderPainted(false);
	        jv05.setContentAreaFilled(false);
	        jv05.setFocusPainted(false);
	        JLabel name8 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("119,200원");
	        jv5.add(jv05,BorderLayout.NORTH);
	        jv5.add(name8,BorderLayout.CENTER);
	        jv5.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ysl7 = new JPanel();
	        ysl7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ysl7.setBackground(Color.white);
	        ysl7.setLayout(new BorderLayout());
	        JButton ysl07 = new JButton(imgs[8]);
	        ysl07.setBorderPainted(false);
	        ysl07.setContentAreaFilled(false);
	        ysl07.setFocusPainted(false);
	        JLabel name9 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price9 = new JLabel("119,200원");
	        ysl7.add(ysl07,BorderLayout.NORTH);
	        ysl7.add(name9,BorderLayout.CENTER);
	        ysl7.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel ck3 = new JPanel();
	        ck3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        ck3.setBackground(Color.white);
	        ck3.setLayout(new BorderLayout());
	        JButton ck03 = new JButton(imgs[2]);
	        ck03.setBorderPainted(false);
	        ck03.setContentAreaFilled(false);
	        ck03.setFocusPainted(false);
	        JLabel name10 = new JLabel("알뤼르 옴므 스포츠 오 드 뚜왈렛");
	        JLabel price10 = new JLabel("119,200원");
	        ck3.add(ck03,BorderLayout.NORTH);
	        ck3.add(name10,BorderLayout.CENTER);
	        ck3.add(price10,BorderLayout.SOUTH);
	        name10.setHorizontalAlignment(JLabel.CENTER);
	        price10.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        

	        
	        panel01.add(chanel7);
	        panel01.add(forment1);
	        panel01.add(diptyque8);
	        panel01.add(gucci6);
	        panel01.add(ysl5);
	        panel01.add(tomford6);
	        panel01.add(bvlgari7);
	        panel01.add(jv5);
	        panel01.add(ysl7);
	        panel01.add(ck3);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new NewItems("JavaCoCo", 1000, 500);

      }
}