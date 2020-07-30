package oop;

public class BankAccount implements IRate  {
	 String accountNumber;
	private static final String routingNumber= "12345";
	private String name;
	String ssn;
	String accountType;
	double balance = 0;
	//Constructor definition: unique methods
	BankAccount(){
		System.out.println("New Bank account");
	}
	
	//overload
	BankAccount(String accountType){
	System.out.println("New Account " + accountType);	
	}
	
	BankAccount(String accountType, double money){
		System.out.println("New Account " + accountType);
		System.out.println("Deposit is " + money);
		String msg= null;
		if (money > 1000) {
		msg = "Error: Deposit has to be less than $1000";	
		} else {
			msg = "Thank you for your Deposit $" + money;
			balance = balance + money;
		}
		
		System.out.println(msg);
		
	}
	
	//Define methods
	public void deposit(double amount) {
		System.out.println("Making a deposit of $" + amount);
		balance = balance + amount;
		showActivity("Deposite");
	}
	
	void withdrew(double amount) {
		System.out.println("Making a Withdraw of $" + amount); 
		balance = balance - amount;
		showActivity("Withdraw");
		
	}
	private void showActivity(String transactionType) {
		System.out.println("show recent Activity " + transactionType);
		System.out.println("Current balance is: " + balance);
	}
	
	public void setRate() {
		System.out.println("Rating");
	}
	public void increaseRate() {
		System.out.println("Increase rate");
		
	}
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
    
	@Override
	public String toString() {
		super.toString();
		return "[ " + name + ", Account Number " + accountNumber +", Rounting #:"+ routingNumber +", Balance: $" + balance + " ]";
    	
    }
	void getStaust() {
		
	}
	public void setName(String name) {
		this.name =name;
	}
	public String getName () {
		return name;
	}
}
