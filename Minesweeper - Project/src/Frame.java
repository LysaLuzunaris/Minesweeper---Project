import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{

	
	private static final long serialVersionUID = 1L;
	private static int width = 400;
	private static int height = 400;
	private Screen screen;
	
	public Frame()
	{
		
		super("Minesweeper");
		setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		
		screen=new Screen();
		add(screen);
		setSize(width+getInsets().left, height+getInsets().right);
		
		setResizable(false);
		setVisible(true);
		
	}
	public class Screen extends JPanel
	{

		public void paintComponent(Graphics g)
		{
		g.fillRect(0, 0, 50, height);
		
	}
	
	
}
}
