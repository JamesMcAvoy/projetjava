package Factory;

import java.awt.Image;


public abstract class Block {
	
protected Location location;
protected Image sprite;
protected boolean hit;
	
public abstract Image getsprite();
public abstract Location getLocation();
public abstract void setLocation(Location location);
public abstract boolean breakable();
public abstract boolean convertible();
public int getspeed(){
	return this.getspeed();
}
public abstract boolean gethit();
public abstract void sethit(boolean hit);
}
