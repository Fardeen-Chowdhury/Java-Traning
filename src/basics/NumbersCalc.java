package basics;

public class NumbersCalc {
	public static void main(String[] arg) {
		System.out.println("Program is starting");
		printName();
		int numA = 10;
		int numB = 20;
		addNumbers(numA, numB);
		System.out.println(multiplyNumbers(numA, numB));
	}
	
	static void printName() {
		System.out.println("My Name id Fardeen");
	}
	
	static void addNumbers(int NumberA, int NumberB) {
		int sum = NumberA + NumberB;
		System.out.println("Sum of Numbers " + NumberA + " and " + NumberB + " is " + sum);
		
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB; 
		addNumbers(product, product);
		return product;
		
	}

}
