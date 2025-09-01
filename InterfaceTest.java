
public class InterfaceTest {
	public static void main(String[] args) {
		Mammal x = new Person();
		x.giveBirth();
		x.think();
		x.talk();
		x.react();
		
	}
}

interface Reactive {
	void react();
}
interface Responsive extends Reactive {
	void response();
}
interface Proactive extends Responsive {
	void proact();
}
class Mammal {
	void giveBirth() {
		System.out.println("Mammal giving birth...");
	}
}
class Human extends Mammal {
	void think() {
		System.out.println("Human blessed with thinking...");
	}
}
//The type Person must implement 
//the inherited abstract method Reactive.react()
class Person extends Human implements Reactive {
	void talk() {
		System.out.println("person is talking...");
	}
	public void react() {
		System.out.println("Person is reactive...");
	}
}
