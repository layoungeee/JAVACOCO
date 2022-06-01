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

public class WomenItems extends JFrame {
	
	private ImageIcon[] imgs = {
			new ImageIcon("itemImages/bvlgari01.jpg"),
			new ImageIcon("itemImages/bvlgari03.jpg"),
			new ImageIcon("itemImages/chanel01.jpg"),
			new ImageIcon("itemImages/chanel03.jpg"),
			new ImageIcon("itemImages/chanel04.jpg"),
			new ImageIcon("itemImages/chanel05.jpg"),
			new ImageIcon("itemImages/dior01.jpg"),
			new ImageIcon("itemImages/dior02.jpg"),
			new ImageIcon("itemImages/dior03.jpg"),
			new ImageIcon("itemImages/dior06.jpg"),
			new ImageIcon("itemImages/dior07.jpg"),
			new ImageIcon("itemImages/dior08.jpg"),
			new ImageIcon("itemImages/diptyque01.jpg"),
			new ImageIcon("itemImages/diptyque03.jpg"),
			new ImageIcon("itemImages/diptyque05.jpg"),
			new ImageIcon("itemImages/diptyque07.jpg"),
			new ImageIcon("itemImages/diptyque09.jpg"),
			new ImageIcon("itemImages/forment04.jpg"),
			new ImageIcon("itemImages/forment08.jpg"),
			new ImageIcon("itemImages/gucci01.jpg"),
			new ImageIcon("itemImages/gucci03.jpg"),
			new ImageIcon("itemImages/gucci06.jpg"),
			new ImageIcon("itemImages/gucci08.jpg"),
			};
	
	private String[] name = {
			new String("[불가리] 옴니아 핑크 사파이어 오 드 뚜왈렛"),
			new String("[불가리] 옴니아 아메시스트 오 드 뚜왈렛"),
			new String("[샤넬] 샹스 오 땅드르 오 드 빠르펭"),
			new String("[샤넬] N°5 오 드 빠르펭"),
			new String("[샤넬] 가브리엘 샤넬 에센스 오 드 빠르펭"),
			new String("[샤넬] 파리 리비에라 레 조 드 샤넬 오 드 뚜왈렛"),
			new String("[디올] 조이 바이 디올"),
			new String("[디올] 미스 디올 블루밍 부케"),
			new String("[디올] 쟈도르 오 드 퍼퓸 인피니심"),
			new String("[디올] 미스 디올 오리지날"),
			new String("[디올] 에스까네 포토피노T"),
			new String("[디올] 돌체비타"),
			new String("[딥디크] 오드 뚜왈렛"),
			new String("[딥디크] 베티베리오 오드 뚜왈렛"),
			new String("[딥디크] 필로시코스 오 드 뚜왈렛"),
			new String("[딥디크] 오 드 뚜왈렛 오에도"),
			new String("[딥디크] 도손"),
			new String("[포맨트] 시그니처 퍼퓸 코튼 브리즈"),
			new String("[포맨트] 시그니처 퍼퓸 코튼키스"),
			new String("[구찌 블룸] 오 드 퍼퓸"),
			new String("[구찌 블룸] 네타레 디 피오리 오 드 퍼퓸"),
			new String("[구찌 플로라] 골저스 가드니아 오 드 퍼퓸"),
			new String("[구찌 알케미스트 가든] A Chant for the Nymph"),
	};
	
	private String[] price = {
			new String("134,000원"),
			new String("154,600원"),
			new String("119,200원"),
			new String("123,000원"),
			new String("113,100원"),
			new String("98,100원"),
			new String("93,200원"),
			new String("76,400원"),
			new String("158,000원"),
			new String("119,200원"),
			new String("102,600원"),
			new String("89,500원"),
			new String("128,000원"),
			new String("119,200원"),
			new String("194,800원"),
			new String("113,900원"),
			new String("129,000원"),
			new String("39,900원"),
			new String("39,000원"),
			new String("143,900원"),
			new String("88,900원"),
			new String("145,000원"),
			new String("390,000원"),	//23
	};
	
	
	public WomenItems(String title, int width, int height) {
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
	        panel.setPreferredSize(new Dimension(400, 2600));   // 패널에 사이즈 설정 
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
	        
	        
	        JLabel textLabel = new JLabel("               WOMEN               ");
	        textLabel.setHorizontalAlignment(JLabel.CENTER);
	        textLabel.setFont(new Font(" ", ABORT, 50));
	        
	        
	      //상품 정렬
	        JPanel panel01 = new JPanel();
	        panel01.setPreferredSize(new Dimension(1400, 2000));
		    panel01.setBackground(Color.white);
	        panel01.setLayout(new GridLayout(8,3));
	        
	        
	        
	        for (int i = 0; i < 23; i++) {
				
				
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
    	new WomenItems("JavaCoCo", 1000, 500);

      }
}