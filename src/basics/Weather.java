package basics;

public class Weather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempeture = 50;
		String sunCondition = "sunny";
		
		if (tempeture >= 80) {
			System.out.println("wear short and T-shirt");
		}
		else if (tempeture > 60 && (sunCondition == "sunny")) {
			System.out.println("wear long sleeve and jeans");
			System.out.println("wear a hat");
		}
		else if (tempeture >= 50 || (sunCondition == "Overcast")) {
			System.out.println("cold day make sure you wear something warm");
			
		}
		else {
			System.out.println("wear something warm");
		}
		
		System.out.println("Let me end please");
	}

}
