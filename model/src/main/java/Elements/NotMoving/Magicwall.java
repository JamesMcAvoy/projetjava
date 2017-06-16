package Elements.NotMoving;

import java.awt.Image;

public class Magicwall implements INotMoving {
	private Image sprite;
	private int Xlocation;
	private int YLocation;
	private location location = new location(Xlocation,YLocation);
	
	@Override
	public boolean breakable() {
		return true;
	}

	@Override
	public Image getsprite() {
		return this.sprite;
	}

	@Override
	public location getlocation() {
		return this.location;
	}

	@Override
	public void setlocation(location location) {
		this.location = location;
		
	}

}
