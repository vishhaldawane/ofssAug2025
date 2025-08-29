
public class InterfaceTest {
	public static void main(String[] args) {
	
		//higher you go to chase the super class handle
		//lesser the scope of methods
		
		//lower you go to chase the sub class handle
		//wider the scope of methods
		
		Bat animal = new Bat();
		animal.eat();
		animal.swim();
		animal.giveBirth();
		
		
	}
}

interface Animal {
	void eat();
}
interface Bird extends Animal {
	void fly();
}
interface Mammal extends Animal {
	void giveBirth();
}
interface Fish extends Animal {
	void swim();
}

class Bat implements Bird,Mammal  {
	public void fly() { }
	public void giveBirth() { }
	public void eat() { }

}
class Whale implements Fish,Mammal
{
	public void swim() { }
	public void giveBirth() { }
	public void eat() { }
}

class Horse implements Mammal
{
	public void giveBirth() { }
	public void eat() { }
}


/*

					Animal
						| eat() /sleep() / reproduce() / 
		---------------------------------
		|				|			   |
		Bird		 Mammal			  Fish		
		|fly()			|giveBirth()	|swim()			 
	----------	    ---------		-----------
	|		 |*		|		|		|*		 |
 Parrot		 Bat   Human	Horse   Whale   Sword   

*/

