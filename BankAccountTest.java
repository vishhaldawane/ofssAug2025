
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount bankAccObj1 = new BankAccount(101,"Jack",50000,"SBI");
		bankAccObj1.showBankAccount();
		bankAccObj1.withdraw(5000.0,12); //default fractional value is of double
		bankAccObj1.showBankAccount();
		
	}
}
class BankAccount {
	
	//encapsulation
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public  String bankName;

	public BankAccount(int accountNumber, String accountHolder, double accountBalance, String bankName) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.bankName = bankName;
	}
	
	public void showBankAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Name    : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account Bank    : "+bankName);
	}
	/*---------below number of args 1, but type differs ----*/
	public void withdraw(double amountToWithdraw) {
		System.out.println("withdraw(double)");
		accountBalance = accountBalance - amountToWithdraw;
	}
	public void withdraw(float amountToWithdraw) {
		System.out.println("withdraw(float)");

		accountBalance = accountBalance - amountToWithdraw;
	}
	/*------above number of args 1, below it is 2----*/
	public void withdraw(double amountToWithdraw, int hour) {
		System.out.println("withdraw(double,int)");

		System.out.println("Withdrawing at "+hour+" HOUR of the Day");
		accountBalance = accountBalance - amountToWithdraw;
	}
	/*------below types are same, but sequence matters------*/
	public void withdraw(double amountToWithdraw, String day) {
		System.out.println("withdraw(double,String)");

		System.out.println("Withdrawing on "+day);
		accountBalance = accountBalance - amountToWithdraw;
	}
	public void withdraw(String day, double amountToWithdraw) {
		System.out.println("withdraw(String,double)");

		System.out.println("Withdrawing on "+day);
		accountBalance = accountBalance - amountToWithdraw;
	}
	
	
	
	
}