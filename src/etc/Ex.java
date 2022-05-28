package etc;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ex extends JFrame {
	private JMenuBar mb;
	private JMenu menuCategory,menuSearch,menuMyPage,menuCart;
	private JMenuItem menuItemLogIn;
	private JMenuItem menuItemJoinUs;
	private JMenuItem menuItemMyPage;


	public Ex(String title, int width, int height) {
		setTitle(title);
		setSize(width,height);
		//setLocation(700,300);
		setLocationRelativeTo(this);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container ctPane = getContentPane();        //컨텐트팬 가져오기

		ctPane.setBackground(Color.white);
		
		JPanel container = new JPanel();	//추가
		
		ImageIcon img = new ImageIcon("images/javacoco.png");
		JLabel imageLabel = new JLabel(img);

		
		makeMenu();
		
		container.add(imageLabel, BorderLayout.NORTH);	//추가
		container.add(mb, BorderLayout.SOUTH);	//추가
		
		add(imageLabel);
		setJMenuBar(mb);
		
		
		setVisible(true);
	}
	
	
	private void makeMenu() {
		mb = new JMenuBar();
		mb.setBackground(Color.white);
			
		menuCategory = new JMenu("category");
		menuCategory.addSeparator();
		menuSearch = new JMenu("search");
		
		menuMyPage = new JMenu("MyPage");
		
		menuItemLogIn = new JMenuItem("Log In");
		menuMyPage.add(menuItemLogIn);
		menuItemJoinUs = new JMenuItem("Join Us");
		menuMyPage.add(menuItemJoinUs);
		menuItemMyPage = new JMenuItem("My Page");
		menuMyPage.add(menuItemMyPage);
		
		menuCart = new JMenu("cart");
		
		mb.add(menuCategory);
		mb.add(menuSearch);
		mb.add(menuMyPage);
		mb.add(menuCart);
	
	}


	public static void main(String[] args) {
		Ex mf = new Ex("JavaCoco",500,500);
	}

}
