package view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Menu extends JFrame implements ActionListener{
	  
	  private JPanel container = new JPanel();
	  private static JComboBox scroll = new JComboBox();
	  private JLabel label = new JLabel("Level");
	  private JButton play = new JButton("play");
	  
	  
	  public Menu(){
		  this.setTitle("Boulder Dash");
		    this.setSize(400, 550);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    
		    container.setBackground(Color.white);
		    container.setLayout(new BorderLayout());
		    
		    getScroll().setPreferredSize(new Dimension(100, 25));

		    JPanel pane = new JPanel();
		    JPanel p2 = new JPanel();
		 
		    JLabel image = new JLabel (new ImageIcon( "/Users/aymeric/desktop/projet/java/boulder_dash_Menu.jpg"));
		    
		    p2.add(image);
		    
		    pane.add(label);
		    pane.add(getScroll());
		    container.add(pane, BorderLayout.NORTH);
		    container.add(p2, BorderLayout.CENTER);
		    
		 
		    
		    play.addActionListener(this);
		    container.add(play, BorderLayout.SOUTH);
		    
		    this.setContentPane(container);
		    
		    getScroll().addItem("Level 1");
		    getScroll().addItem("Level 2");
		    getScroll().addItem("Level 3");
		    getScroll().addItem("Level 4");
		    getScroll().addItem("Level 5");
		    
		    getScroll().addItemListener(new LevelChoice());
		   
		    
		    this.setVisible(true);
	  }
	  
	  public void Level1(){
		  JFrame l1 = new JFrame();
		  	this.setTitle("Boulder Dash");
		    this.setSize(650, 500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.GRAY);
		    this.setVisible(true); 
	  }
	 
	  
	  

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == play){
			play.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level1();
			validate();
			
			}
			
		
	}

	public static JComboBox getScroll() {
		return scroll;
	}

	public void setScroll(JComboBox scroll) {
		this.scroll = scroll;
	} 
	
	  
}
