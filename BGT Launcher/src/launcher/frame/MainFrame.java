package launcher.frame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainFrame extends JFrame implements ActionListener{

	public static final int width = 800;
	public static final int height = 600;
	
	public MainFrame(){
		Dimension screen = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(width, height);
		this.setLocation((screen.width/2)-(width/2), (screen.height/2)-(height/2));
		
		
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action: "+e.getActionCommand());
	}
	

}