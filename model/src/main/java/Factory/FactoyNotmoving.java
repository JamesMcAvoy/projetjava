package Factory;


import Elements.NotMoving.Magicwall;
import Elements.NotMoving.Mud;
import Elements.NotMoving.Wall;

public class FactoyNotmoving extends ObjectFactory {

	public Mud createMud() {
		return (new Mud());
	}

	public Wall  createWall(){
	 return (new Wall());
	}
	
	public Magicwall createMagicwall(){
	return (new Magicwall());
	}
}
