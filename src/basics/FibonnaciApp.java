package basics;

public class FibonnaciApp {
	
	public static void main (String[] arge) {
	//Fibonnaci number is to find sum of 2 previous number
	// fib(0)=0	
	// fib(1)=1
	// fib(2)= fib(0) + fib (1) = 0 + 1 = 1	
		System.out.println(fib(6));
		System.out.println(something(2));
	}

	
	public static int fib(int n) {
		if (n == 0){
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		System.out.println("fib " + n);
		return (fib(n-1) + fib(n-2));
	}
	public static int something(int n) {
		
		if (n==0) {
			return 0;
		}
		if (n==0) {
			return 0;
		}
		System.out.println(n + " something( n - " +(n-1) + ")" );
		return (something(n-1)+ n);
	}
}
