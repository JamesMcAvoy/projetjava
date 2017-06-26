package Blocks;

import java.awt.Image;

public abstract class Entity {
	
	protected int[] location;
	
	protected Image sprite;
	
	protected boolean breakable;
	
	public Entity(int x, int y) {
		int[] a = {x, y};
		this.location = a;
	}
		
	public abstract Image getsprite();

}