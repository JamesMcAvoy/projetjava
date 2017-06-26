package Blocks;

public interface Movable {

	public int getDirection();
	public void setDirection(int x, int y);
	public int[] getLocation();
	public void setLocation(int x, int y);
	
}