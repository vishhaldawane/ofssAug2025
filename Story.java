
public class Story {
	public static void main(String[] args) {
		House house = new House();
		Laundry laundry = house.someHouseHoldWork();
		laundry.showBill();
		String expense="Todays laundry bill is : "+laundry.billAmount;
		house.person.pen.write(expense);
		house.person.diary.noteDown(expense);
		house.person.diary.showExpense();
	}
}

class Pen
{
	void write(String str) {
		System.out.println("Writing..."+str);
	}
}
class ExpenseDiary
{
	String page;
	void noteDown(String str) {
		page = str;
	}
	void showExpense() {
		System.out.println("||| Expense : "+page+" |||");
	}
}
class Person
{
	Cloth cloth[] = new Cloth[5];
	Pen pen = new Pen();
	ExpenseDiary diary = new ExpenseDiary();
	
	Person() {
		cloth[0] = new Cloth("T Shirt");
		cloth[1] = new Cloth("Jeans");
		cloth[2] = new Cloth("Shirt");
		cloth[3] = new Cloth("Trouser");
		cloth[4] = new Cloth("Socks");
		
	}
	void reading() {
		System.out.println("A Person is reading book");
	}
}
class House
{
	Person person = new Person();
	WashingMachine washMachine = new WashingMachine(); //hasA
	Water water = new Water(30);
	WashingPowder powder = new WashingPowder("Tide",30);
	Electricity ele = new Electricity("Reliance",12);
	
	Laundry someHouseHoldWork() {
		person.reading();
		System.out.println("But while reading the newspaper"
				+ " realized that he has to wash his cloths....");
		return washMachine.wash(30, person.cloth, water, powder, ele);
	}
}