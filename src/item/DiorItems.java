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

public class DiorItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/dior01.jpg"),
			new ImageIcon("itemImages/dior02.jpg"),
			new ImageIcon("itemImages/dior03.jpg"),
			new ImageIcon("itemImages/dior04.jpg"),
			new ImageIcon("itemImages/dior05.jpg"),
			new ImageIcon("itemImages/dior06.jpg"),
			new ImageIcon("itemImages/dior07.jpg"),
			new ImageIcon("itemImages/dior08.jpg"),
			};
	
	public DiorItems(String title, int width, int height) {
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
	        
	        
	        JLabel textLabel = new JLabel("                   Dior                   ");
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel dior1 = new JPanel();
	        dior1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior1.setBackground(Color.white);
	        dior1.setLayout(new BorderLayout());
	        JButton dior01 = new JButton(imgs[0]);
	        dior01.setBorderPainted(false);
	        dior01.setContentAreaFilled(false);
	        dior01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[디올] 조이 바이 디올");
	        JLabel price1 = new JLabel("93,200원");
	        dior1.add(dior01,BorderLayout.NORTH);
	        dior1.add(name1,BorderLayout.CENTER);
	        dior1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior2 = new JPanel();
	        dior2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior2.setBackground(Color.white);
	        dior2.setLayout(new BorderLayout());
	        JButton dior02 = new JButton(imgs[1]);
	        dior02.setBorderPainted(false);
	        dior02.setContentAreaFilled(false);
	        dior02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[디올] 미스 디올 블루밍 부케");
	        JLabel price2 = new JLabel("76,400원");
	        dior2.add(dior02,BorderLayout.NORTH);
	        dior2.add(name2,BorderLayout.CENTER);
	        dior2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior3 = new JPanel();
	        dior3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior3.setBackground(Color.white);
	        dior3.setLayout(new BorderLayout());
	        JButton dior03 = new JButton(imgs[2]);
	        dior03.setBorderPainted(false);
	        dior03.setContentAreaFilled(false);
	        dior03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[디올] 쟈도르 오 드 퍼퓸 인피니심");
	        JLabel price3 = new JLabel("158,000원");
	        dior3.add(dior03,BorderLayout.NORTH);
	        dior3.add(name3,BorderLayout.CENTER);
	        dior3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior4 = new JPanel();
	        dior4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior4.setBackground(Color.white);
	        dior4.setLayout(new BorderLayout());
	        JButton dior04 = new JButton(imgs[3]);
	        dior04.setBorderPainted(false);
	        dior04.setContentAreaFilled(false);
	        dior04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[디올] 소바쥬 오 드 뚜왈렛");
	        JLabel price4 = new JLabel("140,600원");
	        dior4.add(dior04,BorderLayout.NORTH);
	        dior4.add(name4,BorderLayout.CENTER);
	        dior4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior5 = new JPanel();
	        dior5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior5.setBackground(Color.white);
	        dior5.setLayout(new BorderLayout());
	        JButton dior05 = new JButton(imgs[4]);
	        dior05.setBorderPainted(false);
	        dior05.setContentAreaFilled(false);
	        dior05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[디올] 디올 옴므 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("99,100원");
	        dior5.add(dior05,BorderLayout.NORTH);
	        dior5.add(name5,BorderLayout.CENTER);
	        dior5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior6 = new JPanel();
	        dior6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior6.setBackground(Color.white);
	        dior6.setLayout(new BorderLayout());
	        JButton dior06 = new JButton(imgs[5]);
	        dior06.setBorderPainted(false);
	        dior06.setContentAreaFilled(false);
	        dior06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[디올] 미스 디올 오리지날");
	        JLabel price6 = new JLabel("119,200원");
	        dior6.add(dior06,BorderLayout.NORTH);
	        dior6.add(name6,BorderLayout.CENTER);
	        dior6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior7 = new JPanel();
	        dior7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior7.setBackground(Color.white);
	        dior7.setLayout(new BorderLayout());
	        JButton dior07 = new JButton(imgs[6]);
	        dior07.setBorderPainted(false);
	        dior07.setContentAreaFilled(false);
	        dior07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[디올] 에스까네 포토피노");
	        JLabel price7 = new JLabel("102,600원");
	        dior7.add(dior07,BorderLayout.NORTH);
	        dior7.add(name7,BorderLayout.CENTER);
	        dior7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel dior8 = new JPanel();
	        dior8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        dior8.setBackground(Color.white);
	        dior8.setLayout(new BorderLayout());
	        JButton dior08 = new JButton(imgs[7]);
	        dior08.setBorderPainted(false);
	        dior08.setContentAreaFilled(false);
	        dior08.setFocusPainted(false);
	        JLabel name8 = new JLabel("[디올] 돌체비타");
	        JLabel price8 = new JLabel("89,500원");
	        dior8.add(dior08,BorderLayout.NORTH);
	        dior8.add(name8,BorderLayout.CENTER);
	        dior8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(dior1);
	        panel01.add(dior2);
	        panel01.add(dior3);
	        panel01.add(dior4);
	        panel01.add(dior5);
	        panel01.add(dior6);
	        panel01.add(dior7);
	        panel01.add(dior8);
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new DiorItems("JavaCoCo", 1000, 500);

      }
}
