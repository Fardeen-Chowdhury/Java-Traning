package exceptionFile;

public class NegativePaymentException extends Exception {
	double payment;
	public NegativePaymentException(double payment) {
	// 	System.out.println("ERROR: negative payment");
		this.payment = payment;
	}
	
	
	public String toString() {
		return "Error Cann't take negative payment " + payment;
		
	}
	

}
