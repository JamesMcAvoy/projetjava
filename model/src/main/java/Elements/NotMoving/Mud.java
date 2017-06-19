package Elements.NotMoving;

import java.awt.Image;


import Factory.Block;
import Factory.Location;

public class Mud extends Block implements INotMoving {
protected Location location;
protected Image sprite;
protected boolean hit;


	@Override
	public Location getlocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setlocation(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public Image getsprite() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocation(Location location) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean breakable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean convertible() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean gethit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void sethit(boolean hit) {
		// TODO Auto-generated method stub

	}

}
