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

public class LanvinItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/lanvin01.jpg"),
			new ImageIcon("itemImages/lanvin02.jpg"),
			new ImageIcon("itemImages/lanvin03.jpg"),
			new ImageIcon("itemImages/lanvin04.jpg"),
			new ImageIcon("itemImages/lanvin05.jpg"),
			new ImageIcon("itemImages/lanvin06.jpg"),
			new ImageIcon("itemImages/lanvin07.jpg"),
			new ImageIcon("itemImages/lanvin08.jpg"),
			};
	
	public LanvinItems(String title, int width, int height) {
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
	        
	        
	        
	        
	        JLabel textLabel = new JLabel("                Lanvin                ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel lanvin1 = new JPanel();
	        lanvin1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin1.setBackground(Color.white);
	        lanvin1.setLayout(new BorderLayout());
	        JButton lanvin01 = new JButton(imgs[0]);
	        lanvin01.setBorderPainted(false);
	        lanvin01.setContentAreaFilled(false);
	        lanvin01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[랑방] 모던 프린세스 블루밍");
	        JLabel price1 = new JLabel("51,800원");
	        lanvin1.add(lanvin01,BorderLayout.NORTH);
	        lanvin1.add(name1,BorderLayout.CENTER);
	        lanvin1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin2 = new JPanel();
	        lanvin2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin2.setBackground(Color.white);
	        lanvin2.setLayout(new BorderLayout());
	        JButton lanvin02 = new JButton(imgs[1]);
	        lanvin02.setBorderPainted(false);
	        lanvin02.setContentAreaFilled(false);
	        lanvin02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[랑방] 모던 프린세스 오드퍼퓸");
	        JLabel price2 = new JLabel("62,900원");
	        lanvin2.add(lanvin02,BorderLayout.NORTH);
	        lanvin2.add(name2,BorderLayout.CENTER);
	        lanvin2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin3 = new JPanel();
	        lanvin3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin3.setBackground(Color.white);
	        lanvin3.setLayout(new BorderLayout());
	        JButton lanvin03 = new JButton(imgs[2]);
	        lanvin03.setBorderPainted(false);
	        lanvin03.setContentAreaFilled(false);
	        lanvin03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[랑방] 메리미 우먼 오드퍼퓸");
	        JLabel price3 = new JLabel("49,900원");
	        lanvin3.add(lanvin03,BorderLayout.NORTH);
	        lanvin3.add(name3,BorderLayout.CENTER);
	        lanvin3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin4 = new JPanel();
	        lanvin4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin4.setBackground(Color.white);
	        lanvin4.setLayout(new BorderLayout());
	        JButton lanvin04 = new JButton(imgs[3]);
	        lanvin04.setBorderPainted(false);
	        lanvin04.setContentAreaFilled(false);
	        lanvin04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[랑방] 에끌라 드 아르페쥬 우먼 오드퍼퓸");
	        JLabel price4 = new JLabel("39,500원");
	        lanvin4.add(lanvin04,BorderLayout.NORTH);
	        lanvin4.add(name4,BorderLayout.CENTER);
	        lanvin4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin5 = new JPanel();
	        lanvin5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin5.setBackground(Color.white);
	        lanvin5.setLayout(new BorderLayout());
	        JButton lanvin05 = new JButton(imgs[4]);
	        lanvin05.setBorderPainted(false);
	        lanvin05.setContentAreaFilled(false);
	        lanvin05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[랑방] 잔느 우먼 오드퍼퓸");
	        JLabel price5 = new JLabel("39,400원");
	        lanvin5.add(lanvin05,BorderLayout.NORTH);
	        lanvin5.add(name5,BorderLayout.CENTER);
	        lanvin5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin6 = new JPanel();
	        lanvin6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin6.setBackground(Color.white);
	        lanvin6.setLayout(new BorderLayout());
	        JButton lanvin06 = new JButton(imgs[5]);
	        lanvin06.setBorderPainted(false);
	        lanvin06.setContentAreaFilled(false);
	        lanvin06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[랑방] 에끌라 드 아르페쥬 쉬어 오 드 뚜왈렛");
	        JLabel price6 = new JLabel("35,100원");
	        lanvin6.add(lanvin06,BorderLayout.NORTH);
	        lanvin6.add(name6,BorderLayout.CENTER);
	        lanvin6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin7 = new JPanel();
	        lanvin7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin7.setBackground(Color.white);
	        lanvin7.setLayout(new BorderLayout());
	        JButton lanvin07 = new JButton(imgs[6]);
	        lanvin07.setBorderPainted(false);
	        lanvin07.setContentAreaFilled(false);
	        lanvin07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[랑방] 에끌라 드 아르페쥬 뿌르옴므 오 드 뚜왈렛");
	        JLabel price7 = new JLabel("51,800원");
	        lanvin7.add(lanvin07,BorderLayout.NORTH);
	        lanvin7.add(name7,BorderLayout.CENTER);
	        lanvin7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel lanvin8 = new JPanel();
	        lanvin8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        lanvin8.setBackground(Color.white);
	        lanvin8.setLayout(new BorderLayout());
	        JButton lanvin08 = new JButton(imgs[7]);
	        lanvin08.setBorderPainted(false);
	        lanvin08.setContentAreaFilled(false);
	        lanvin08.setFocusPainted(false);
	        JLabel name8 = new JLabel("[랑방] 루머2 로즈 우먼 오드퍼퓸 EDP");
	        JLabel price8 = new JLabel("34,900원");
	        lanvin8.add(lanvin08,BorderLayout.NORTH);
	        lanvin8.add(name8,BorderLayout.CENTER);
	        lanvin8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(lanvin1);
	        panel01.add(lanvin2);
	        panel01.add(lanvin3);
	        panel01.add(lanvin4);
	        panel01.add(lanvin5);
	        panel01.add(lanvin6);
	        panel01.add(lanvin7);
	        panel01.add(lanvin8);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new LanvinItems("JavaCoCo", 1000, 500);

      }
}