package projet.tilegame.display;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.*;

public class Display {

	private JFrame frame;
	private Canvas canvas;
	
	private int width, height;
	private String title;
	
	public Display(String title, int width, int height){
		this.title = title;
		this.width = width;
		this.height= height;
		
		createDisplay();
	}
	
	/**
	 * Create the Window for the game 
	 */
	private void createDisplay(){
		
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension (width, height));
		canvas.setMaximumSize(new Dimension (width, height));
		canvas.setMinimumSize(new Dimension (width, height));
		canvas.setFocusable(false);
		
		frame.add(canvas);
		frame.pack();
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public Canvas getCanvas(){
		return canvas;
	}
	
	public JFrame getFrame(){
		return frame;
	}
}
