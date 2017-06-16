package Elements.NotMoving;

import java.awt.Image;

public class Wall implements INotMoving {
private Image sprite;
private int Xlocation;
private int YLocation;
private location location = new location(this.Xlocation,this.YLocation);

public Wall(Image sprite, location location){
}

	@Override
	public boolean breakable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Image getsprite() {
		// TODO Auto-generated method stub
		return this.sprite;
	}

	@Override
	public location getlocation() {
		// TODO Auto-generated method stub
		return this.location;
	}

	@Override
	public void setlocation(location location) {
		location= this.location; 
	}

}
