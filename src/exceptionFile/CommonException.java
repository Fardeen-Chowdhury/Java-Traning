package exceptionFile;

public class CommonException {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//1. Identify the potential problem area
		//2. surround with try-catch block
		
		try {
		int c = a/b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot Divide by Zero");
			System.out.println(e.toString());
		}
		
		String[] states = {"CA","NY","NJ","PA"};
		
		for(int i=0; i<6; i++) {
			try {
			System.out.println(states[i]);
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of Index");
				System.out.println(e.toString());
			}finally {
				System.out.println("Iterating thorugh Array");
			}
		}
		System.out.println("program is closing");

	}

}
