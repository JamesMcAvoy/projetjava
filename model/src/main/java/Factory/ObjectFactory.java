package Factory;

public abstract class ObjectFactory {
	
 public FactoyNotmoving createNotmoving(){
	 return (new FactoyNotmoving());
 }
 public FactoryMoving createmoving(){
	 return (new FactoryMoving());
 }
}
	


