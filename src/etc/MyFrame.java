package etc;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("My Frame");
		setSize(500,500);
		setLocation(700,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
	}

}
