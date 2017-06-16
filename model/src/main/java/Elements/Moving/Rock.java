package Elements.Moving;

import java.awt.Image;
import java.io.File;

public class Rock implements IMooving {
private boolean hit;
private location location;
private	int Xlocation;
private int YLocation;	
private int speed;	
private Image sprite;
private Direction direction;
public Rock(){
	this.location = new location(Xlocation,YLocation);
	this.hit = false;
	this.speed = 1;
	this.direction = null;
}
	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return this.direction;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;

	}

	@Override
	public Image getsprite() {
		// TODO Auto-generated method stub
		return this.sprite;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean convertible() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int getspeed() {
		// TODO Auto-generated method stub
		return this.speed;
	}

	@Override
	public void moveLeft() {
		this.setDirection(Direction.LEFT);

	}

	@Override
	public void moveRight() {
		this.setDirection(Direction.RIGHT);

	}

	@Override
	public void moveUp() {
		this.setDirection(null);

	}

	@Override
	public void moveDown() {
		this.setDirection(Direction.DOWN);

	}
	@Override
	public boolean gethit() {
		return this.hit;
	}
	@Override
	public void sethit(boolean hit) {
		this.hit = true;
	}
	@Override
	public location getLocation() {
		return this.location;
	}
	@Override
	public void setLocation(location location) {
		this.location = location;
	}
	@Override
	public boolean breakable() {
		// TODO Auto-generated method stub
		return false;
	}

}
