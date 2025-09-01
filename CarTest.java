
public class CarTest {
	public static void main(String[] args) //throws CarKeyNotFoundException
	{
		
		System.out.println("Begin main");
		
		//Unhandled exception type CarKeyNotFoundException
		Car car;
		try {
			car = new Car();
			car.startTheCar();
			
		} catch (CarKeyNotFoundException e) {
			
			System.out.println("Car Problem :  "+e.getMessage());
		}
		finally {
			System.out.println("Journey is over....");
		}
		
		System.out.println("End main");
			
	}
}

class Car
{
	boolean carKeyFound = false;
	
	Car() throws CarKeyNotFoundException 
	{
		double val = Math.random()%10;
		System.out.println(val);
		if(val > 0.50) {
			carKeyFound = true;
		} else {
			carKeyFound=false;
			//Unhandled exception type CarKeyNotFoundException
			throw new CarKeyNotFoundException("Car key is missing...");
		}
	}
	
	void startTheCar() {
		if(carKeyFound == true) {
			System.out.println("Car started....");
			longDrive();
		}
		else {
			//System.out.println("Car key not found...");
			throw new RuntimeException("Car Key Not found....");
		}
	}
	
	void longDrive() {
		
		System.out.println("longDrive() started....");

		for(int i=1;i<=30;i++) {
			System.out.println("Journey completed : "+i+" kms");
			double val = Math.random()%10;
			if(val>0.95) {
				//System.out.println("\t\tSpeed limit challan is cut....");
				throw new SpeedLimitException("\t\tSpeed limit exceeded 80kmh...");
			}
			
			if(val> 0.25 && val <0.35) {
				//System.out.println("\t\tSpeed limit challan is cut....");
				throw new SpeedBreakerException("\t\t\t\tSpeed breaker exception....");
			}
			
		}
		
		System.out.println("longDrive() finished....");

	}
}

class SpeedLimitException extends RuntimeException //unchecked
{
	SpeedLimitException(String str) {
		super(str);
	}
}
class SpeedBreakerException extends RuntimeException //unchecked
{
	SpeedBreakerException(String str) {
		super(str);
	}
}

class CarKeyNotFoundException extends Exception //checked
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}

