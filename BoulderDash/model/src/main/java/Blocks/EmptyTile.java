package Blocks;

import java.awt.Image;

import Blocks.Entity;

public class EmptyTile extends Entity implements NotMovable {
	
	public EmptyTile(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Image getsprite() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public int[] getLocation() {
		int[] a = {0, 0};
		return a;
	}
	
	public void setLocation(int x, int y) {
		
	}

}