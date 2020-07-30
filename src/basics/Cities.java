package basics;

public class Cities {

	public static void main(String[] args) {

		String[] cities = {"New York", "San Fransico", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);

		String[] states = new String[7];
		states[0]="California";
		states[1]="Ohio";
		states[2]="New York";
		states[3]="Texas";
		states[4]="Utha";
		states[5]="New Jersey";
		states[6]="Maryland";
		int i =0;
		System.out.println("************");
		do {
		System.out.println(states[i]);
		i= 1+i; 
		} while (i<7);
		
		
		System.out.println("seraching stsate ************");
		int n=0;
		boolean stateFound = true;
		while (stateFound) {
			String state = states[n];
			n++;
			if (state == "New York") {
				System.out.println(state + " has Found");
				stateFound= false;
			}
		}
		System.out.println("********* trying out for loop");
		for (int j=0; j<7; j++ ) {
			System.out.println(states[j]);
		}
		
		String[] countries = new String[2];
		countries[0]="USA";
		countries[1]="Bangladesh";
		
		System.out.println(countries[1]);
		
	}

}
