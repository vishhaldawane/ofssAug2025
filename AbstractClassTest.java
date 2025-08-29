
public class AbstractClassTest {
	public static void main(String[] args) {
		StringBasedMusicalInstrument stringInstrument= new Violin();
		stringInstrument.tuneStrings();
		stringInstrument.play();
	}
}

//an abstract class may or may not have abstract methods
abstract class MusicalInstrument // <-- with partial contract
{
	abstract void play(); //partial contract | optional | not mandatory
	//but abstract methods must reside in an abstract class
	//above method is a mandate for its non-abstract immediate children
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{ //for abstract child its NOT at all a compulsion to implement the contracts of the abstract parent
	abstract void tuneStrings();
}
//The type Guitar "must" implement the inherited abstract method MusicalInstrument.play()
//The type Guitar must implement the inherited abstract method StringBasedMusicalInstrument.tuneStrings()
class Guitar extends StringBasedMusicalInstrument //non-abstract
{
	void play() { //mandate is fulfilled
		System.out.println("Playing Guitar....");
	}
	void tuneStrings() { //mandate is fulfilled
		System.out.println("Tuning the Strings of a Guitar....");
	}
}

class Violin extends StringBasedMusicalInstrument //non-abstract
{
	void play() { //mandate is fulfilled
		System.out.println("Playing Violin....");
	}
	void tuneStrings() { //mandate is fulfilled
		System.out.println("Tuning the Strings of a Violin....");
	}
}

class Sitar extends StringBasedMusicalInstrument //non-abstract
{
	void play() { //mandate is fulfilled
		System.out.println("Playing Sitar....");
	}
	void tuneStrings() { //mandate is fulfilled
		System.out.println("Tuning the Strings of a Sitar....");
	}
}


class ElectronicGuitar extends Guitar //non-abstract
{
	void play() { //not mandatory | it is overridden and that is optional
		System.out.println("Playing ElectronicGuitar..with presets......");
	}
	void tuneStrings() { //not mandatory | it is overridden and that is optional
		System.out.println("Tuning the Strings of a ElectronicGuitar....");
	}
}

// AirBasedInstrument
// DrumBasedInstrument
// also innovate another sibling for MusicalInstrument 

/*
 * 
 * 										?
 * 										|
 * 						-------------------------------------
 						|									|
 				MusicalInstrument							?
 						|									|
 			-------------------------			---------------------------
 			|			|			|			|			|			|
 			SBMI		ABMI		DBMI		?			?			?
 			|			|			|	
 			Guitar		?			?
 			Sitar		?			?
 			Violin		?			?
 */


abstract class Account {
	
}