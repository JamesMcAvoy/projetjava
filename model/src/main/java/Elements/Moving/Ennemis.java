package Elements.Moving;

import java.awt.Image;

public class Ennemis implements IMooving {
	private location location;
	private	int Xlocation;
	private int YLocation;	
	private  int speed ;	
	private Image sprite;
	private Direction direction;
	private boolean hit;

public Ennemis(){
		this.setLocation(new location(this.Xlocation,this.YLocation));
		this.hit = false;
		this.direction = null;
		this.speed = 1;
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
		this.setDirection(Direction.UP);

	}

	@Override
	public void moveDown() {
		this.setDirection(Direction.DOWN);

	}

	@Override
	public boolean gethit() {
		// TODO Auto-generated method stub
		return this.hit;
	}

	@Override
	public void sethit(boolean hit) {
		this.hit = hit;

	}
	@Override
	public location getLocation() {
		return location;
	}
	@Override
	public void setLocation(location location) {
		this.location = location;
	}
	@Override
	public boolean breakable() {
		// TODO Auto-generated method stub
		return true;
	}

}
