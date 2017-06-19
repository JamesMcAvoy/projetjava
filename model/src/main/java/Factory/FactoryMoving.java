package Factory;

import Elements.Moving.Diamons;
import Elements.Moving.Rock;

public class FactoryMoving extends ObjectFactory {

	public Diamons creatediamons() {
		return (new Diamons());
	}

	public Rock  createrock(){
	 return (new Rock());
	}
}
