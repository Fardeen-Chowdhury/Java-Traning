package oop;

public class BankAccountApp {
	// Creating new Bank account >> think instantion an object;
	
	public static void main (String [] args) {

	BankAccount acc1 = new BankAccount();
	acc1.accountNumber="123456789";
	acc1.setName("Fardeen Chowdhury");
	acc1.setRate();
	
	LoanAccount loan = new LoanAccount();
	loan.setRate();
	loan.increaseRate(); 
 /*	System.out.println(acc1.getName());
	acc1.deposit(500);
	acc1.deposit(500);
	acc1.deposit(500);
	acc1.deposit(500);
	acc1.withdrew(500);
	
	System.out.println(acc1.toString()); */
	/*
	BankAccount acc2 = new BankAccount("checking");
	
	BankAccount acc3 = new BankAccount("checking", 9999);
	
*/
		/*	CDAccount cd1 = new CDAccount();
	cd1.compount();
	cd1.name="Fardeen";
	cd1.interestRate = "4.5";
	cd1.balance=3000;
	cd1.accountType= "CD Account";
	System.out.println(cd1.toString());*/
	
	}

}
