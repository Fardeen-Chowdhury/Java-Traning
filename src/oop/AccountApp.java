package oop;

public class AccountApp {

	public void main (String[] args) {
		LoanAccount lon = new LoanAccount();
		lon.setRate();
		lon.increaseRate();
		lon.setAmmortSchedule();
		lon.setTerm(20);
		
		// Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate(); 
	}
}
