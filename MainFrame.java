package frame2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame{
	 public MainFrame(String title, int width, int height) {
	      setTitle(title);
	      setSize(width, height);
//	      setLocation(1800, 300);
	      setLocationRelativeTo(null);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // 레이아웃
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
	     
	     JPanel newPanel = new JPanel();
		 newPanel.setBackground(Color.yellow);
		 newPanel.setPreferredSize(new Dimension(1000, 300));
		 newPanel.setLocation(500, 300);
		 
		 JLabel newItemText = new JLabel("이번 달 신상품");
		 newItemText.setLayout(new BorderLayout());
		   
		 ImageIcon newitem1 = new ImageIcon("images/pf01.jpg");
	     JLabel imageLabel1 = new JLabel(newitem1);
	     imageLabel1.setPreferredSize(new Dimension(250,250));
	       
	     ImageIcon newitem2 = new ImageIcon("images/pf02.jpg");
	     JLabel imageLabel2 = new JLabel(newitem2);
	     imageLabel2.setPreferredSize(new Dimension(250,250));
	       
	     ImageIcon newitem3 = new ImageIcon("images/pf03.jpg");
	     JLabel imageLabel3 = new JLabel(newitem3);
	     imageLabel3.setPreferredSize(new Dimension(250,250));
	       
	     newPanel.add(newItemText,BorderLayout.NORTH);
	     newPanel.add(imageLabel1,BorderLayout.WEST);
	     newPanel.add(imageLabel2,BorderLayout.CENTER);
	     newPanel.add(imageLabel3,BorderLayout.EAST);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 JPanel container = new JPanel();
		 container.setLayout(new BorderLayout());
	     container.setBackground(Color.WHITE);
		 
		 ImageIcon logo = new ImageIcon("images/javacoco.png");
	     JLabel logoLabel = new JLabel(logo);
	      logoLabel.setHorizontalAlignment(JLabel.CENTER);
	      //lbl = new JLabel("JAVA COCO");
	      //lbl.setFont(new Font("Gramond", Font.BOLD, 100));
	      //lbl.setHorizontalAlignment(JLabel.CENTER);
	      
	      JMenuBar mb = new JMenuBar();
	      mb.setLayout(new FlowLayout(FlowLayout.CENTER, 235, 50));
	      mb.setBackground(Color.WHITE);

	      Font font = new Font("HY견명조", Font.BOLD, 25);
	      Font font2 = new Font("HY견명조", Font.PLAIN, 18);
	      JMenu menuCategory = new JMenu("category");
	      
	      menuCategory.setFont(font);
	     
	         
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
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       JPanel newPanel2 = new JPanel();
	       newPanel2.setLayout(new BorderLayout());
		   newPanel2.setBackground(Color.pink);
		   newPanel2.setPreferredSize(new Dimension(1000, 300));
		   newPanel2.setLocation(500, 700);
		   newPanel2.setVisible(true);
					 
		   JLabel rcmdItemText = new JLabel("추천 상품");
		   rcmdItemText.setLayout(new BorderLayout());
		      
		   ImageIcon rcmdItem = new ImageIcon("images/향수추천.PNG");
		   JLabel imageLabel01 = new JLabel(rcmdItem);
		   imageLabel01.setPreferredSize(new Dimension(200,200));
		            
		   newPanel2.add(rcmdItemText,BorderLayout.NORTH);
		   newPanel2.add(imageLabel01,BorderLayout.CENTER);
	       
	       
	       
	       panel.add(container);
	       panel.add(newPanel);
	       panel.add(newPanel2);
	    
		 
	     setVisible(true);
	 }
	

	 
	
	

	 public static void main(String[] args)
	   {
	      new MainFrame("JavaCoCo", 500, 500);

	   }

}
