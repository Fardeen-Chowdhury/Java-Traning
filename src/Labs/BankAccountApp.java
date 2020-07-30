package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount ("465329874", 1000);
		BankAccount acc2 = new BankAccount ("765488755", 2000);
		BankAccount acc3 = new BankAccount ("986647894", 3000);
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
		
	}
	
}

class BankAccount implements IInterest {
	//Properties of bank account
	private static int id = 1000; // Internal ID
	private String accountNumber; //ID + random 2-digit number + first 2 of SSN
	private static final String rountingNumber= "005400657";
	private String name;
	private String SSN;
	private double balance;
	
	public BankAccount (String SSN, double initDeposit) {
		balance = initDeposit;
		System.out.println("New Account Created");
		this.SSN=SSN;
		id++;
		setAccountNumber();
		
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random()*100); 
		System.out.println(random);
		accountNumber = id + "" +  random + SSN.substring(0,2);
		System.out.println(accountNumber);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void payBill(double amount) {
		balance = balance-amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
		
	}
	public void makeDeposit (double amount) {
		System.out.println("Making Deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: "+ name + " ]\n[Acccount Number: " + accountNumber + "]\n" + "[Rounting Number: " + rountingNumber + "\n" + "[Balance: " + balance + "]" ;
		
	}
}
