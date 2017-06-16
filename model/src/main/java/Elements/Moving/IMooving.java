package Elements.Moving;
import java.awt.Image;

public interface IMooving {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Image getsprite();
	public void move();
	public location getLocation();
	public void setLocation(location location);
	public boolean breakable();
	public boolean convertible();
	public int getspeed();
	public void moveLeft();
	public void moveRight();
	public void moveUp();
	public void moveDown();
	public boolean gethit();
	public void sethit(boolean hit);
	
}
