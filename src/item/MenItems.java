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

public class MenItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/ck04.jpg"),
			new ImageIcon("itemImages/ck05.jpg"),
			new ImageIcon("itemImages/ck08.jpg"),
			new ImageIcon("itemImages/dior04.jpg"),
			new ImageIcon("itemImages/dior05.jpg"),
			new ImageIcon("itemImages/diptyque04.jpg"),
			new ImageIcon("itemImages/diptyque06.jpg"),
			new ImageIcon("itemImages/diptyque08.jpg"),
			new ImageIcon("itemImages/forment01.jpg"),
			new ImageIcon("itemImages/forment02.jpg"),
			new ImageIcon("itemImages/forment03.jpg"),
			new ImageIcon("itemImages/forment05.jpg"),
			new ImageIcon("itemImages/forment06.jpg"),
			new ImageIcon("itemImages/forment07.jpg"),
			new ImageIcon("itemImages/gucci05.jpg"),
			new ImageIcon("itemImages/gucci07.jpg"),
			new ImageIcon("itemImages/gucci09.jpg"),
			new ImageIcon("itemImages/jv05.jpg"),
			new ImageIcon("itemImages/jv07.jpg"),
			new ImageIcon("itemImages/ysl03.jpg"),
			new ImageIcon("itemImages/ysl04.jpg"),
			new ImageIcon("itemImages/ysl08.jpg"),
			new ImageIcon("itemImages/montblanc02.jpg"),
			new ImageIcon("itemImages/montblanc05.jpg"),
			new ImageIcon("itemImages/montblanc06.jpg"),
			new ImageIcon("itemImages/montblanc07.jpg"),
			new ImageIcon("itemImages/montblanc09.jpg"),
			};
	
	private String[] name = {
			new String("[캘빈클라인] 이터니티 에어 포맨"),
			new String("[캘빈클라인] 디파이 EDT"),
			new String("[캘빈클라인] CK ONE 향수 오드 뚜왈렛 EDT"),
			new String("[디올] 소바쥬 오 드 뚜왈렛"),
			new String("[디올] 디올 옴므 오 드 뚜왈렛"),
			new String("[딥디크] 오 드 퍼퓸 오르페옹렛"),
			new String("[딥디크] 오 드 뚜왈렛 오 데 썽"),
			new String("[딥디크] 롬브르 단 로 오 드 뚜왈렛"),
			new String("[포맨트] 시그니처 퍼퓸 코튼허그"),
			new String("[포맨트] 시그니처 퍼퓸 코튼허그 백야 에디션"),
			new String("[포맨트] 시그니처 퍼퓸 코튼메모리 벚꽃 에디션"),
			new String("[포맨트] 시그니처 퍼퓸 코튼 디어 나잇"),
			new String("[포맨트] 시그니처 퍼퓸 코튼 딜라잇부케"),
			new String("[포맨트] 시그니처 퍼퓸 코튼 썩세스"),
			new String("[구찌 알케미스트 가든] A Midnight Stroll"),
			new String("[구찌 블룸] 프로푸모 디 피오리 오 드 퍼퓸"),
			new String("[구찌 알케미스트 가든] 1921"),
			new String("[존바바토스] 아티 산 아쿠아"),
			new String("[존바바토스] 닉 조나스 블루"),
			new String("[입생로랑] 몽 파리 인텐스 오 드 빠르펭"),
			new String("[입생로랑] 리브르 오 드 빠르펭"),
			new String("[입생로랑] 리브르 헤어 미스트"),
			new String("[몽블랑] 레전드 스피릿 오드뚜왈렛 EDT"),
			new String("[몽블랑] 익스플로러 울트라 블루 오드퍼퓸"),
			new String("[몽블랑] 엠블럼 오드뚜왈렛 EDT"),
			new String("[몽블랑] 레전드 나이트 오 드 퍼퓸"),
			new String("[몽블랑] 시그니처 포 우먼 오드퍼퓸"),
	};
	
	private String[] price = {
			new String("63,900원"),
			new String("49,800원"),
			new String("59,400원"),
			new String("140,600원"),
			new String("99,100원"),
			new String("119,200원"),
			new String("173,900원"),
			new String("184,800원"),
			new String("55,600원"),
			new String("78,800원"),
			new String("68,400원"),
			new String("58,100원"),
			new String("57,900원"),
			new String("59,000원"),
			new String("450,000원"),
			new String("108,400원"),
			new String("399,000원"),
			new String("31,400원"),
			new String("90,300"),
			new String("89,900원"),
			new String("98,000원"),
			new String("58,800원"),
			new String("51,900원"),
			new String("44,600원"),
			new String("79,900원"),
			new String("48,500원"),
			new String("57,200원"),

	};
	
	
	public MenItems(String title, int width, int height) {
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
	        panel.setPreferredSize(new Dimension(400, 2800));   // 패널에 사이즈 설정 
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
	        
	        
	        JLabel textLabel = new JLabel("               MEN               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 2200));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(9,3));
	        
	        
	        for (int i = 0; i < 27; i++) {
				
				
		        JPanel p = new JPanel();
		        p.setPreferredSize(new Dimension(200, 300));   // 패널에 사이즈 설정 
		        p.setBackground(Color.white);
		        p.setLayout(new BorderLayout());
		        JButton itemImage = new JButton(imgs[i]);
		        itemImage.setBorderPainted(false);
		        itemImage.setContentAreaFilled(false);
		        itemImage.setFocusPainted(false);
		        JLabel itemName = new JLabel(name[i]);
		        JLabel itemPrice = new JLabel(price[i]);
		        p.add(itemImage,BorderLayout.NORTH);
		        p.add(itemName,BorderLayout.CENTER);
		        p.add(itemPrice,BorderLayout.SOUTH);
		        itemName.setHorizontalAlignment(JLabel.CENTER);
		        itemPrice.setHorizontalAlignment(JLabel.CENTER);
		        
		        panel01.add(p);
		        
		        }
	        
	        
	        
	        panel.add(container);
	        panel.add(textLabel);
	        panel.add(panel01);
	        
	        setVisible(true);
	        
	}

	
    public static void main(String[] args)
      {
    	new MenItems("JavaCoCo", 1000, 500);

      }
}