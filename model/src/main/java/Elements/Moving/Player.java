package Elements.Moving;

import java.awt.Image;

import Factory.Location;

public class Player extends Entity implements IMooving {
	protected Location location;
	protected Image sprite;
	protected boolean hit;
	protected Direction direction;
	protected int speed;

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
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
	public Image getsprite() {
		// TODO Auto-generated method stub
		return null;
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
