package Factory;

import Elements.NotMoving.MagicWall;
import Elements.NotMoving.Mud;
import Elements.NotMoving.Wall;

public class FactoyNotmoving extends ObjectFactory {

	public Mud createMud() {
		return (new Mud());
	}

	public Wall  createWall(){
	 return (new Wall());
	}
	
	public MagicWall createMagicwall(){
	return (new MagicWall());
	}
}
