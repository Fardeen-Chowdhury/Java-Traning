package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String career; 
		System.out.println("Program is starting");
		
		career= "Software Developer";
		System.out.println("My Career: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 2;
		double rate = 45;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year. ");
	}

}
