package Elements.NotMoving;

import java.awt.Image;

public interface INotMoving {
	public boolean breakable();
	public Image getsprite();
	public location getlocation();
	public void setlocation(location location);
}
