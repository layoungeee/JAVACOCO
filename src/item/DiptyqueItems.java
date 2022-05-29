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

public class DiptyqueItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/diptyque01.jpg"),
			new ImageIcon("itemImages/diptyque02.jpg"),
			new ImageIcon("itemImages/diptyque03.jpg"),
			new ImageIcon("itemImages/diptyque04.jpg"),
			new ImageIcon("itemImages/diptyque05.jpg"),
			new ImageIcon("itemImages/diptyque06.jpg"),
			new ImageIcon("itemImages/diptyque07.jpg"),
			new ImageIcon("itemImages/diptyque08.jpg"),
			new ImageIcon("itemImages/diptyque09.jpg"),
			};
	
	public DiptyqueItems(String title, int width, int height) {
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
	        
	        
	        
	        
	        JLabel textLabel = new JLabel("               Diptyque               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 800));
	        panel01.setBackground(Color.WHITE);
	        panel01.setLayout(new GridLayout(3,3));
	        
	        
	        
	        
	        JPanel diptyque1 = new JPanel();
	        diptyque1.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque1.setBackground(Color.white);
	        diptyque1.setLayout(new BorderLayout());
	        JButton diptyque01 = new JButton(imgs[0]);
	        diptyque01.setBorderPainted(false);
	        diptyque01.setContentAreaFilled(false);
	        diptyque01.setFocusPainted(false);
	        JLabel name1 = new JLabel("[딥디크] 오드 뚜왈렛");
	        JLabel price1 = new JLabel("128,000원");
	        diptyque1.add(diptyque01,BorderLayout.NORTH);
	        diptyque1.add(name1,BorderLayout.CENTER);
	        diptyque1.add(price1,BorderLayout.SOUTH);
	        name1.setHorizontalAlignment(JLabel.CENTER);
	        price1.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque2 = new JPanel();
	        diptyque2.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque2.setBackground(Color.white);
	        diptyque2.setLayout(new BorderLayout());
	        JButton diptyque02 = new JButton(imgs[1]);
	        diptyque02.setBorderPainted(false);
	        diptyque02.setContentAreaFilled(false);
	        diptyque02.setFocusPainted(false);
	        JLabel name2 = new JLabel("[딥디크] 리미티드 에디션 오드 뚜왈렛 도손");
	        JLabel price2 = new JLabel("210,000원");
	        diptyque2.add(diptyque02,BorderLayout.NORTH);
	        diptyque2.add(name2,BorderLayout.CENTER);
	        diptyque2.add(price2,BorderLayout.SOUTH);
	        name2.setHorizontalAlignment(JLabel.CENTER);
	        price2.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque3 = new JPanel();
	        diptyque3.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque3.setBackground(Color.white);
	        diptyque3.setLayout(new BorderLayout());
	        JButton diptyque03 = new JButton(imgs[2]);
	        diptyque03.setBorderPainted(false);
	        diptyque03.setContentAreaFilled(false);
	        diptyque03.setFocusPainted(false);
	        JLabel name3 = new JLabel("[딥디크] 베티베리오 오드 뚜왈렛");
	        JLabel price3 = new JLabel("119,200원");
	        diptyque3.add(diptyque03,BorderLayout.NORTH);
	        diptyque3.add(name3,BorderLayout.CENTER);
	        diptyque3.add(price3,BorderLayout.SOUTH);
	        name3.setHorizontalAlignment(JLabel.CENTER);
	        price3.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque4 = new JPanel();
	        diptyque4.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque4.setBackground(Color.white);
	        diptyque4.setLayout(new BorderLayout());
	        JButton diptyque04 = new JButton(imgs[3]);
	        diptyque04.setBorderPainted(false);
	        diptyque04.setContentAreaFilled(false);
	        diptyque04.setFocusPainted(false);
	        JLabel name4 = new JLabel("[딥디크] 오 드 퍼퓸 오르페옹");
	        JLabel price4 = new JLabel("119,200원");
	        diptyque4.add(diptyque04,BorderLayout.NORTH);
	        diptyque4.add(name4,BorderLayout.CENTER);
	        diptyque4.add(price4,BorderLayout.SOUTH);
	        name4.setHorizontalAlignment(JLabel.CENTER);
	        price4.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque5 = new JPanel();
	        diptyque5.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque5.setBackground(Color.white);
	        diptyque5.setLayout(new BorderLayout());
	        JButton diptyque05 = new JButton(imgs[4]);
	        diptyque05.setBorderPainted(false);
	        diptyque05.setContentAreaFilled(false);
	        diptyque05.setFocusPainted(false);
	        JLabel name5 = new JLabel("[딥디크] 필로시코스 오 드 뚜왈렛");
	        JLabel price5 = new JLabel("194,800원");
	        diptyque5.add(diptyque05,BorderLayout.NORTH);
	        diptyque5.add(name5,BorderLayout.CENTER);
	        diptyque5.add(price5,BorderLayout.SOUTH);
	        name5.setHorizontalAlignment(JLabel.CENTER);
	        price5.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque6 = new JPanel();
	        diptyque6.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque6.setBackground(Color.white);
	        diptyque6.setLayout(new BorderLayout());
	        JButton diptyque06 = new JButton(imgs[5]);
	        diptyque06.setBorderPainted(false);
	        diptyque06.setContentAreaFilled(false);
	        diptyque06.setFocusPainted(false);
	        JLabel name6 = new JLabel("[딥디크] 오 드 뚜왈렛 오 데 썽");
	        JLabel price6 = new JLabel("173,900원");
	        diptyque6.add(diptyque06,BorderLayout.NORTH);
	        diptyque6.add(name6,BorderLayout.CENTER);
	        diptyque6.add(price6,BorderLayout.SOUTH);
	        name6.setHorizontalAlignment(JLabel.CENTER);
	        price6.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque7 = new JPanel();
	        diptyque7.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque7.setBackground(Color.white);
	        diptyque7.setLayout(new BorderLayout());
	        JButton diptyque07 = new JButton(imgs[6]);
	        diptyque07.setBorderPainted(false);
	        diptyque07.setContentAreaFilled(false);
	        diptyque07.setFocusPainted(false);
	        JLabel name7 = new JLabel("[딥디크] 오 드 뚜왈렛 오에도");
	        JLabel price7 = new JLabel("113,900원");
	        diptyque7.add(diptyque07,BorderLayout.NORTH);
	        diptyque7.add(name7,BorderLayout.CENTER);
	        diptyque7.add(price7,BorderLayout.SOUTH);
	        name7.setHorizontalAlignment(JLabel.CENTER);
	        price7.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque8 = new JPanel();
	        diptyque8.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque8.setBackground(Color.white);
	        diptyque8.setLayout(new BorderLayout());
	        JButton diptyque08 = new JButton(imgs[7]);
	        diptyque08.setBorderPainted(false);
	        diptyque08.setContentAreaFilled(false);
	        diptyque08.setFocusPainted(false);
	        JLabel name8 = new JLabel("[딥디크] 롬브르 단 로 오 드 뚜왈렛");
	        JLabel price8 = new JLabel("184,800원");
	        diptyque8.add(diptyque08,BorderLayout.NORTH);
	        diptyque8.add(name8,BorderLayout.CENTER);
	        diptyque8.add(price8,BorderLayout.SOUTH);
	        name8.setHorizontalAlignment(JLabel.CENTER);
	        price8.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        JPanel diptyque9 = new JPanel();
	        diptyque9.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
	        diptyque9.setBackground(Color.white);
	        diptyque9.setLayout(new BorderLayout());
	        JButton diptyque09 = new JButton(imgs[8]);
	        diptyque09.setBorderPainted(false);
	        diptyque09.setContentAreaFilled(false);
	        diptyque09.setFocusPainted(false);
	        JLabel name9 = new JLabel("[딥디크] 도손");
	        JLabel price9 = new JLabel("129,000원");
	        diptyque9.add(diptyque09,BorderLayout.NORTH);
	        diptyque9.add(name9,BorderLayout.CENTER);
	        diptyque9.add(price9,BorderLayout.SOUTH);
	        name9.setHorizontalAlignment(JLabel.CENTER);
	        price9.setHorizontalAlignment(JLabel.CENTER);
	        
	        
	        
	        panel01.add(diptyque1);
	        panel01.add(diptyque2);
	        panel01.add(diptyque3);
	        panel01.add(diptyque4);
	        panel01.add(diptyque5);
	        panel01.add(diptyque6);
	        panel01.add(diptyque7);
	        panel01.add(diptyque8);
	        panel01.add(diptyque9);
	        
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new DiptyqueItems("JavaCoCo", 1000, 500);

      }
}