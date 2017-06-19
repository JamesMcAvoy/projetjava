package Elements.NotMoving;

import java.awt.Image;

import Factory.Block;
import Factory.Location;

public class Wall extends Block implements INotMoving {
	
	protected Location location;
	protected Image sprite;
	protected boolean hit;

	@Override
	public Location getlocation() {
		return location;
	}

	@Override
	public void setlocation(Location location) {
		this.location = location;

	}

	@Override
	public Image getsprite() {
		return null;
	}

	@Override
	public Location getLocation() {
		return location;
	}

	@Override
	public void setLocation(Location location) {
		this.location = location;

	}

	@Override
	public boolean breakable() {
		return false;
	}

	@Override
	public boolean convertible() {
		return false;
	}

	@Override
	public boolean gethit() {
		return hit;
	}

	@Override
	public void sethit(boolean hit) {
		this.hit = hit;

	}

}
