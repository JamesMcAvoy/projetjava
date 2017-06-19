package Elements.Moving;

import java.awt.Image;

import Factory.Location;

public abstract class Entity {
	protected Location location;
	protected Image sprite;
	protected boolean hit;
	protected Direction direction;
	protected int speed;
	
	public abstract Image getsprite();
	public abstract boolean breakable();
	public abstract boolean convertible();
	public int getspeed(){
		return this.getspeed();
	}
	public abstract boolean gethit();
	public abstract void sethit(boolean hit);
}
