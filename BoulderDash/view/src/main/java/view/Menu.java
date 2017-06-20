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
	  private JButton Level1 = new JButton("Level 1");
	  private JButton Level2 = new JButton("Level 2");
	  private JButton Level3 = new JButton("Level 3");
	  private JButton Level4 = new JButton("Level 4");
	  private JButton Level5 = new JButton("Level 5");
	  private JFrame frame = new JFrame ("test");
	  
	  
	  public Menu(){
		  this.setTitle("Boulder Dash");
		  this.setSize(400, 550);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setLocationRelativeTo(null);
		    
		  container.setBackground(Color.white);
		  frame.setLayout(new BorderLayout());
		    
		
		    
		    
		  JPanel p2 = new JPanel();
		  JLabel image = new JLabel (new ImageIcon( "/Users/aymeric/desktop/projet/java/boulder_dash_Menu.jpg"));
		    
		  p2.add(image);
		  container.add(p2, BorderLayout.CENTER);
		    
	
		  container.add(Level1, BorderLayout.SOUTH);
		  Level1.setPreferredSize(new Dimension(100, 25));
		  Level1.addActionListener(this);
		     
		  container.add(Level2, BorderLayout.SOUTH);
		  Level2.setPreferredSize(new Dimension (100, 25));
		  Level2.addActionListener(this);
			  
		  container.add(Level3, BorderLayout.SOUTH);
		  Level3.setPreferredSize(new Dimension (100, 25));
		  Level3.addActionListener(this);
			  
		  container.add(Level4, BorderLayout.SOUTH);
		  Level4.setPreferredSize(new Dimension (100, 25));
		  Level4.addActionListener(this);
			  
		  container.add(Level5, BorderLayout.SOUTH);
		  Level5.setPreferredSize(new Dimension (100, 25));
		  Level5.addActionListener(this);
			  
   
		  this.setContentPane(container);
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
	  public void Level2(){
		  JFrame l1 = new JFrame();
		  	this.setTitle("Boulder Dash");
		    this.setSize(650, 500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.green);
		    this.setVisible(true); 
	  }
	  public void Level3(){
		  JFrame l1 = new JFrame();
		  	this.setTitle("Boulder Dash");
		    this.setSize(650, 500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.BLUE);
		    this.setVisible(true); 
	  }
	  public void Level4(){
		  JFrame l1 = new JFrame();
		  	this.setTitle("Boulder Dash");
		    this.setSize(650, 500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.red);
		    this.setVisible(true); 
	  }
	  public void Level5(){
		  JFrame l1 = new JFrame();
		  	this.setTitle("Boulder Dash");
		    this.setSize(650, 500);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLocationRelativeTo(null);
		    container.setBackground(Color.orange);
		    this.setVisible(true); 
	  }
	 
	  
	  

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Level1){
			Level1.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level1();
			validate();
			}
		
		else if (e.getSource() == Level2){
			Level2.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level2();
			validate();
		}
		else if (e.getSource() == Level3){
			Level3.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level3();
			validate();
		}
		else if (e.getSource() == Level4){
			Level4.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level4();
			validate();
		}
		else if (e.getSource() == Level5){
			Level5.setEnabled(false);
		
			this.setVisible(false);
			container.removeAll();
			Level5();
			validate();
		}
	}


	
	  
}
