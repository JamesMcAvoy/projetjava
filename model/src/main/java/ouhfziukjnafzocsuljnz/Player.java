package Elements.Moving;

import java.awt.Image;
import java.io.File;



public class Player implements IMooving {
private location location;
private	int Xlocation;
private int YLocation;	
private  int speed ;	
private Image sprite;
private Direction direction;
private boolean hit;

public Player(){
	this.setLocation(new location(this.Xlocation,this.YLocation));
	this.hit = false;
	this.direction = null;
	this.speed = 2;
}

	@Override
	public Direction getDirection() {
		return this.direction;
	}

	@Override
	public void setDirection(Direction direction) {

	}

	@Override
	public void move() {

	}

	@Override
	public boolean convertible() {
		return false;
	}

	@Override
	public int getspeed() {
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
		this.setDirection(Direction.UP);
	}

	@Override
	public void moveDown() {
		this.setDirection(Direction.DOWN);
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
	public Image getsprite() {
		return this.sprite;
	}

	@Override
	public boolean gethit() {
		return this.hit;
	}

	@Override
	public void sethit(boolean hit) {
		this.hit = hit;
	}

	@Override
	public boolean breakable() {
		return true;
	}

}
