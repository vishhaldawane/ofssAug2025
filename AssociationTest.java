import java.util.Arrays;

public class AssociationTest {
	public static void main(String[] args) {
		System.out.println("Begin...");
		
		WashingMachine washingMachine = new WashingMachine();
		
		Cloth cloth[] = {
				new Cloth("T Shirt"),
				new Cloth("Jeans"),
				new Cloth("Shirt"),
				new Cloth("Trouser"),
				new Cloth("Ladies T Shirt"),
				new Cloth("Ladies Jeans"),
				new Cloth("Ladies Shirt"),
				new Cloth("Ladies Trouser")
				
		};
		
		//we are about to pass below 3 objects into the wash method args
		Water water = new Water(100);
		WashingPowder washPowder =new WashingPowder("Surf Excel",60);
		Electricity electricity = new Electricity("Reliance",6);
		
		Laundry laundry = washingMachine.wash(15, cloth, water, washPowder, electricity);// invoke it, call it, run it
		laundry.showBill();
		System.out.println("End....");
	}
}

class Machine
{
	
}


class WashingMachine extends Machine //isA
{
	//hasA
	WashingTub washingTub =new WashingTub(); //hasA
	
	Laundry wash(int i, Cloth c[], Water w, WashingPowder wp, Electricity e) {
		System.out.println("Washing....."+Arrays.toString(c)+" from "+i+ " mnts");
		System.out.println("Using "+w.capacity+ " ltrs water...");
		System.out.println("Using "+wp.quantity+" grams of " +wp.brand+ " washing powder ...");
		System.out.println("Using "+e.costPerUnit+" Rs. cost per unit of " +e.provider+ " energy provider ...");

		rinse(i-5) ;
		float amount = (c.length * e.costPerUnit) + (w.capacity / 5) + (wp.quantity/2);
		Laundry laundry = new Laundry(amount);
		return laundry; //return the object as per the return type promise
	}
	void rinse(int i) {
		System.out.println("Rinsing....."+i+" mnts ...");
		spin(i-5);
	}
	void spin(int i) {
		System.out.println("Spinning...."+i+" mnts ..");
	}
}
class Tub { }
class WashingTub  extends Tub
{
	
}
/*----------------------*/

class Powder { }
class WashingPowder extends Powder
{
	String brand;
	int quantity;
	
	WashingPowder(String b, int q) {
		brand = b;
		quantity = q;
	}
}
/*----------------------*/
class Cloth { 
	String clothCategory;
	
	Cloth(String cc) {
		this.clothCategory = cc;
	}
	
	public String toString() {
		return clothCategory;
	}
}
/*----------------------*/

class Electricity { 
	String provider;
	int costPerUnit;
	
	Electricity(String p, int c) {
		provider = p;
		costPerUnit = c;
	}
}
/*----------------------*/

class Water {
	int capacity;
	
	Water(int c)
	{
		capacity = c;
	}
 }
/*----------------------*/

class Laundry { 
	float billAmount;
	
	Laundry(float b) {
		billAmount = b;
	}
	void showBill()
	{
		System.out.println("Laundry Bill  : "+billAmount+" Rs.");
	}
}


