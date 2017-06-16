package Elements.Moving;


;

public interface IMooving {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public void move();
	public void moveLeft();
	public void moveRight();
	public void moveUp();
	public void moveDown();	
}
