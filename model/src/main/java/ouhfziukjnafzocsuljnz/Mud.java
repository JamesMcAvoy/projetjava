package Elements.NotMoving;

import java.awt.Image;

public class Mud implements INotMoving {

private Image sprite;
private int Xlocation;
private int YLocation;
private location location = new location(this.Xlocation,this.YLocation);

	
    public Mud(){}

	@Override
	public Image getsprite() {
		return this.sprite;
	}

	@Override
	public location getlocation() {
		return this.location;
	}

	public void setlocation(location location) {
		this.location = location;
	}

	@Override
	public boolean breakable() {
		return true;
	}

}
