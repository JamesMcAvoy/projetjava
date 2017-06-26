package Blocks;

import java.awt.Image;

import Blocks.Entity;

public class Stone extends Entity implements Movable {

	public Stone(int x, int y) {
		super(x, y);
	} 

	@Override
	public int getDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDirection(int x, int y) {
		// TODO Auto-generated method stub
		
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