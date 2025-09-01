
public class FundTransferTest {
	public static void main(String[] args) {
		
		CurrentAccount oracleCurrAcc = new CurrentAccount(500000);
		
		SavingsAccount savAcc1 = new SavingsAccount(3000);
	
		oracleCurrAcc.show();
		savAcc1.show();
		
		double transactionAmt=45000;
		FundsTransferService fts = new FundsTransferService();
		fts.transferFunds(oracleCurrAcc, savAcc1, transactionAmt);
		
		
		oracleCurrAcc.show();
		savAcc1.show();
	}
}
class FundsTransferService
{
	void transferFunds(Withdrawing x, Depositing y, double amt)
	{
		System.out.println("-----tranferring funds---");
		x.withdraw(amt);
		y.deposit(amt);
		System.out.println("---funds transferred-----");

	}
}
interface Withdrawing
{
	void withdraw(double amt);
}
interface Depositing
{
	void deposit(double amt);
}

class CurrentAccount implements Withdrawing, Depositing
{
	private double balance;
	CurrentAccount(double d) {
		balance = d;
	}
	public void withdraw(double amt) {
		balance -= amt;
	}
//Cannot reduce the visibility of the inherited method from Depositing
	public void deposit(double amt) {
		balance += amt;
	}
	void show() {
		System.out.println("CA : Balance : "+balance);
	}
}
class SavingsAccount implements Withdrawing, Depositing
{
	private double balance;
	SavingsAccount(double d) {
		balance = d;
	}
	public void withdraw(double amt) {
		balance -= amt;
	}
	public void deposit(double amt) {
		balance += amt;
	}
	void show() {
		System.out.println("SA : Balance : "+balance);
	}
}