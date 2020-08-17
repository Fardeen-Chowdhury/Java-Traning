package exceptionFile;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		
		double payment = 0; 
		boolean positivePayment = true;
		
		Scanner in= new Scanner(System.in);
		do {
			System.out.print("Enter a payment amount ");
		try {
			payment = in.nextDouble();
			if (payment < 0) {
			        throw new NegativePaymentException(payment);        
		}
			else {
				positivePayment = true;
			}
	} catch (NegativePaymentException e) {
		System.out.println("Error" + e.toString());
		positivePayment = false;
	}
		}while(!positivePayment);
        
		System.out.println("Thank you for your payment " + payment);
		
}
}