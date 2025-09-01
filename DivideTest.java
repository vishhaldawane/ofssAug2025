import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DivideTest {
	public static void main(String[] args) {
		System.out.println("Begin Main\n");
//Unhandled exception type FileNotFoundException
		
		try {
			FileInputStream fin = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("file is ready...");
		
		try
		{
			Calculator calci1 = null;//new Calculator(310, 10);
			calci1.divide();
		}
		catch(ArithmeticException e) {
			System.out.println("Division problem : "+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Some problem : "+e.getMessage());
		}

		System.out.println("-----------------");
		
		try
		{
			Calculator calci2 = new Calculator(310, 0);
			calci2.divide();
		}
		catch(ArithmeticException e) {
			System.out.println("Division problem : "+e.getMessage());
		}
		
		System.out.println("-----------------");
		
		Calculator calci3 = new Calculator(310, 30);
		calci3.divide();
		
		System.out.println("End Main\n");
	}
}
class Calculator
{
	int nume;
	int deno;
	public Calculator(int nume, int deno) {
		super();
		this.nume = nume;
		this.deno = deno;
	}
	void divide() {
		System.out.println("Dividing "+nume+ " by "+deno);
		int ans = nume / deno;
		System.out.println("Division : "+ans+"\n");
	}
	
	
}