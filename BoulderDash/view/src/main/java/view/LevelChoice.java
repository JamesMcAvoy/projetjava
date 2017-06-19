package view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

public class LevelChoice implements ItemListener{
	
	private int levelX;
	
	public LevelChoice(){
		
	}
	public void itemStateChanged(ItemEvent e) {
		
		
	    System.out.println("événement déclenché sur : " + Menu.getScroll().getSelectedItem());
		
		
	}
	
	    
}






